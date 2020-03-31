public class Part1 {
    public String findSimpleGene(String dna) {
        String result = "";
        int startIndex = dna.indexOf("ATG");
        if(startIndex == -1) {
            return "";
        }
        int stopIndex = dna.indexOf("TAA", startIndex);
        if(stopIndex == -1) {
            return "";
        }

        if((stopIndex - startIndex) % 3 == 0) {
            return dna.substring(startIndex, stopIndex+3);
        }
        else {
            return "";
        }
    }

    public void testSimpleGene() {
        String a = "AAATGCCCTAACTAGATTAAGAAACC";
        System.out.println("The gene for "+a+"is : "+findSimpleGene(a));
    }

    public static void main (String[] args) {
        Part1 gene = new Part1();
        gene.testSimpleGene();
    }
}