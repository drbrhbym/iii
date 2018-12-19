import java.util.*;

public class ArrayListDemo {

	public static void main(String[] args) {
		// Set<Integer> set = new HashSet<Integer> ();
		List<Integer> list = new ArrayList<>();
		list.add(new Integer(12));
		list.add(34);// boxing
		list.add(34);// duplicate, is not added
		list.add(54);// boxing
		list.add(78);// boxing
		// set.add("Hello");
		System.out.println(list);
		System.out.println(list.size());

		Iterator<Integer> objs = list.iterator();
		while (objs.hasNext())
			System.out.println(objs.next()); // unboxing

		for (int i = 0; i < list.size(); i++)
			System.out.println(list.get(i));

		for (Integer i : list)
			System.out.println(i);
	}
}
