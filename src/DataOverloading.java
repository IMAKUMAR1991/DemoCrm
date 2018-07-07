
class A{
 int i=35;	
void run(){
	System.out.println("    a     "+ i);

}
	
}
class B extends A{
 int i= 45;
	void wish(){
	System.out.println("   b    "+ i);
	}
	
	
	}
public class DataOverloading {

	public static void main(String[] args) {
	B b1 = new B();
	b1.wish();
    b1.run();
	}
}
