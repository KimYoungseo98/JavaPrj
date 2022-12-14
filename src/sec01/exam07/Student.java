package sec01.exam07;

public class Student {
	public int sno;
	public String name;

	public Student(int sno, String name) {
		this.sno = sno;
		this.name = name;
	}

	public boolean equals(Object obj) {
		if (obj instanceof Student) {
			Student student = (Student) obj;
			return (sno == student.sno) && (name.equals(student.name)); // 학번과 이름이 같다면 true
		} else {
			return false;
		}

	}

	public int hashCode() { //학변과 이름이 같다면 동일한 값을 리턴
		return sno + name.hashCode();
	}

}
