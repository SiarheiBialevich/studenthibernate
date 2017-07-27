package com.gmail.acharne1985.students.models;

import javax.persistence.*;

@Entity
@Table(name = "section", catalog = "homework1")
public class Section {

	@Column(name = "nameSection")
	private String name;

	@Column(name = "address")
	private String address;

	@Column(name = "phone")
	private Integer phone;

	@ManyToOne
	@JoinColumn(name = "student_id")
	private Student student;

	public Section() {

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Integer getPhone() {
		return phone;
	}

	public void setPhone(Integer phone) {
		this.phone = phone;
	}

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;

		Section section = (Section) o;

		if (name != null ? !name.equals(section.name) : section.name != null) return false;
		if (address != null ? !address.equals(section.address) : section.address != null) return false;
		if (phone != null ? !phone.equals(section.phone) : section.phone != null) return false;
		return student != null ? student.equals(section.student) : section.student == null;
	}

	@Override
	public int hashCode() {
		int result = name != null ? name.hashCode() : 0;
		result = 31 * result + (address != null ? address.hashCode() : 0);
		result = 31 * result + (phone != null ? phone.hashCode() : 0);
		result = 31 * result + (student != null ? student.hashCode() : 0);
		return result;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Sections [nameSection= ");
		sb.append(name);
		sb.append(", address= ");
		sb.append(address);
		sb.append(", phone= ");
		sb.append(phone);
		sb.append(", studentId= ");
		sb.append(student);
		sb.append("]");

		return sb.toString();
	}
}
