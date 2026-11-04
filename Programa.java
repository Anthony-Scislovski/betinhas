import java.util.Scanner;
import model.Cliente;
import model.PecaDeRoupa;
import model.Venda;

public class Programa {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        // Cadastro inicial da loja Betinhas
        Cliente cliente = new Cliente("Alex Silva", 500.0);
        PecaDeRoupa jaqueta = new PecaDeRoupa(101, "Jaqueta Jeans Betinhas", "M", 180.0, 5);
        PecaDeRoupa camiseta = new PecaDeRoupa(102, "Camiseta Oversized Betinhas", "G", 80.0, 10);

        System.out.println("=========================================================================");
        System.out.println("                     LOJA DE ROUPAS BETINHAS                             ");
        System.out.println("=========================================================================");
        System.out.println("Cliente: " + cliente.getNome() + " | Saldo em Carteira: R$ " + cliente.getSaldo());
        System.out.println("-------------------------------------------------------------------------");

        // Compra 1: Jaqueta Jeans
        System.out.print("Deseja comprar 1x [" + jaqueta.getNome() + "] Tamanho " + jaqueta.getTamanho()
                + " por R$ " + jaqueta.getPreco() + "? (1-Sim / 2-Não): ");
        int opcao = entrada.nextInt();

        Venda venda1 = null;
        if (opcao == 1) {
            venda1 = new Venda(cliente, jaqueta, 1);
            venda1.processarVenda();
            System.out.println("Saldo Atual: R$ " + cliente.getSaldo());
        } else {
            System.out.println("Item não adicionado.");
        }

        System.out.println("-------------------------------------------------------------------------");

        // Compra 2: Camiseta Oversized (2 unidades)
        System.out.print("Deseja comprar 2x [" + camiseta.getNome() + "] Tamanho " + camiseta.getTamanho()
                + " por R$ " + (camiseta.getPreco() * 2) + "? (1-Sim / 2-Não): ");
        opcao = entrada.nextInt();

        Venda venda2 = null;
        if (opcao == 1) {
            venda2 = new Venda(cliente, camiseta, 2);
            venda2.processarVenda();
            System.out.println("Saldo Atual: R$ " + cliente.getSaldo());
        } else {
            System.out.println("Item não adicionado.");
        }

        // Comprovante / Relatório Final
        System.out.println("\n=========================================================================");
        System.out.println("                        RESUMO DA COMPRA - BETINHAS                      ");
        System.out.println("=========================================================================");
        System.out.println("Cliente: " + cliente.getNome());
        System.out.println("Saldo Final na Carteira: R$ " + cliente.getSaldo());
        System.out.println("-------------------------------------------------------------------------");
        
        System.out.println("ESTOQUE ATUALIZADO DAS PEÇAS:");
        System.out.println("- " + jaqueta.getNome() + " (Tam " + jaqueta.getTamanho() + "): " 
                + jaqueta.getQuantidadeEstoque() + " unidades restantes em estoque.");
        System.out.println("- " + camiseta.getNome() + " (Tam " + camiseta.getTamanho() + "): " 
                + camiseta.getQuantidadeEstoque() + " unidades restantes em estoque.");
        
        System.out.println("=========================================================================");

        entrada.close();
    }
}
