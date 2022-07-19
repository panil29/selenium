package collection;

import java.util.ArrayList;

public class ArrayListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList<String> a=new ArrayList<String>();
a.add("anil");
a.add("pavuluru");
a.add("cleveland");
System.out.println(a);
a.add(0, "student");
a.add("student");
System.out.println(a);
//a.remove(3);
//a.remove("student");
System.out.println(a);

System.out.println(a.get(1));
System.out.println(a.contains("testing"));
System.out.println(a.indexOf("anil"));
System.out.println(a.isEmpty());
System.out.println(a.size());
//accept duplicate values






















	}

}
