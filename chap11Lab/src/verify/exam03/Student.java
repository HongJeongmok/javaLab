<<<<<<< HEAD
package verify.exam03;

public class Student {
	private String studentNum;
    public Student(String studentNum) {
              this.studentNum = studentNum;
    } 
    public String getStudentNum() {
              return studentNum;  } 
    // 작성 위치  
	@Override
	public int hashCode() {
		return studentNum.hashCode();
	}
	@Override
	public boolean equals(Object obj) {
		Student student = (Student) obj;  // 강제형 변환, Object -> Student
		if (studentNum.equals(student.getStudentNum())) {
			return true;
		}
		return false;
	}
}
=======
package verify.exam03;

public class Student {
	private String studentNum;
    public Student(String studentNum) {
              this.studentNum = studentNum;
    } 
    public String getStudentNum() {
              return studentNum;  } 
    // 작성 위치  
	@Override
	public int hashCode() {
		return studentNum.hashCode();
	}
	@Override
	public boolean equals(Object obj) {
		Student student = (Student) obj;  // 강제형 변환, Object -> Student
		if (studentNum.equals(student.getStudentNum())) {
			return true;
		}
		return false;
	}
}
>>>>>>> branch 'master' of https://github.com/HongJeongmok/javaLab.git
