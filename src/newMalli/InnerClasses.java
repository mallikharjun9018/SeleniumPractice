package newMalli;

import newMalli.OutClass.InClass;

class OutClass{
	
	class InClass{
    	 void indisplay(){
		  System.out.println("INNER CLASS METHOD");
		}
	}
	  void outdisplay(){
		System.out.println("OUTER CLASS METHOD");
/*		InClass i3=new InClass();
		i3.indisplay();                           if inner class method is private  --3 */  
	}
}

   public class InnerClasses {
	   public static void main(String[] args) {
		OutClass o1=new OutClass();
		o1.outdisplay();                                    
		
/*		InClass i1 = new OutClass().new InClass();
//OR	OutClass().InClass i1 = new OutClass().new InClass();
		i1.indisplay();                                            --2  */                                     
		
         InClass i2 = o1.new InClass();
	     i2.indisplay();                                                
	}

}
