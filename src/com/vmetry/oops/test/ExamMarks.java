package com.vmetry.oops.test;

public class ExamMarks {
	int sub1, sub2, sub3;
	char grade1, grade2, grade3;

	public void markEntry(int mySub1, int mySub2, int mySub3, char myGrade1, char myGrade2, char myGrade3) {
		sub1 = mySub1;
		sub2 = mySub2;
		sub3 = mySub3;
		grade1 = myGrade1;
		grade2 = myGrade2;
		grade3 = myGrade3;
	}

	public void diplayMark() {
		System.out.println("SUBJECT 1:" + sub1);
		System.out.println("GRADE 1:" + grade1);
		System.out.println("SUBJECT 2:" + sub2);
		System.out.println("GRADE 2:" + grade2);
		System.out.println("SUBJECT 3:" + sub3);
		System.out.println("GRADE 3:" + grade3);
	}
}
