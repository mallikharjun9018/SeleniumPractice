package newMalli;
class Onee{
	void firstMethod(){
	  System.out.println("FIRST METHOD");
	  
          class Two{
	      private  void secondMethod(){
	         System.out.println("SECOMD METHOD");
	  }
    }
           Two t1=new Two();
	       t1.secondMethod();
	}
}

     public class MethodInnerClass {
    	 public static void main(String[] args) {
			Onee o = new Onee();
			o.firstMethod();

		}

}
