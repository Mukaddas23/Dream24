package apachePoi;


import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;

/*public class Day1 {
    public static void main(String[] args) throws IOException {


        FileInputStream file = new FileInputStream("C:\\Users\\olimo\\IdeaProjects\\API\\src\\main\\resources\\Datasheet1.xlsx");
        XSSFWorkbook workbook = new XSSFWorkbook(file);
        XSSFSheet sheet = workbook.getSheet("AJ");
        int numOFRows = sheet.getPhysicalNumberOfRows();
        int numOfCells = sheet.getRow(0).getLastCellNum();
        System.out.println(numOfCells);
        System.out.println(numOFRows);

        String [] arr = new String[numOFRows];
        String [] rowColumns = new String[numOfCells];
        for(int i=0;i<numOFRows;i++){
            arr[i] = sheet.getRow(i).getCell(0).getStringCellValue();
            if(arr[i].equalsIgnoreCase("Google")){
                for(int j=0;j<numOfCells;j++){
                    rowColumns[j] = sheet.getRow(j).getCell(0).getStringCellValue();
                    if(rowColumns[j].equalsIgnoreCase("URL")){
                        System.out.println(sheet.getRow(i).getCell(j).getStringCellValue());
                    }

                }
            }

        }
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(rowColumns));
    }
}*/




public class Day1 {

    public static void main(String[] args) throws IOException {


        FileInputStream file = new FileInputStream("C:\\Users\\olimo\\IdeaProjects\\API\\src\\main\\resources\\Datasheet1.xlsx");
        XSSFWorkbook workbook = new XSSFWorkbook(file);
        XSSFSheet sheet = workbook.getSheet("Data");
        int numOFRows = sheet.getPhysicalNumberOfRows();
        int numOfCells = sheet.getRow(0).getLastCellNum();
        System.out.println(numOfCells);
        System.out.println(numOFRows);

        String [] arr = new String[numOFRows];
        String [] rowColumns = new String[numOfCells];
        for(int i=0;i<numOFRows;i++){
            arr[i] = sheet.getRow(i).getCell(0).getStringCellValue();
            if(arr[i].equalsIgnoreCase("Google")){
                for(int j=0;j<numOfCells;j++){
                    rowColumns[j] = sheet.getRow(j).getCell(0).getStringCellValue();
                    if(rowColumns[j].equalsIgnoreCase("URL")){
                        System.out.println(sheet.getRow(i).getCell(j).getStringCellValue());
                    }

                }
            }

        }
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(rowColumns));
    }
}

