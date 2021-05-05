package odev1;

public class Main {

	public static void main(String[] args) {
		Student student = new Student(1,"Elif","elifkubra@gmail.com","7070","Java");

		Instructor instructor=new Instructor(1, "Engin Demiroğ","demirog@gmail.com","4545" ,"Microsoft Certified Trainer (MCT) ,PMP ve ITIL sertifikalarýna sahibim.");

		StudentManager studentManager = new StudentManager();
		studentManager.startCourse(student);

		InstructorManager instructorManager =new InstructorManager();
		instructorManager.courseAdd(instructor);


	}

}