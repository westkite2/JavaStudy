package classpart;

public class Student {
	int studentID;
	String studentName;
	int grade;
	String address;
	
	//public Student() {}
	
	public Student(int id, String name) {
		studentID = id;
		studentName = name;
	}
	
	public void showStudentInfo() {
		System.out.println(studentName + "," + address);
	}
	
	public String getStudentName() {
		return studentName;
	}
	
	public void setStudentName(String name) {
		studentName = name;
	}
	
	public static void main(String[] args) {
		//not Student's method
		Student studentLee = new Student(2022, "�輼��");
		studentLee.studentName = "�̼���";
		studentLee.address = "�����";
		studentLee.showStudentInfo();
	}
}
