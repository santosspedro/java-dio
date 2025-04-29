import java.util.Scanner;

public class CaixaEletronico {
  
  
  public static void main(String[] args) {
    Scanner dados = new Scanner(System.in);
    double saldo = 25.0;
    double valorSolicitado;
    int option;

    // Load
    char[] spinner = {'|', '/', '-', '\\'};

    try {
        for (int i = 0; i < 40; i++) { // quantidade de giros
            System.out.print("\r" + spinner[i % spinner.length] + " Carregando...");
            Thread.sleep(100); // velocidade da rotação
        }
    } catch (InterruptedException e) {
        System.out.println("Processo interrompido");
    }
    // Sistema
    while (true) {
      System.out.println("Olá, seja bem-vindo ao nosso Caixa Eletrônico.");
      System.out.println("Selecione o que deseja fazer: 1- Depositar, 2 - Sacar, 3 - Ver saldo, 0 - Sair.");
      option = dados.nextInt();

      if(option == 1) {
        System.out.println("Qual valor do depósito? ");
        double deposito = dados.nextDouble();
        saldo += deposito;
      } else if(option == 2) {
          System.out.println("Qual valor do saque? ");
          valorSolicitado = dados.nextDouble();
          // Condição ternária
          String resultado = valorSolicitado <= saldo ? "Valor Sacado, saldo restante: R$" + saldo : "Saldo Insuficiente";
          System.out.println(resultado);
          if (valorSolicitado <= saldo) {
            saldo -= valorSolicitado;
          }

      } else if (option == 3){
        System.out.println("R$"+saldo);
      } else {
        System.out.println("Obrigado por usar nosso caixa eletrônico!");
        break;
      }

    }
    // Fechamento do Scanner
    dados.close();
  }
}
