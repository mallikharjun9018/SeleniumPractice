package mallikharjuna;

class A{
	public int methodOne(int num1) {
		System.out.println("firsst output");
		return 100;
	}
	public double methodThree(double num2) {
		System.out.println("firsst output");
		return 10.5;
	}
	public  String methodTwo(String name){
		System.out.println("2nd Output");
		return ("MAnoj");
	}
	public static void hai() {
	System.out.println("hai");	
	}
	public A(){
		//this.methodOne(1);
			//hai();
			//methodTwo("Malli");
			//methodThree(100);
			int a=10; int b=20;
			int res=a+b;
			System.out.println("resut:"+res);
			}
	}
class B extends A{
	
	public void hello() {
		
		System.out.println("hello");
	}
	@Override
	public int methodOne(int num1) {
		System.out.println("integer");
		return 0;
	}
}
public class ObjctRef {
	public static void main(String[] args){
		//A a=new B());
		A b= new B();
		
	}
}
