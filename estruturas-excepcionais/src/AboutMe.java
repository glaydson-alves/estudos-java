import java.util.Locale;
import java.util.Scanner;

public class AboutMe {
    public static void main(String[] args) {
        try{
            //criando o objeto scanner
            Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
            
            System.out.println("Digite seu nome");
            String nome = scanner.next();
            
            System.out.println("Digite seu sobrenome");
            String sobrenome = scanner.next();

            System.out.println("Digite sua idade");
            int idade = scanner.nextInt();
            
            System.out.println("Digite sua altura");
            double altura = scanner.nextDouble();

            //imprimindo os dados obtidos pelo usuario
            System.out.println("_________________________");
            System.out.println("Olá, me chamo " + nome.toUpperCase() + " " + sobrenome.toUpperCase());
            System.out.println("Tenho " + idade + " anos ");
            System.out.println("Minha altura é " + altura + "cm ");
            scanner.close();   
        } catch (java.util.InputMismatchException exception){
            System.out.println(" * os campos de idade e altura precisam ser numericos *");
            System.out.println(" * o campo de altura precisa ser sepado por ponto e não por virgula *");
        }
    }
}
/*Aparentemente é um programa simples, mas vamos listar algumas possíveis exceções, que podem acontecer.

1 - Não informar o nome e sobrenome;

2 - O valor da idade ter um caractere NÃO numérico;

3 - O valor da altura ter uma vírgula ao invés de ser um ponto (conforme padrão americano);
*/