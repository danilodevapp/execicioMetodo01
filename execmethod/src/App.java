public class App {
    public static void main(String[] args) throws Exception {
        
        String primeiroNome = "Danilo ";
        String segundoNome = "Cordeiro";
        
        String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);
        
        System.out.println(nomeCompleto);

    }

    public static String nomeCompleto(String primeiroNome, String segundoNome){
        return primeiroNome.concat(segundoNome);
    }
}
