// ExemploFor.java
public class ExemploFor {
	public static void main(String[] args) {
		for(int carneirinhos = 1 ; carneirinhos <=20; carneirinhos ++) {
			System.out.println(carneirinhos + " - Carneirinho(s)");
		}
	}
    // Outras estruturas

    //estrutura 1
    public static void estruturaUm (String[] args) {

        for(int carneirinhos = 1 ; carneirinhos <=20; carneirinhos ++) {
            System.out.println(carneirinhos + " - Carneirinho(s)");
        }
        
    }

    //estrutura 2
    public static void estruturaDois (String[] args) {
    //o que importa é somente o bloco condicional
        int carneirinhos = 1;
        for( ; carneirinhos <=20; ) {
            System.out.println(carneirinhos + " - Carneirinho(s)");
            carneirinhos ++;
        }
    }

    //for( somente 1x ; deve ser uma expresão boolean; acontecerá a cada final da execução ) { }

    public static void vetorUm(String[] args) {
        String alunos[] = { "FELIPE", "JONAS", "JULIA", "MARCOS" };
    
        for (int x=0; x<alunos.length; x++) {
            System.out.println("O aluno no indice x=" + x + " é " + alunos[x]);
        }
    }

    public static void vetorDois(String[] args) {
        String alunos [] =  {"FELIPE","JONAS","JULIA","MARCOS"};
        
            //Forma abreviada
        for(String aluno : alunos) {
          System.out.println(alunos);
        }
        /*
        String aluno : alunos -> De forma abreviada, é criada uma variável nome obtendo um elemento do vetor a cada ocorrência;
        A impressão de cada aluno é realizada.
         */
    }
}
