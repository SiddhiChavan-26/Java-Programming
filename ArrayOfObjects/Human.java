package college.dkte.demo2;

public class Human {
	private int age, weight, height;
	
	public Human() {
		System.out.println("public Human()");
	}
	
	public Human(int age, int weight, int height) {
		this.age = age;
		this.weight = weight;
		this.height =  height;
	}
	
	public void display() {
		System.out.printf("Age: %d\nWeight: %d\nHeight: %d\n", this.age, this.weight, this.height);
	}
}
