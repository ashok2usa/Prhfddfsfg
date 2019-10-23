package model;

public class SwathiMain {

public static void mian(String args[]) {
	
	Swathi1 swathi = new Swathi1();
	
	swathi.setFirstName("Swathi");
	swathi.setLastName("abc");
	swathi.setText("Hello");
	swathi.setDob(null);

	System.out.println("My first name is " + swathi.getFirstName());
	System.out.println("My Last name is " + swathi.getLastName());
	System.out.println("My text name is " + swathi.getText());
	System.out.println("My D name is " + swathi.getDob());

	
}
}
