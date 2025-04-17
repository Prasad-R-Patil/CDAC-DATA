package session_03;

import java.util.Scanner;

public class Student {
		private int rollNo;
		private String name;
		private float m1,m2,m3;
		
		public Student(int rn,String nm,float m1,float m2,float m3)
		{
			rollNo=rn;
			name=nm;
			this.m1=m1;
			this.m2=m2;
			this.m3=m3;
		}

		
		public int getRollNo() {
			return rollNo;
		}

		public void setRollNo(int rollNo) {
			this.rollNo = rollNo;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public float getM1() {
			return m1;
		}

		public void setM1(float m1) {
			this.m1 = m1;
		}

		public float getM2() {
			return m2;
		}

		public void setM2(float m2) {
			this.m2 = m2;
		}

		public float getM3() {
			return m3;
		}

		public void setM3(float m3) {
			this.m3 = m3;
		}

		
		public String toString() 
		{
			
			return "Student => " + rollNo + "  " + name + " " + m1 + " " + m2 + " " + m3+" " ;
			
		}
		
		
		public static void getMarkesObtained(Student std[])
		{
			for(int i=0;i<std.length;i++)
			{
				System.out.println("----------------------------------------------------------------------");
				System.out.println(std[i]+ " "+(std[i].getM1()+std[i].getM2()+std[i].getM3()));
				System.out.println("----------------------------------------------------------------------");
			}
		}
		
		
		
}
