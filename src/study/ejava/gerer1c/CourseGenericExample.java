package study.ejava.gerer1c;

import study.ejava.object.Student;

public class CourseGenericExample {
	public static void main(String[] args) {

		Course.registerCourse1(new Applicant<Person>(new Person()));
		Course.registerCousre2(new Applicant<>(new Student()));
	}
}
