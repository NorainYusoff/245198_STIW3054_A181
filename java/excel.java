import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


import java.io.File;
import java.io.FileOutputStream;

public class excel {
    public  void writeexcel(){
        try {
            XSSFWorkbook workbook = new XSSFWorkbook();
            XSSFSheet sheet = workbook.createSheet("Wiki Malaysia Trivia");

            int rowCount = 0;

            for (data adata : webScraper.ListAll()) {

                Row row = sheet.createRow(rowCount++);

                Cell cel1 = row.createCell(0);
                cel1.setCellValue(adata.getColm1());

                Cell cel2 = row.createCell(1);
                cel2.setCellValue(adata.getColm2());

                sheet.autoSizeColumn(0);
                sheet.autoSizeColumn(1);

            }

            FileOutputStream out = new FileOutputStream (new File("C:\\Users\\User\\wikiMalaysia.xlsx"));
            workbook.write(out);
            workbook.close();
            System.out.println("\nWikiMalaysia.xlsx: Succesful written");

        }
        catch (Exception e){
            System.out.println("Error");
        }
    }
}
