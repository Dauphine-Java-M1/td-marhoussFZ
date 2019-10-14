package fr.dauphine.ja.marhoussfatimazahra.shapes;

public class Circle {
	private Point centre;
	private LigneBis rayon;
	
	public Circle (Point p) {
		this.centre = new Point(p);
		this.rayon = new LigneBis();
	}
	
	@Override
	public String toString () {
		return this.centre + "," + this.rayon;
	}

	public static void main(String[] args) {
		Circle c = new Circle(new Point(5,4));
		System.out.println(c);

	}

}
