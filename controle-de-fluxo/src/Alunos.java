public class Alunos {
  public static void main(String[] args) {
    String alunos[] = {"Pedro", "Santos", "Daniel", "Maria", "Bruna"};

    for(String aluno : alunos) {
      if(aluno == "Daniel") {
        continue;       
      } 
      System.out.println("O aluno é: " + aluno);
    }


  }

}
