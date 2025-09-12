package college.dkte;
interface A{
	/*public abstract*/void f1();
	/*public abstract*/void f3();
}
interface B{
	/*public abstract*/void f2();
	/*public abstract*/void f3();
}

class C implements A ,B{
	@Override
	public void f1() {
		System.out.println("c.f1()");
	}
	
	@Override
	public void f2() {
		System.out.println("c.f2()");
	}
	@Override
	public void f3() {
		System.out.println("c.f3()");
	}
	
}
public class Demo4 {

	public static void main(String[] args) {
		A a = new C(); //up casting
		a.f1();
		a.f3();
		//a.f2(); error f2 is method of interface B
		B b = new C();
		b.f2();
		b.f3();
	}

}
