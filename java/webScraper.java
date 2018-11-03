
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class webScraper {
    public static List<data> ListAll() {


        try {
             Document doc = Jsoup.connect("https://ms.wikipedia.org/wiki/Malaysia").get();
             Elements tablewiki = doc.getElementsByClass("wikitable");
             Elements getTableWiki = tablewiki.get(1).getElementsByClass("wikitable");
             Elements column1 = getTableWiki.select("th");
             Elements column2 = getTableWiki.select("td");

             //end get all data from table

            List<data> dataList = new ArrayList<data>();
                for (int i = 0; i<column1.size(); i++){
                //dataList.add(new data(("" + column1.get(i).text(), "" + column2.get(i).text()));
                dataList.add(new data("" + column1.get(i).text(), "" + column2.get(i).text()));


            }
            System.out.println("Data Extraction: In Progress");
                Thread.sleep(50000);

                for (data Data : dataList){
                    System.out.println(Data.getColm1()+ ":" +Data.getColm2());
                }

                return dataList;

        }
        catch (IOException ioe) {
            ioe.printStackTrace();
        }
        catch (InterruptedException e){
            e.printStackTrace();
        }

        System.out.println("Data Extraction: Success");
        return null;

    }
}
