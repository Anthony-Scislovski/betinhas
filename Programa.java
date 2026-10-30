import java.util.Scanner;
import model.Conta;
import model.Despesa;
import model.Meta;
import model.Receita;

public class Programa {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        // Criando os objetos
        Conta conta = new Conta(12345, "Alex Silva", 1000.0, 500.0);
        Receita receita = new Receita("Salário Mensal", 2000.0);
        Despesa despesa = new Despesa("Aluguel do Apê", 1200.0,"Para pagar");
        Meta meta = new Meta("Comprar Computador", 8000.0, 1500.0);

        int opcao;

        System.out.println("=== SISTEMA DE CONTROLE FINANCEIRO ===");
        System.out.println("Cliente: " + conta.getCliente()
                + " | Saldo Inicial: R$ " + conta.getSaldo());

        System.out.println("--------------------------------------------------");

        // Receita
        System.out.print("Deseja depositar o " + receita.getOrigem()
                + " no valor de R$ " + receita.getValor()
                + "? (1-Sim / 2-Não): ");
        opcao = entrada.nextInt();

        if (opcao == 1) {
            conta.depositar(receita.getValor());
            System.out.println("Saldo Atual: R$ " + conta.getSaldo());
        } else {
            System.out.println("Depósito cancelado.");
        }

        System.out.println("--------------------------------------------------");

        // Despesa
        System.out.print("Deseja pagar a despesa [" + despesa.getDescricao()
                + "] de R$ " + despesa.getValor()
                + "? (1-Sim / 2-Não): ");
        opcao = entrada.nextInt();

        if (opcao == 1) {
            if (conta.pagarDespesa(despesa)) {
                System.out.println("Saldo Atual: R$ " + conta.getSaldo());
            }
        } else {
            System.out.println("Pagamento cancelado.");
        }

        System.out.println("--------------------------------------------------");

        // Meta
        System.out.print("Deseja poupar R$ 200.00 para a meta ["
                + meta.getObjetivo()
                + "]? (1-Sim / 2-Não): ");
        opcao = entrada.nextInt();

        if (opcao == 1) {
            conta.poupar(meta, 200.0);
        } else {
            System.out.println("Operação cancelada.");
        }

        // Relatório Final
        System.out.println("=========================================================================");
        System.out.println("                         RELATÓRIO FINANCEIRO");
        System.out.println("=========================================================================");

        System.out.println("Conta: " + conta.getNumero()                                     
                + " | Cliente: " + conta.getCliente()); 

        System.out.println("Saldo Final: R$ " + conta.getSaldo()
                + " | Limite: R$ " + conta.getLimite()); 

        System.out.println("Situação do " + despesa.getDescricao()
                + ": " + despesa.getStatus()); 

        System.out.println("Meta [" + meta.getObjetivo() + "]: R$ "
                + meta.getValorPoupado()
                + " poupados de R$ "
                + meta.getValorAlvo());

        System.out.println("=========================================================================");        
        entrada.close();
    }
}
