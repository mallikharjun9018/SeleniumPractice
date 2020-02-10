package newMalli;

  class Two{
    String name;
	int salary;
	
  public Two(){

  }
     public void method2(){
		System.out.println("METHOD 2 "  +name+ " ," +salary);
	
   }	
     public Two(int salary, String name){
	   System.out.println("1st const "  +this.salary+ " ," +name);
	   method2();
  }
}
    class One extends Two{
      
      public One(){
        this(100,"Arjun");
	    display1();
	    System.out.println("DEFAULT CONSTRUCTOR");
}
 public One(String name){
	super(400 , "manoj");
	
	 System.out.println("my name is = " +name);
 }
   public One(int salary,String name){
	   this("EMKR");
    this.name=name;
     salary=salary;
     System.out.println("constructor name & sal = " +name+ " ," +this.salary);
	   
 }
  public void display1(){
	 System.out.println("my name & salary are = " +name+ " ," +salary); 
 }	
}

public class ConstrctTest {
	public static void main(String[] args) {
		
	One o=new One();
	//Two t=new Two();
	}

}
