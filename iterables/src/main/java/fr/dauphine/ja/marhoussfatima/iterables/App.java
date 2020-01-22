package fr.dauphine.ja.marhoussfatima.iterables;

import java.util.Iterator;
import java.util.List;

/**
 * Hello world!
 *
 */
public class App {
	
	private static Iterator<Integer> panel1(final int lb, final int ub) {
		// return iterator<Integer>
		return new Iterator<Integer>(){
			private int position = lb;
			
			
			public boolean hasNext(){
				return (position<=ub);
			}
			
			public Integer next(){
				return position++;
			}
			
		};
	}	
	
	private static Iterable<Integer> panel2(final int a, final int b) {
		return new Iterable<Integer>(){

			
			public Iterator<Integer> iterator() {
				return panel1(a,b);
			}
		};
	}
	
    public static void main( String[] args )
    {
    	//1
    	Iterator<Integer> it=panel1(1,5);
    	for(;it.hasNext();)
    		System.out.println(it.next()); // affiche 1 2 3 4 5
    	
    	//3
    	for(int i:panel2(1,5))
    		System.out.println(i); // affiche 1 2 3 4 5
    	
    	//5
    	List<Integer> l = new Panel(3,6);
    	for(int i:l) {
    		System.out.println(i);//affiche 3 4 5 6
    		}
    		System.out.println(l.get(1)); //affiche 4
    	}
}