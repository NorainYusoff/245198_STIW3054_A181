public class Main {

    public static void main (String[] args){
        try {
            ExcelRead.GetData();
            System.out.println("Data are get from Excel File");
            Thread.sleep(1500);

            ExceltoPdf.pdf();
            System.out.print("Data Successfully Convert From Excel to PDF");

        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
