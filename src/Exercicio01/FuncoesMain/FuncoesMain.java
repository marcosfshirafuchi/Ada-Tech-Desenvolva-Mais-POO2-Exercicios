package Exercicio01.FuncoesMain;

import Exercicio01.Clientes.CadastrarCliente;
import Exercicio01.Clientes.PessoaFisica;
import Exercicio01.Clientes.PessoaJuridica;

import java.util.Scanner;

import static Exercicio01.Clientes.CadastrarCliente.cadastrarPessoaJuridica;
import static Exercicio01.Clientes.BancoDeDadosClientes.registrarClientes;

public class FuncoesMain {
    static int opcaoCliente;
    public static void cadastrarCliente(){
        Scanner scanner = new Scanner(System.in);
        boolean loop = true;

        while(loop) {
            System.out.println("\nEscolha a opção do cliente:\n");
            System.out.println("1 - Pessoa Física");
            System.out.println("2 - Pessoa Juridica");
            System.out.println("3 - Voltar ao Menu Principal\n");
            System.out.print("Digite a opção do cliente desejada: ");

            opcaoCliente = scanner.nextInt();

            PessoaFisica pessoafisica = null;
            PessoaJuridica pessoaJuridica = null;
            switch (opcaoCliente){
                case 1:
                    System.out.print("\n");
                    pessoafisica = CadastrarCliente.cadastrarPessoaFisica();
                    registrarClientes(pessoafisica);
                    break;
                case 2:
                    System.out.print("\n");
                    pessoaJuridica = cadastrarPessoaJuridica();
                    registrarClientes(pessoaJuridica);
                    break;
                case 3:
                    System.out.println("\n------------------------------");
                    System.out.println("Voltando ao Menu Principal.");
                    System.out.println("------------------------------\n");
                    loop = false;
                    break;
                default:
                    System.out.println("\n------------------------------");
                    System.out.println("Digite uma opção válida.");
                    System.out.println("------------------------------\n");

            }
        }
    }
}
