
/**
 * Write a description of class Part3 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Part3 {
    public String twoOccurrences(String stringa, String stringb){
        String result;
        int start = stringa.indexOf(stringa);
        int number = stringa.length();
        int stop = stringb.indexOf(stringa, start+number);
        if(stop == -1){
            return result = "false";
        }else{
            return result = "true";
        }
        
}
    public void testing(){
    String a = "atg"; 
    String b = "atgcgatg";
    System.out.println(twoOccurrences(a,b));
    String c = "Akita";
    String d = "Nikita love a dishes";
    System.out.println("The part of the string after Nikita is " + lastPart(c,d));
    
}
    public String lastPart(String stringa, String stringb){
        String result; 
        int number = stringa.length();
        int stop = stringb.indexOf(stringa);
        if(stop == -1){
        return result = stringb;
    }else{
        return result = stringb.substring(stop+number);
    }
}
}
    
    