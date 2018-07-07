class XA {
	public void display() {
		System.out.println("anand");
	}
}

class k extends XA{

	public void display() {
		super.display();
		System.out.println("kumar");
	}
}

public class H {

	public static void main(String[] args) {

		XA a1 = new k();

		a1.display();
	}
}
