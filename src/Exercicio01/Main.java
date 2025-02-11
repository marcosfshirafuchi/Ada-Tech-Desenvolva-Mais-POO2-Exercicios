package Exercicio01;

import Exercicio01.Clientes.Cliente;
import Exercicio01.Clientes.PessoaJuridica;
import Exercicio01.Clientes.TiposDeCliente;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static Exercicio01.Clientes.BancoDeDadosClientes.relatorioClienteCadastrados;
import static Exercicio01.Clientes.CadastrarCliente.cadastrarPessoaFisica;
import static Exercicio01.Clientes.CadastrarCliente.cadastrarPessoaJuridica;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Cliente pessoaFisica = null;
        Cliente pessoaJuridica = null;
        boolean loop = true;
        while (loop){
            System.out.println("*********MERCADO LIVRE*******");
            System.out.println("CADASTRO DE CLIENTES");
            System.out.println("1 - Pessoa Física");
            System.out.println("2 - Pessoa Jurídica");
            System.out.println("3 - Impressão dos Clientes Cadastrados");
            System.out.println("4 - Sair");
            System.out.print("Digite opção desejada: ");
            int tipoPessoa = scanner.nextInt();
            scanner.nextLine();
            String nome, numeroDoDocumento, email;
            switch (tipoPessoa){
                case 1:
                    cadastrarPessoaFisica();
                    break;
                case 2:
                    cadastrarPessoaJuridica();
                    break;
                case 3:
                    relatorioClienteCadastrados();
                    break;
                case 4:

                    System.out.println("Saindo do sistema.");
                    loop = false;
                    break;
                default:
                    System.out.println("Digite uma opção válida.");
                    System.out.println("------------------------------");
            }

        }
        scanner.close();
    }
}
