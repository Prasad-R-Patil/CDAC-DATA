package Assignment_02;

public class Student {

	private String name;
	private int rollNo;
	private int age;
	private int score;
	
	public Student()
	{
		
	}
	
	public Student(String nm,int rn,int ag,int sc)
	{
		name=nm;
		rollNo=rn;
		age=ag;
		score=sc;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	
	
}
