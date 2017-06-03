
public class student {
	
	String fname;
	String lname;
	int rollNo;
	
	public void printDetails(){
		System.out.println(fname + " -> " + lname + " -> " + rollNo);
	}
	
	public student(String firstname, String lastname, int rollNumber){
		fname=firstname;
		lname=lastname;
		rollNo=rollNumber;
		
		printDetails();
	}
	/*
	public student(String fname, String lname, int rollNo){
		this.fname=fname;
		this.lname=lname;
		this.rollNo=rollNo;
		
		printDetails();
	}
	*/
	public student(){
		System.out.println("Object is created");
	}
	
	
	

}
