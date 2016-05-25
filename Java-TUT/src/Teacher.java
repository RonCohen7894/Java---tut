public class Teacher
{
	public static int ID = 0;
	
	private String name;
	private int id = 0;
	private String school;
	private Student student;
	
	public Teacher()
	{
		ID++;
		this.id = Teacher.ID;
		this.name = "Amy";
		this.school = "Irodi D";
		this.student = new Student();
	}
	
	public Teacher(String Name, String School, Student s)
	{
		ID++;
		this.id = Teacher.ID;
		this.name = Name + "";
		this.school = School + "";
		this.student = new Student(s);
	}
	
	public Teacher(Teacher t)
	{
		ID++;
		this.id = Teacher.ID;
		this.name = t.name + "";
		this.school = t.school +"";
		this.student = new Teacher(t).student;
	}

	
	public String toString() {
		return "Teacher [name=" + name + ", school=" + school + ", student=" + student + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSchool() {
		return school;
	}

	public void setSchool(String school) {
		this.school = school;
	}

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}
	public int getID() {
		return this.id;
	}

	public void setID(int value) {
		this.id = value;
	}
}
