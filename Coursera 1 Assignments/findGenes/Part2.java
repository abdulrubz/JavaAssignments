public class Part2 {
    public String findSimpleGene(String dna, String startCodon, String stopCodon) {
        String result = "";
        if( Character.isUpperCase(dna.charAt(0)) ) {
            startCodon = startCodon.toUpperCase();
            stopCodon = stopCodon.toUpperCase();
        } else {
            startCodon = startCodon.toLowerCase();
            stopCodon = stopCodon.toLowerCase();
        }

        int startIndex = dna.indexOf(startCodon);
        if(startIndex == -1) {
            return "";
        }

        int stopIndex = dna.indexOf(stopCodon, startIndex);
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
        String a = "CCATCAATAACATGA";
        System.out.println("The gene is: " + findSimpleGene(a, "ATG", "TAA"));


    public static void main (String[] args) {
        Part2 gene = new Part2();
        gene.testSimpleGene();
    }
}