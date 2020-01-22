package fr.dauphine.ja.marhoussfatima.iterables;

import java.util.AbstractList;

public class Panel extends AbstractList<Integer>{
	
	int lb;
	int ub;
	public Panel(int lb, int ub) {
		this.lb=lb;
		this.ub=ub;
	}

	@Override
	public Integer get(int i) {
		//retourne le ième element
		return this.lb+i;
	}

	@Override
	public int size() {
		//la taille de la liste
		return this.ub-this.lb +1;
	}

}
