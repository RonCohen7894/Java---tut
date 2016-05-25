public class Student
{
	public static int ID = 0;
	private String name;
	private int age;
	private int id;
	private String school;
	
	public Student(String Name, int Age, String School)
	{
        Student.ID++;
        this.id = ID;
		this.name = Name + "";
		this.age = Age;
		this.school = School + "";
	}
	
	public Student()
	{
		 Student.ID++;
	     this.id = Student.ID;
		this.name = "Ron" + "";
		this.age = 16;
		this.school = "Ironi D" + "";
	}
	public Student(Student student1)
	{
		 Student.ID++;
	     this.id = Student.ID;
		this.name = student1.name + "";
		this.age = student1.age;
		this.school = student1.school + "";
	}
	
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", id=" + id + ", school=" + school + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getSchool() {
		return school;
	}

	public void setSchool(String school) {
		this.school = school;
	}
	
	public int getID()
	{
		return this.id;
	}
	
	public void setID(int value)
	{
		this.id = value;
	}
}