package reference;

public class Student {
	int studentID;
	String studentName;
	
	Subject korea;
	 
	public Student(int id, String name) {
		studentID = id;
		studentName = name;
		korea = new Subject();
	}
	public void setKorea(String name, int score) {
		korea.setSubjectName(name);
		korea.setScore(score);
	}
	public void showStudentInfo() {
		int total = korea.getScore();
		System.out.println(total);
	}
}
