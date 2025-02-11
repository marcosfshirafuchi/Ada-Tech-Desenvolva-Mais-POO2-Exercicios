package Exercicio01.Clientes;

import java.util.Scanner;

public class CadastrarCliente {
    public static PessoaFisica cadastrarPessoaFisica() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o nome do cliente: ");
        String nome = scanner.nextLine();
        String cpf;
        String email;
        do {
            System.out.print("Digite o CPF do cliente: ");
            cpf = scanner.nextLine();
            if (!ValidaCPF.isCPF(cpf)) {
                System.out.print("Erro, CPF invalido !!!\n");
            }
        } while (!ValidaCPF.isCPF(cpf));
        System.out.print("Digite o email do Cliente: ");
        email = scanner.nextLine();
        PessoaFisica pessoaFisica = new PessoaFisica(nome,cpf,email, TiposDeCliente.PESSOA_FISICA);
        return pessoaFisica;
    }

    public static PessoaJuridica cadastrarPessoaJuridica(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o nome do cliente: ");
        String nome = scanner.nextLine();
        String cpf;
        String email;
        do {
            System.out.print("Digite o CNPJ do cliente: ");
            cpf = scanner.nextLine();
            if (!ValidaCPF.isCPF(cpf)) {
                System.out.print("Erro, CNPJ invalido !!!\n");
            }
        } while (!ValidaCPF.isCPF(cpf));
        System.out.print("Digite o email do Cliente: ");
        email = scanner.nextLine();
        PessoaJuridica pessoaJuridica = new PessoaJuridica(nome,cpf,email, TiposDeCliente.PESSOA_JURIDICA);
        return pessoaJuridica;
    }
}
