package org.emp;

public class Employee {
	public void empId(String name) {
		System.out.println(""+ name);
	}
	public void empId( long phno, char block) {
System.out.println(""+ phno +"\n"+ block);
	}
			public void empId(int age) {
				// TODO Auto-generated method stub
System.out.println("" +age);
			}
			public void empId(boolean peremp) {
		
System.out.println("" + peremp);
			}
			public void empId(String Manager,String Project) {
		
System.out.println("" + Manager+"\n"+ Project);
			}
			public void empId(String email,float sal) {
			
System.out.println("" + email+"\n"+ sal);
			}
public static void main(String[] args) {
	Employee e=new Employee();
	e.empId("Dinesh");
e.empId ("dineshpethuraj03@gmail.com",35000.45f);
e.empId (8148224403l,'b');
e.empId (true);
e.empId("BOLT", "SELENIUM");
e.empId("21");
}
}



