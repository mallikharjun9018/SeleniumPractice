package mallikharjuna;

public class DemoOne {
 int id=3843;
 String name="manoj";
 public static void main(String[] args)
 {
	// DemoOne t1=new DemoOne();
	 DemoTwo t=new DemoTwo();
	 
 	 t.DemoFree(75,"Malli");
 }
}
class DemoTwo extends DemoOne
{
	public void DemoFree(int id1, String name1)
		 {
		this.id=id1;
		this.name=name1;
		System.out.println(id+ "...."+name);
		 }
	public DemoTwo()
	{
		System.out.println("Chaild number constructor");
	}
}