class C {
	public void run() {
		System.out.println("i m a CR");
	}

	public void fly() {
		System.out.println("i m a CF");
	}
}

class D extends C {
	public void run() {
		System.out.println("i m a DR");
	}

	public void wish() {
		System.out.println("i m a DF");
	}
}

public class Inh {
	public static void main(String[] args) {
		C c1 = new C();
		c1.run();
		c1.fly();
		C c2 = new D();
		c2.run();
		c2.fly();
		D d1 = (D) c2;
		d1.run();
		d1.fly();
		d1.wish();
	}
}
// git pull first

