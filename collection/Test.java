package collection;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Set set = new TreeSet();

		set.add("2");

		set.add(3);

		set.add("4");

		Iterator it = set.iterator();

		while(it.hasNext()) {

		System.out.print(it.next() + " ");
		}

	}

}
