import java.util.ArrayList;

import org.testng.annotations.Test;

public class One {
  @Test
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
	  System.out.println("j");
  }
}