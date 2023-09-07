package utils;



import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtils {
	public static XSSFWorkbook workbook;
	public static XSSFSheet sheet;
    public static String projectpath=System.getProperty("user.dir");
	
	
	public ExcelUtils(String excelpath,String sheetname)
	{
		try {
			workbook = new XSSFWorkbook(projectpath+"/excel/data.xlsx");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		  sheet=workbook.getSheet("Sheet1");	
	}
	/*public static void main(String[] args) {
		
      // getRowCount();
       getCellDataString(0,1);
       getCellDataNumber(1,1);
	}*/
	
	public static void getRowCount()
	{
		
		try {
				int rowCount= sheet.getPhysicalNumberOfRows();
		        System.out.println(rowCount);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	   
	
	}
	
	public static void getCellDataString(int rownum,int colnum)
	{
      try {
		workbook=new XSSFWorkbook(projectpath+"/excel/data.xlsx");
		sheet=workbook.getSheet("Sheet1");
	    String cellData=sheet.getRow(1).getCell(0).getStringCellValue();
	    System.out.println(cellData);
	   
	} catch (IOException e) {
		
		e.printStackTrace();
	}
      
 
	}

	
	public static void getCellDataNumber(int rownum,int colnum)
	{
      try {
		workbook=new XSSFWorkbook(projectpath+"/excel/data.xlsx");
		sheet=workbook.getSheet("Sheet1");
	    double cellData=sheet.getRow(1).getCell(1).getNumericCellValue();
	    System.out.println(cellData);
	   
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
      
 
	}
}
