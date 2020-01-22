package fr.dauphine.ja.marhoussfatima.iterables;

import java.util.List;
import java.util.ListIterator;
import java.util.AbstractSequentialList;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;


public class Mult2 {
	
	public static List<Integer> mult(final int coef, final List<Integer> list){
		return new AbstractSequentialList<Integer>() {
			
			@Override
			public int size() {
				return list.size();
			}
			
			@Override
			public ListIterator<Integer> listIterator(final int index) {
				
				return new ListIterator<Integer>() {
					private ListIterator<Integer> mylist = list.listIterator(index);
					public void add(Integer arg0) {
						throw new UnsupportedOperationException();
						
					}

					public boolean hasNext() {
						return mylist.hasNext();
					}

					public boolean hasPrevious() {
						return mylist.hasPrevious();
					}

					public Integer next() {
						return mylist.next() * coef;
					}

					public int nextIndex() {
						return mylist.nextIndex();
					}

					public Integer previous() {
						return mylist.previous() * coef;
					}

					public int previousIndex() {
						return mylist.previousIndex();
					}

					public void remove() {
						throw new UnsupportedOperationException();
					}

					public void set(Integer arg0) {
						throw new UnsupportedOperationException();
					}
					
				};
			}
			
		};
}
	
    public static void main( String[] args ) {

		ArrayList<Integer> al = new ArrayList<Integer>();
		
		for (int i = 0; i < 1000000; i++) {
			al.add(i);
		}
		
		long t0 = System.nanoTime();
		
		List<Integer> ret = Mult.mult(2, al);
		
		long sum=0;
		
		for(int val : ret) {
			sum+=val/2;
		}
		
		System.out.println((System.nanoTime() - t0));
		
		LinkedList<Integer> ll = new LinkedList<Integer>();
		
		for (int i = 0; i < 1000000; i++) {
			ll.add(i);
		}
		
		t0 = System.nanoTime();
		
		sum=0;
		
		ret = Mult.mult(2, ll);
		
		for(int val : ret) {
			sum+=val/2;
		}
		
		System.out.println((System.nanoTime() - t0));
    }

}


	