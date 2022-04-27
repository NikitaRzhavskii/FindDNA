
/**
 * Write a description of class Part4 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import edu.duke.*;

public class Part4 {
public void testFindWeb(String url){
  URLResource file = new  URLResource(url);
   	for (String item : file.lines()) {
           int youtubeIndex = item.toLowerCase().indexOf("youtube.com");
           if (youtubeIndex != -1){
               int startIndex = item.lastIndexOf("\"", youtubeIndex);
               int lastIndex = item.indexOf("\"", youtubeIndex);
               
               System.out.println("Youtube link" + item.substring(startIndex, lastIndex));
   	   }
   	}
}
public void test(){
    String url = "https://www.dukelearntoprogram.com//course2/data/manylinks.html";
    testFindWeb(url);
}
}

        
