import java.util.*;

public class HashMapDemo {

	public static void main(String[] args) {
		Map<String, String> tel = new HashMap<>();
		tel.put("John", "0939065530");
		tel.put("Mary", "0941065987");
		tel.put("Jean", "0939888168");
		String tel1 = tel.get("Mary");
		System.out.println(tel1);

		for (String key : tel.keySet())
			System.out.println(key + "," + tel.get(key));
		for (String val : tel.values())
			System.out.println(val);

	}

}
