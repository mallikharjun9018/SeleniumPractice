package mallikharjuna;
 abstract class ManojKotak{
	  int id=1234;
	public void cashwithDraw(){
		System.out.println("KOTAK CASH WITHDRAW");
	}
	public void cashDeposit(){
		System.out.println("KOTAK CASH DEPOSIT");
	}
	abstract public void fastDraw();
	abstract public void pinChange();
	public abstract void ministmt();
  }
    
        interface sbiBank{
    	 void cashwithDraw();
    	 void cashDeposit();
        }
        interface sbhBank{
    	 void balanceCheck();
    	 void fastDraw();
    }
          class KotakOne extends ManojKotak{
          public KotakOne()
          {
       pinChange();
       this.cashDeposit();
          }
      	  public void pinChange(){
      		  System.out.println("KOTAK PIN CHANGE INTO = 9999");
      	  }
      	public void cashDeposit(){
    		System.out.println("Override KOTAK CASH DEPOSIT");
    	}
           
    	      public void fastDraw(){
    		   System.out.println("KOTAK FAST DRAW IS 10000");
    	  }
    	  @Override
    	    public void ministmt() {
    	   System.out.println("mini stmt");
    	  }
     } 
    	
    	class SbiOne extends KotakOne implements sbiBank, sbhBank{
    	   public void cashwithDraw(){
    		 System.out.println("SBI CASH WITH DRAW");  
    	   }
    	   public void cashDeposit(){
    		   System.out.println("SBI CASH DEPOSIT");
    	   }
    	   public void balanceCheck(){
    		   System.out.println("SBI BALANCE CHECK");
    	   }
    	   public void fastDraw(){
    		   System.out.println("SBI FAST DRAW");
    	   }
    	   public SbiOne(){
    		   cashDeposit();
    		   cashwithDraw();
    		   balanceCheck();
    		   fastDraw();
    	   }
    	}

        public class SeleniumOne {
         public static void main (String [] args){
           //KotakOne KT=new KotakOne();
        //sbiBank sb=new SbiOne();
        //sbhBank sh= new SbiOne();
        //SbiOne sb1=new SbiOne();
        	 //KotakOne sb2=new SbiOne();
        KotakOne kb=new SbiOne();
             
          
         }
}
