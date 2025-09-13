package college.dkte;
abstract class A1{
	final public void f1() { //logically 100% complete
		System.out.println("A1.f1()");
	}
	
	public abstract void f2(); //logically 100% incomplete
	
	public void f3() {
		//partially incomplete
	}
}
class B1 extends A1{
	@Override
	public void f2() { //partially complete
		System.out.println("B1.f2()");
	}
	
	@Override
	public final void f3() { //logically 100% complete
		System.out.println("B1.f3()");
	}
}
class C1 extends B1{
	public final void f2() {
		System.out.println("C1.f2()");
	}
}
public class Demo5 {
	public static void main(String[] args) {
		A1 a = new B1();
		a.f1();
		B1 b = (B1)a;
		b.f2();
		b.f3();
		b.f1();
	}
	
}
