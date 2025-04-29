import java.util.Scanner;
// import java.util.Locale;

public class Calculadora {
  public static void main(String[] args) {
    // Locale.setDefault(new Locale("pt", "BR"));
    Scanner dados = new Scanner(System.in);

    System.out.println("Digite o primeiro número: ");
    double num1 = dados.nextDouble();

    System.out.println("Digite o operador: +, -, /, *, %");
    char operador = dados.next().charAt(0);

    System.out.println("Digite o segundo número: ");
    double num2 = dados.nextDouble();

    boolean operacaoValida = true;
    double result = 0;

    switch (operador) {
      case '+':
        result = num1 + num2;        
        break;
      case '-':
        result = num1 - num2;
        break;
      case '/':
        if(num2 != 0) {
          result = num1 / num2;
          break;
        } else {
          operacaoValida = false;
          System.err.println("Operação inválida: Divisão por 0.");
        }
        case '*':
          result = num1*num2;
          break;
        case '%':
          result = num1 % num2;
          break;

      default:
        operacaoValida = false;
        System.out.println("Operador ou número inválido.");
        break;
    }

    if (operacaoValida){
      System.out.println("O resultado é: " + result);
    }


    dados.close();
  }
}
