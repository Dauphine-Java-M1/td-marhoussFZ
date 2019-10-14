package fr.dauphine.ja.marhoussfatimazahra.shapes;

import java.util.Objects;

public class Ligne {
	private Point[] TabPoint;
	private final int nbMax;
	private int i;
	
	public Ligne(int nbMax) {
		this.nbMax = nbMax;
		this.TabPoint = new Point[nbMax];
		this.i=0;
		
	}
	
	public void add(Point a) {
		Objects.requireNonNull(a);
		if(!(this.i == this.nbMax)) {
			this.TabPoint[this.i]= Objects.requireNonNull(a);
			i++;
		}
	}
	
	public int pointCapacity() {
		return this.nbMax;
	}
	
	public int nbPoints() {
		return this.i;
	}
	
	public boolean contains(Point p) {
		Objects.requireNonNull(p); 
		for(Point a : this.TabPoint) {
			if(a == Objects.requireNonNull(p)) return true;
		}
		return false;
	}

	public static void main(String[] args) {
		Ligne L = new Ligne(5);
		Point p = new Point(4,5);
		L.add(p);
		//L.add(null);
		System.out.println(L.TabPoint.length+";"+L.i);
		System.out.println(L.contains(p));

	}

}