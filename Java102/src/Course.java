
public class Course {
	
	String name;
	String code;
	String prefix;
	int note;
	
	public Course(String name, String code, String prefix) {
		this.name=name;
		this.code=code;
		this.prefix=prefix;
		this.note=0;
	}
	
	public static void CourseList() {
		String[] CourseList= {"Physic", "Chemistry", "Mathematics"};
		for(String CourseName: CourseList) {
			System.out.println(CourseName);
		}
	}
	public static void main(String[] args) {
		Course c1= new Course("Math-101", "Maths", "Maths");
		Course.CourseList();
	}
	

}
