package TestNGConcepts;

import java.util.ArrayList;

import com.excel.utility.Xls_Reader;

public class TestUtil {
	static Xls_Reader reader;
	

	public static ArrayList<Object[]> getDataFromExcel() {

		ArrayList<Object[]> myData = new ArrayList<Object[]>();

		try {
			reader = new Xls_Reader("C:\\Users\\Girish Nair\\Desktop\\Selenium\\Data Driven Test\\SampleDataPan.xlsx");
		} catch (Exception e) {
			e.printStackTrace();
		}

		
		
		for (int rowNum = 2; rowNum <= reader.getRowCount("Sheet1"); rowNum++) {

			String apptype = reader.getCellData("Sheet1", "apptype", rowNum);
			String category = reader.getCellData("Sheet1", "category", rowNum);
			String title = reader.getCellData("Sheet1", "title", rowNum);
			String lastname = reader.getCellData("Sheet1", "lastname", rowNum);
			String firstname = reader.getCellData("Sheet1", "firstname", rowNum);
			String middlename = reader.getCellData("Sheet1", "middlename", rowNum);

			Object ob[] = {apptype,category,title,lastname,firstname,middlename};
			myData.add(ob);
			
			
			
			
			
			
		}
		return myData;

	}

}
