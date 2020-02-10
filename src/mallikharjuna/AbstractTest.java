package mallikharjuna;
  abstract class RedMi{
	  public void inbox(){
		 System.out.println("REDMI INBOX");	   
   }
      public void sendbox(){
    	System.out.println("REDMI SENDBOX");  
   }
      abstract public void draftbox();
      abstract public void outbox();
   }
           class SamSung extends RedMi{
    	  
    	    public void deletebox(){
    	      System.out.println("SAMSUNG DELETE BOX"); 	 
    }
    	     @Override
    	     public void draftbox(){
    	       System.out.println("OVER RIDE AND SAMSUNG DRAFT BOX");
    }
    	     public void outbox(){
    	    	System.out.println("OVERRIDE ANDD SAMSUNG OUTBOX"); 
    } 	     
  }
               class Nokia extends SamSung{
                	  
                  }
public class AbstractTest {

	public static void main(String[] args) {
       System.out.println("MY MOBILESSSSSSSSSSSSSSS");
       
       SamSung s=new SamSung();
	   s.inbox();
	   s.sendbox();
	   s.deletebox();
	   s.draftbox();
	   s.outbox();
	}

}
