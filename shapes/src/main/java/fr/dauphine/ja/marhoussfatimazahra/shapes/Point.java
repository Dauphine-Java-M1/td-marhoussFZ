package fr.dauphine.ja.marhoussfatimazahra.shapes;

import java.util.ArrayList;

public class Point {
	private int x;
	private int y;
	private static int nbPoint=0;
	
	public Point(int x,int y) {
		this.x=x;
		this.y=y;
		Point.nbPoint++;
	}
	
	public Point(Point p) {
		this.x=p.x;
		this.y=p.y;
		Point.nbPoint++;
	}
	
	public int getx(){
		return this.x;
	}
	
	public int gety(){
		return this.y;
	}
	
	@Override
	public String toString () {
		return this.x + "," + this.y;
	}
	
	public boolean isSameAs(Point p) {
		if(this.x==p.x && this.y== p.y) return true;
		return false;
	}
	
	@Override
	public boolean equals(Object o) {
	if(this==o) return true ; //raccourci
	if( !(o instanceof Point)) return false ;
	Point c = (Point)o ;
	return this.x==c.x && this.y==c.y; 
	}

	public static void main(String[] args) {
		/*Point p=new Point(2,5);
		System.out.println(p);*/
		
		Point p1=new Point(1,2);
		Point p2=p1;
		Point p3=new Point(1,2);

		System.out.println(p1==p2);
		System.out.println(p1==p3);
		
		System.out.println(p1.isSameAs(p2));
		System.out.println(p1.isSameAs(p3));
				
		ArrayList<Point> list = new ArrayList<Point>();
		list.add(p1);
		System.out.println(list.indexOf(p2));
		System.out.println(list.indexOf(p3));

	}
}
