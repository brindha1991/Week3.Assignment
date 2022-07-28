package org.student;

public class Student extends org.department.Department{
	void studentName() {
		System.out.println("Brindha");
	}


	void studentDept() {
		System.out.println("Computer");
	}

	void studentID() {
		System.out.println("122344");
	}
	public static void main(String[] args) {
		org.student.Student c=new org.student.Student();
		c.collageCode();
		c.collageName();
		c.collageRank();
		c.deptName();
		c.studentDept();
		c.studentID();
		c.studentName();
	}

}
