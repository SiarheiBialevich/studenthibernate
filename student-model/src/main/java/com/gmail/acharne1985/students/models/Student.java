package com.gmail.acharne1985.students.models;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "student", catalog = "homework1")
public class Student {

	@Column(name = "studentName", length = 50)
	private String name;

	@Column(name = "surname", length = 50)
	private String surname;

	@Column(name = "age")
	private Integer age;

	@Column(name = "sex")
	private String sex;

	@OneToMany(mappedBy = "student")
	private List<Section> sectionList;

	public Student() {

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public List<Section> getSectionList() {
		return sectionList;
	}

	public void setSectionList(List<Section> sectionList) {
		this.sectionList = sectionList;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;

		Student student = (Student) o;

		if (name != null ? !name.equals(student.name) : student.name != null) return false;
		if (surname != null ? !surname.equals(student.surname) : student.surname != null) return false;
		if (age != null ? !age.equals(student.age) : student.age != null) return false;
		if (sex != null ? !sex.equals(student.sex) : student.sex != null) return false;
		return sectionList != null ? sectionList.equals(student.sectionList) : student.sectionList == null;
	}

	@Override
	public int hashCode() {
		int result = name != null ? name.hashCode() : 0;
		result = 31 * result + (surname != null ? surname.hashCode() : 0);
		result = 31 * result + (age != null ? age.hashCode() : 0);
		result = 31 * result + (sex != null ? sex.hashCode() : 0);
		result = 31 * result + (sectionList != null ? sectionList.hashCode() : 0);
		return result;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Student [studentName= ");
		sb.append(name);
		sb.append(", surname= ");
		sb.append(surname);
		sb.append(", age= ");
		sb.append(age);
		sb.append(", sex= ");
		sb.append(sex);
		sb.append(", sectionsList= ");
		sb.append(sectionList);
		sb.append("]");

		return sb.toString();
	}
}
