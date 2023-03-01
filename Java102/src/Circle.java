
public class Circle {
	public int r;
	public final double PI=3.14;
	
	public Circle(int r) {
		this.r=r;
	}
	public void CalcArea() {
		double area = PI * this.r * this.r;
		System.out.println("area of the circle: " + area);
	}

}
