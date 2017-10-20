import java.util.*;

public class StudentList {
	
	private Student[] list;
	
	public StudentList() {
		Scanner scnr = new Scanner(System.in);
		int numStudents;
		String last, first;
		int grade;
		double gpa;
		System.out.print("How many students? ");
		numStudents = scnr.nextInt();
		System.out.println();
		list = new Student[numStudents];
		for (int i = 0; i < numStudents; i++) {
			System.out.println();
			System.out.println("STUDENT " + i + "...");
			System.out.print("First Name: ");
			first = scnr.nextLine();
			System.out.print("Last Name: ");
			last = scnr.nextLine();
			System.out.print("Grade Level: ");
			grade = scnr.nextInt();
			System.out.print("GPA: ");
			gpa = scnr.nextDouble();
			list[i] = new Student(first, last, grade, gpa);
		}
		scnr.close();
	}
	
	public String toString() {
		String outString = "";
		for (Student stu : list) {
			outString += stu.toString() + "\n";
		}
		outString += "\n";
		return outString;
	}
	
	public void bubbleSort() {
		// Your implementation here
		// Bubble sort the array called 'list'
	}

}
