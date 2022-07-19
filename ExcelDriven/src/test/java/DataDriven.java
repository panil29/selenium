import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DataDriven {

	public static void main(String[] args) throws IOException {
        //fileInputStreamArgument
		FileInputStream fis=new FileInputStream("E://demodata.xlsx");
		XSSFWorkbook workbook= new XSSFWorkbook(fis);
		int sheets=workbook.getNumberOfSheets();
		for(int i=0;i<sheets;i++)
		{
			if(workbook.getSheetName(i).equalsIgnoreCase("testdata"))
			{
			XSSFSheet sheet=workbook.getSheetAt(i);//sheet is collection of rows
//			identify testcases columns scanning the entire row
			Iterator<Row> rows=sheet.iterator();//row is collection of cells
		    Row firstrow=rows.next();
		    Iterator<Cell> cells=firstrow.cellIterator();
			int k=0;
			int column=0;
		    while(cells.hasNext())
			{
				Cell value=cells.next();
				if(value.getStringCellValue().equalsIgnoreCase("Testcases"))
				{
					column=k;
				}
				k++;
			}
		    System.out.println(column);
		    //once column is identified then scan entire testcase column to identify purchase testcase row
		    while(rows.hasNext())
		    {
		    Row r=rows.next();
		    if(r.getCell(column).getStringCellValue().equalsIgnoreCase("Purchase"))
		    {
		    	//after you grab purchase testcase row=pull all the data of that row and feed into test
		    	Iterator<Cell> cv=r.cellIterator();
		      while(cv.hasNext())
		      {
		    	  System.out.println(cv.next().getStringCellValue());
		      }
		    }
		    }
		}
	}

}
}
