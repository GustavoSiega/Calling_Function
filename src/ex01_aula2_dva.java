public class ex01_aula2_dva {
    public static void main(String[] args) throws Exception {

        //Netflix
        //HBO
        //Amazon Prime
        //Globo Play
        //Disney
        
        System.out.println("*** NETFLIX ***");
        Netflix nf = new Netflix();
        nf.qtdSeries = 5458;
        System.out.println("Quantidade de Séries: " + nf.qtdSeries);

        System.out.println();   /*QUEBRA LINHA */

        System.out.println("*** HBO ***");
        HBO vlrM = new HBO(34.90);
        System.out.println("Mensalidade: "  + vlrM.mensalidade);

        System.out.println();   /*QUEBRA LINHA */        

        System.out.println("*** Amazon Prime ***");
        AmazonPrime ass = new AmazonPrime();
        System.out.println("Assinantes: " + ass.assinantes); 

        System.out.println();  /*QUEBRA DE LINHA */

        System.out.println("*** Globo Play ***");
        GloboPlay av = new GloboPlay(4.8);
        System.out.println("Avalição: " + av.avaliacao);

        System.out.println();  /*QUEBRA LINHA */

        System.out.println("*** Disney+ ***");
        Disney mf = new Disney();
        System.out.println("Melhor filme: " + mf.melhorFilme);
        
    }
}
