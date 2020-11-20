class Student
{
	int rollNo;
	String name;
	LocalDate dateOfBirth;

	Student()
	{

	}
	Student(int rollNo,String name)
	{

	}

	Student(int rollNo,String name,LocalDate dateOfBirth)
	{

	}
	int getRollNo()
	{

	}
	void setRollNo(int rollNo)
	{

	}
	String getName()
	{

	}
	void setName(String name)
	{

	}
	


}








Student student1= new Student();
Student student2= new Student(1,"John");
Student student3= new Student(1,"John",LocalDate.of(2000,10,09));