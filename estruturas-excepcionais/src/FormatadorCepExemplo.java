public class FormatadorCepExemplo {
    public static void main(String[] args) {
        try {
            String cepFormatado = formatarCep("23412342rr");
            System.out.println(cepFormatado);
        } catch (CepInvalidoException e) {
            e.printStackTrace();
            System.out.println("cep não corresponde as regras de negocio");
        }
    }
    static String formatarCep(String cep) throws CepInvalidoException{
        if(cep.length() != 8)
          throw new CepInvalidoException();
        
          //simulando um cep formatado
          return "23.765-064";
    }
}
