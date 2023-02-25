package javaselenium;

public class B {
	public static void main(String[] args) {
		A a1 = new A(10);
		int x = a1.getvalue();
		System.out.println(x);
		a1.setvalue(30);
		System.out.println(a1.getvalue());
	}
}
