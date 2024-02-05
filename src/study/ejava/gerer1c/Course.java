package study.ejava.gerer1c;

import study.ejava.object.Student;

public class Course {

	public static void registerCourse1(Applicant<?> applicant) {
		System.out.println(applicant.kind.getClass().getSimpleName() + "이가 Course1를 등록");
	}

	public static void registerCousre2(Applicant<? extends Student> applicant) {
		System.out.println(applicant.kind.getClass().getSimpleName() + "이가 course2 등록 ");
	}

	public static void registerCourse3(Applicant<? super Person.Worker> applicant) {
		System.out.println(applicant.kind.getClass().getSimpleName() + "이(가) Course3 등록");
	}
}
