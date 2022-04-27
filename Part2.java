
/**
 * Write a description of class Part2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Part2 {
    public String findSimpleGene(String dna, String startCodon, String stopCodon){
      String result;
      int start = dna.indexOf(startCodon);
      if (start == - 1){
          return " ";
        }
      int stop = dna.indexOf(stopCodon, start+3);
      if (stop == -1){ 
          return " ";
        }
      if ((stop-start)%3 == 0){
          return result = dna.substring(start, stop+3); 
        }else{
            return " ";
        }
    }   
    
    public String changeCase(String  dna){
       String result = dna.toUpperCase();
       if(dna.equals(result)){
           return dna.toLowerCase();
        }else{
            return dna.toUpperCase();
        }
    }
    
    public void testSimpleGene(){
      String startCode = "ATG";
      String stopCode = "TAA"; 
   
      String dna = "AATGACGTAATATGGT";
      String dnaChange = changeCase(dna);
      System.out.println("DNA strand is " + dnaChange);
      String gene = changeCase(findSimpleGene(dna,startCode,stopCode)); 
      System.out.println("Gene is " + gene); 
      
      dna = "AAATGCCCTAACTAGATTAAGAAACC";
      System.out.println("DNA strand is " + dna);
      String gene1 = findSimpleGene(dna,startCode,stopCode); 
      System.out.println("Gene is " + gene1); 
      
      dna = "ACGTAATATGGT";
      System.out.println("DNA strand is" + dna);
      String gene2 = findSimpleGene(dna,startCode,stopCode); 
      System.out.println("Gene is " + gene2); 
      
      dna = "AATGCGCTAATATGGT";
      System.out.println("DNA strand is " + dna);
      String gene3 = findSimpleGene(dna,startCode,stopCode); 
      System.out.println("Gene is " + gene3);
      
    }
}
