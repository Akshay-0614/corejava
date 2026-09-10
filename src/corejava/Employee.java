package corejava; 

// This program demonstrates : The Declaration of variables 
// Here i used different primitive data types

public class Employee {
	 byte Employee_Id=1;
	 int Employee_Age=23;
	 int Employee_salary=50000;
	  Float Employee_Grade=98.9f; //Float is used because the grade contains decimal value
	  int Yearsofexperience=15;
	  Boolean Employee_Active=true;//Boolean represents the employee's current status
	  int Numberofleaves;
	  long Employee_phno=934606952l;
	 
	void display() {
		
		//Deduct One leave before displaying the current balance
		Numberofleaves--;

		System.out.println("Employee Id : "+Employee_Id);
		System.out.println("Employee Age : "+Employee_Age);
		System.out.println("Employee Salary : "+Employee_salary);
		System.out.println("Employee Grade : "+Employee_Grade);
		System.out.println("Employee Year of Experience : "+Yearsofexperience);
		System.out.println("Employee Status : "+Employee_Active);
		System.out.println("Employee Leaves : "+Numberofleaves);
		System.out.println("Employee Phone Number : "+Employee_phno);
	}
	public static void main(String[] args) {
		
		//creating an employee object using the default constructor 
		Employee e1=new Employee();
		
		//Assigning the initial leave balance to the employee
		e1.Numberofleaves=5;
	
		//Calling display() to process and print employee details 
		e1.display();

	}

}
