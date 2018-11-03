import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class ExceltoPdf {
    public static void pdf(){
        try{
            Document doc = new Document();

            PdfWriter writer = PdfWriter.getInstance(doc, new FileOutputStream("D:\\chessResultsList.pdf"));
            doc.open();

            doc.add(new Paragraph(" "+ ExcelRead.excelDataTop.get(0).getLine1()));
            doc.add(new Paragraph(" "+ ExcelRead.excelDataTop.get(0).getLine2()));
            doc.add(new Paragraph(" "+ ExcelRead.excelDataTop.get(0).getLine3()));
            doc.add(new Paragraph(" "+ ExcelRead.excelDataTop.get(0).getLine4()));

            PdfPTable table = new PdfPTable(new float[]{3f,18f,3f,4f,3f,10f});

            for (int a=0; a<ExcelRead.exceldata.size(); a++){
                table.addCell(ExcelRead.exceldata.get(a).getNo());
                table.addCell(ExcelRead.exceldata.get(a).getName());
                table.addCell(ExcelRead.exceldata.get(a).getId());
                table.addCell(ExcelRead.exceldata.get(a).getFed());
                table.addCell(ExcelRead.exceldata.get(a).getRtg());
                table.addCell(ExcelRead.exceldata.get(a).getClub());
            }

            doc.add(table);
            doc.close();
            writer.close();


        } catch (DocumentException e){
            e.printStackTrace();
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }


    }
}
