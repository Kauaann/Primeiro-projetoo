import java.util.Scanner;

public class ContaBancaria {
    public static void main(String[] args) {

        System.out.println("Dados iniciais do cliente: ");

        String Nome = "Kauan Douglas";
        String TipoConta = "Corrente";
        Double SaldoConta = 3500.00;
        int opcao = 0;

        System.out.println("******************************************************");
        System.out.println("\nNome do Cliente:    " + Nome);
        System.out.println("\nTipo de conta:      " + TipoConta);
        System.out.println("\nSaldo da conta:     " + SaldoConta);
        System.out.println("\n******************************************************");

        String menu = """
                \n** Digite sua opção **
                1 - Consultar saldo
                2 - Transferência
                3 - Depósito
                4 - Sair
                """;
        Scanner leitura = new Scanner(System.in);

        while (opcao != 4) {
            System.out.println(menu);
            opcao = leitura.nextInt();

            if (opcao == 1) {
                System.out.println("Saldo da Conta: " + SaldoConta);
            } else if ((opcao == 2)) {
                System.out.println("Qual Valor que deseja transferir? ");
                double valor = leitura.nextDouble();
                if (valor > SaldoConta) {
                    System.out.println("Você não tem saldo suficiente para essa tranferência");
                }
                else {
                    SaldoConta -= valor;
                    System.out.println("Novo saldo: " + SaldoConta);
                }
            }else if (opcao == 3) {
                    System.out.println("Valor do depósito? : ");

                double valor = leitura.nextDouble();
                SaldoConta += valor;
                System.out.println("Novo saldo: " + SaldoConta);
            }
            else if (opcao != 4 ) {
                System.out.println("Opção Inválida!");
            }
        }

        }

    }

