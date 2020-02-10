package mallikharjuna;

public class ConstOne {
	int age=23;
	String name="NANI";
 public ConstOne(){
	int age=34;
	String name="VENKY";
 }
	public void display(){
	//	int age=45;
	//	String name="ARJUN";
		System.out.println("My Name is " +name+ "  My Age is " +age);
	
}
	public static void main (String args[]){
		System.out.println("progrm was done");
		ConstOne CO=new ConstOne();
		CO.display();
		
	}
	
	

}
