package Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import javax.xml.transform.stream.StreamSource;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Test1 {

	// @Test
	  public void regular() {
		  ArrayList<String> names=new ArrayList<String>();
		  names.add("Anil");
		  names.add("Akhil");
		  names.add("Ashok");
		  names.add("Adam");
		  names.add("Ram");
		  int j=0;
		  for(int i=0;i<names.size();i++)
		  {
			  String pull=names.get(i);
	          if(pull.startsWith("A"))
	          {
	        	  j++;
	          }
		  }
		  System.out.println(j);
	  }
	
//@Test
public void streamFilter()
{
	ArrayList<String> names=new ArrayList<String>();
	  names.add("Anil");
	  names.add("Akhil");
	  names.add("Ashok");
	  names.add("Adam");
	  names.add("Rm");
	  
	  // there is no life for intermediate operation if there is no terminal operation
	  //terminal operation will execute only if intermediate operation (filter) return true
	  //
	  Long c=names.stream().filter(s->s.startsWith("A")).count();
	  System.out.println(c);
	long d=Stream.of("Anil","Akhil","Ashok","Adam","Rm").filter(s-> 
	//s.startsWith("A")).count();
	  {
		  s.startsWith("A");
		  return true;
	  }).count();
	 System.out.println(d);
	 //print all the names in arraylist
	// names.stream().filter(s->s.length()>4).forEach(s->System.out.println(s));
	 names.stream().filter(s->s.length()>4).limit(1).forEach(s->System.out.println(s));
	 
}



	//@Test
	public void streamMap()
	{
		ArrayList<String> names=new ArrayList<String>();
		  names.add("man");
		  names.add("Don");
		  names.add("women");
		 ;
		//print names which have the letter as "l" with uppercase
Stream.of("Anil","Akhil","Ashok","Adam","Rm").filter(s->s.endsWith("l")).map(s->s.toUpperCase())
.forEach(s->System.out.println(s));

//print names with first letter as "a" with uppercase in sortedway
List<String>names1=Arrays.asList("Anil","Akhil","Ashok","Adam","Rm");
	names1.stream().filter(s->s.startsWith("A")).sorted().map(s->s.toUpperCase()).forEach(s->System.out.println(s));
	
Stream<String> newStream=Stream.concat(names.stream(),names1.stream());
//newStream.sorted().forEach(s->System.out.println(s));
	boolean flag=newStream.anyMatch(s->s.equalsIgnoreCase("Adam"));
	System.out.println(flag);
	Assert.assertTrue(flag);
	}
@Test
public void streamCollect()
{
List<String>ls=Stream.of("Anil","Akhil","Ashok","Adam","Rm").filter(s->s.endsWith("l")).map(s->s.toUpperCase())
	.collect(Collectors.toList());
System.out.println(ls.get(0));

List<Integer>values=Arrays.asList(3,2,2,7,5,1,9,7);
//print unique number from this array
//sort the array-give me the 3rdindex -1,2,3,5,7,9
//values.stream().distinct().forEach(s->System.out.println(s));
List<Integer>li=values.stream().distinct().sorted().collect(Collectors.toList());
System.out.println(li.get(2));
}
}
