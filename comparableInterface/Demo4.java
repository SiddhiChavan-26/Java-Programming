package college.dkte;

class Fraction implements Comparable{
	private int n , d;
	
	public Fraction() {
		//TODO
	}
	
	public Fraction(int n, int d) {
		this.n = n;
		this.d = d;
	}
	
	public double value() {
		return  n/d;
	}
	
	@Override
	public int compareTo(Object o) {
		Fraction other = (Fraction)o;
		if(this.value() ==  other.value())
			return 0;
		if(this.value() > other.value())
			return 1;
		else
			return -1;
	}
}
public class Demo4 {

	public static void main(String[] args) {
		Fraction f1 = new Fraction(10, 5);
		Fraction f2 = new Fraction(8, 8);
		int result = f1.compareTo(f2);
		System.out.println("Result: "+ result);

	}

}
