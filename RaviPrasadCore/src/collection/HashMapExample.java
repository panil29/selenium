package collection;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
HashMap<Integer,String> hm=new HashMap<Integer,String>();
hm.put(0, "csu");
hm.put(1, "goodafternoon");
hm.put(2, "dum");
System.out.println(hm.get(2));
//hm.remove(2);
//System.out.println(hm.get(2));
Set sn=hm.entrySet();

Iterator i=sn.iterator();
while(i.hasNext())
{
	Map.Entry mp=(Map.Entry)i.next();
	System.out.println(mp.getKey());
	System.out.println(mp.getValue());
}















	}

}
