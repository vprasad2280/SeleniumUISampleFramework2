package utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.DataFormatter;

public class excelUtils {
	public static FileInputStream fis;
	public static FileOutputStream fos;
	public static HSSFWorkbook wb;
	public static HSSFSheet ws;
	public static HSSFRow row;
	public static HSSFCell cell;


	public static int getRowCount(String xlfile , String xlsheet) throws IOException 
	{

		fis=new FileInputStream(xlfile);
		wb=new HSSFWorkbook(fis);
		ws=wb.getSheet(xlsheet);

		int rowcount=ws.getLastRowNum();
		wb.close();
		fis.close();

		return rowcount;
	}


	public static int getCellCount(String xlfile , String xlsheet,int rownum) throws IOException 
	{

		fis=new FileInputStream(xlfile);
		wb=new HSSFWorkbook(fis);
		ws=wb.getSheet(xlsheet);
		row=ws.getRow(rownum);

		int cellcount=row.getLastCellNum();
		wb.close();
		fis.close();

		return cellcount;
	}

	public static String getCellData(String xlfile , String xlsheet,int rownum,int colnum) throws IOException 
	{

		fis=new FileInputStream(xlfile);
		wb=new HSSFWorkbook(fis);
		ws=wb.getSheet(xlsheet);
		row=ws.getRow(rownum);
		cell=row.getCell(colnum);

		String data;
		try
		{


			DataFormatter formatter=new DataFormatter();
			String cellData=formatter.formatCellValue(cell);
			return cellData;

		}
		catch  (Exception e) 
		{
			data="";
		}

		wb.close();
		fis.close();

		return data;
	}
	
	
	public static void setCellData(String xlfile , String xlsheet,int rownum,int colnum,String data) throws IOException 
	{

		fis=new FileInputStream(xlfile);
		wb=new HSSFWorkbook(fis);
		ws=wb.getSheet(xlsheet);
		row=ws.getRow(rownum);
		cell=row.createCell(colnum);
		cell.setCellValue(data);
		fos=new FileOutputStream(xlfile);
		wb.write(fos);
		wb.close();
		fis.close();
		fos.close();

		
	}
	
	
}
