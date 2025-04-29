import java.util.Locale;
import java.util.Scanner;

public class Exceptions {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in).useLocale(Locale.US);

    System.out.println("Digite seu nome: ");
    try{
      String nome = input.nextLine();
      System.out.println(nome);
    } catch(Exception e) {
      System.err.println("Insira um valor válido.");
    }
    System.out.println("Digite sua idade: ");
    try {
      int idade = input.nextInt();
      System.out.println(idade);
    } catch(Exception e) {
      System.err.println("Digite um valor válido");
    }



    input.close();
  }
}
