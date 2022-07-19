import files.PayLoad;
import io.restassured.path.json.JsonPath;

public class ComplexJasonParse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		JsonPath js=new JsonPath(PayLoad.CoursePrice());
		int count=js.getInt("courses.size()");
		System.out.println(count);
		int total=js.getInt("dashboard.purchaseAmount");
		System.out.println(total);
		//String title=js.get("courses[0].title");
		//System.out.println(title);
		for(int i=0;i<count;i++)
		{
			String titleCourse=js.get("courses["+i+"].title");
			System.out.println(js.get("courses["+i+"].price").toString());
			System.out.println(titleCourse);
		}
		System.out.println("print no of copies sold by RPA courses");
		for(int i=0;i<count;i++)
		{
			String titleCourse=js.get("courses["+i+"].title");
			if(titleCourse.equalsIgnoreCase("RPA"))
			{
				int copies=js.get("courses["+i+"].copies");
			System.out.println(copies);
			break;
			}
		
		}
		
		
		
		
		
		
		
		
		
		
	}

}
