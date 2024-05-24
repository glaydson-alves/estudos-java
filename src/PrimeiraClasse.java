public class PrimeiraClasse {
    //metodos ou funções
    public static void main(String[] args) {
        String primeiroNome = "Glaydson";
        String segundoNome = "Alves";
        String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);
        // int anoNascimento = 1993;
        // boolean verdadeOuMentira = true;
        System.out.println(nomeCompleto);
        System.out.print( "Olá, Mundo! esse é meu primeiro codigo em Java");
    }

    public static String nomeCompleto (String primeiroNome, String segundoNome){
        return "resultado do estudo de " + primeiroNome.concat(" ").concat(segundoNome);
    }

    
}
