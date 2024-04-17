public class App {
    public static void main(String[] args) throws Exception {
        
        String primeiroNome = "Danilo ";
        String segundoNome = "Cordeiro";
        String nomeDoMeio = " Estevão";
        
        String nomeCompleto = nomeCompleto(primeiroNome, segundoNome, nomeDoMeio);
        
        System.out.println(nomeCompleto);

    }

    public static String nomeCompleto(String primeiroNome, String segundoNome, String nomeDoMeio){
        return primeiroNome.concat(segundoNome).concat(nomeDoMeio);
    }
}
