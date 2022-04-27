
/**
 * Write a description of class part3 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class part3 {
    public int findStopCodon(String dna, int startIndex, String stopCodon){
        int currIndex = dna.indexOf(stopCodon, startIndex+3);
        while (currIndex != -1){ 
            int diff = currIndex - startIndex; 
            if(diff%3 == 0){
                return currIndex; 
            }else{
                currIndex = dna.indexOf(stopCodon, currIndex+1);
            }
}
return dna.length();
}
    public String findGene(String dna, int where){
    int startIndex = dna.indexOf("ATG", where);
    if(startIndex == -1){
        return "";
    }
    int taaIndex = findStopCodon(dna, startIndex, "TAA");
    int tagIndex = findStopCodon(dna, startIndex, "TAG");
    int temp = Math.min(taaIndex, tagIndex);
    if (temp == dna.length()){
        return "";
}
return dna.substring(startIndex, temp+3);
}
public int countGenes(String dna){
    int number = 0;
    int startIndex = 0;
    while( true ){
    String currGene = findGene(dna, startIndex); 
    if(currGene.isEmpty()){
        break;
    }
    number = number+1;
    startIndex = dna.indexOf(currGene, startIndex)+currGene.length(); 
    } 
    return number;
}
public void testCount(){
    String dna = "ATGxxxyyyzzzTAAzzzATGxxxTAGzzzATGzzzxxxTAAzzzxxxATGxxxzzzTAA";
    System.out.println(countGenes(dna));
}
}