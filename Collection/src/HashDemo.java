import java.util.*;

public class HashDemo {

	public static void main(String[] args) {
		// Set<Integer> set = new HashSet<Integer> ();
		Set<Integer> set = new HashSet<>();
		set.add(new Integer(12));
		set.add(34);
		set.add(34);
		// set.add("Hello");
		System.out.println(set);
		System.out.println(set.size());

		Iterator<Integer> objs = set.iterator();
		while (objs.hasNext())
			System.out.println(objs.next());
		for (Integer i : set)
			System.out.println(i);
	}

}
