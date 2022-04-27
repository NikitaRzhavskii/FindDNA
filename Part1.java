
/**
 * Write a description of class Part1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Part1 {

    public String findSimpleGene(String dna){
      int start = dna.indexOf("ATG");
      if (start == - 1){
          return " ";
        }
      int stop = dna.indexOf("TAA", start+3);
      if (stop == -1){ 
          return " ";
        }
      if ((stop-start)%3 == 0){
          return dna.substring(start, stop+3); 
        }else{
            return " ";
        }
    }   
    
    public void testSimpleGene(){
      String dna = "AATGACGTAATATGGT";
      System.out.println("DNA strand is " + dna);
      String gene = findSimpleGene(dna); 
      System.out.println("Gene is " + gene); 
      
      dna = "AATGCGTATGGT";
      System.out.println("DNA strand is " + dna);
      String gene1 = findSimpleGene(dna); 
      System.out.println("Gene is " + gene1); 
      
      dna = "ACGTAATATGGT";
      System.out.println("DNA strand is " + dna);
      String gene2 = findSimpleGene(dna); 
      System.out.println("Gene is " + gene2); 
      
      dna = "AATGCGCTAATATGGT";
      System.out.println("DNA strand is " + dna);
      String gene3 = findSimpleGene(dna); 
      System.out.println("Gene is " + gene3);
      
    }
}

    
    
