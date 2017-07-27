package com.gmail.acharne1985.students.connector;


import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


public class HibernateConnector {

	private static HibernateConnector con;
	private Configuration cfg;
	private SessionFactory sessionFactory;

	private HibernateConnector() throws HibernateException {

		// build the config
		cfg = new Configuration().configure();

		sessionFactory = cfg.buildSessionFactory();
	}

	public static synchronized HibernateConnector getInstance() throws HibernateException {

		if (con == null) {
			con = new HibernateConnector();
		}

		return con;
	}

	public Session getSession() throws HibernateException {

		Session session = sessionFactory.openSession();

		if (!session.isConnected()) {
			this.reconnect();
		}

		return session;
	}

	private void reconnect() throws HibernateException {
		this.sessionFactory = cfg.buildSessionFactory();
	}
}
