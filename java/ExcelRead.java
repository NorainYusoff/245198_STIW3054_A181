import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;

public class ExcelRead {

    public static ArrayList <PlayerData> exceldata = new ArrayList<PlayerData>();
    public static ArrayList <ReadData> excelDataTop = new ArrayList<ReadData>();

    private static final String Filename = "D:\\chessResultsList.xlsx";

    public static void GetData(){


        try{

            FileInputStream excelFile = new FileInputStream(new File(Filename));
            XSSFWorkbook workbook = new XSSFWorkbook(excelFile);
            XSSFSheet sheet = workbook.getSheetAt(0);

            String dt1,dt2,dt3,dt4,dt5,dt6, l1,l2,l3,l4;

            XSSFRow line1 = sheet.getRow(0);
            XSSFRow line2= sheet.getRow(1);
            XSSFRow line3 = sheet.getRow(2);
            XSSFRow line4= sheet.getRow(3);

            l1=line1.getCell(0).getStringCellValue();
            l2=line2.getCell(0).getStringCellValue();
            l3=line3.getCell(0).getStringCellValue();
            l4=line4.getCell(0).getStringCellValue();

            excelDataTop.add(new ReadData(l1,l2,l3,l4));

            for (int i=4; i<155; i++){
                XSSFRow row = sheet.getRow(i);

                dt1= row.getCell(0).toString();
                dt2= row.getCell(2).toString();
                dt3= row.getCell(3).toString();
                dt4= row.getCell(4).toString();
                dt5= row.getCell(5).toString();
                dt6= row.getCell(6).toString();


                exceldata.add(new PlayerData(dt1,dt2,dt3,dt4,dt5,dt6));

            }

            workbook.close();
            excelFile.close();

            System.out.println(" "+ excelDataTop.get(0).getLine1());
            System.out.println(" "+ excelDataTop.get(0).getLine2());
            System.out.println(" "+ excelDataTop.get(0).getLine3());
            System.out.println(" "+ excelDataTop.get(0).getLine4());

            for(int j= 0; j<exceldata.size(); j++){
                System.out.printf("%-8s", exceldata.get(j).getNo());
                System.out.printf("%-40s", exceldata.get(j).getName());
                System.out.printf("%-8s", exceldata.get(j).getId());
                System.out.printf("%-6s", exceldata.get(j).getFed());
                System.out.printf("%-6s", exceldata.get(j).getRtg());
                System.out.printf("%-8s", exceldata.get(j).getClub());
                System.out.println();

            }

        } catch (Exception e){
            e.printStackTrace();
        }

    }


}
