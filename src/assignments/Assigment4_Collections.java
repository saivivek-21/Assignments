package assignments;

import java.util.ArrayList;
import java.util.List;

public class Assigment4_Collections {

	public static void main(String[] args) {
		
		List<String> Employee_ID = new ArrayList<String>();
		Employee_ID.add("E001");
		Employee_ID.add("E002");
		Employee_ID.add("E003");
		//Name
		List<String> Name = new ArrayList<String>();
		Name.add("Alice Green");
		Name.add("Bob Johson");
		Name.add("Carol White");
		//Age
		List<Integer> Age = new ArrayList<Integer>();
		Age.add(20);
		Age.add(35);
		Age.add(28);
		//Gender
		List<String> Gender = new ArrayList<String>();
		Gender.add("Female");
		Gender.add("Male");
		Gender.add("Female");
		//Department
		List<String> Department = new ArrayList<String>();
		Department.add("Engineering");
		Department.add("Marketing");
		Department.add("Sales");
		//Position
		List<String> Position = new ArrayList<String>();
		Position.add("SoftwareEngineer");
		Position.add("SoftwareEngineer");
		Position.add("SoftwareEngineer");
		//Salary
		List<Integer> Salary = new ArrayList<Integer>();
		Salary.add(75000);
		Salary.add(85000);
		Salary.add(65000);
		//Email
		List<String> Email = new ArrayList<String>();
		Email.add("alice@example.com");
		Email.add("bob@example.com");
		Email.add("carol@example.com");
		//ContactNumber
		List<Double> ContactNumber = new ArrayList<Double>();
		ContactNumber.add(9876543213d);
		ContactNumber.add(9876543214d);
		ContactNumber.add(9876543215d);
		
		System.out.println(Email.get(1));
		
		
		
		}

}
