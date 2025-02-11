package Exercicio01.Clientes;

import java.util.Scanner;

import static Exercicio01.Clientes.ValidaEmail.isValidEmail;

public class CadastrarCliente {
    public static PessoaFisica cadastrarPessoaFisica() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("********Cadastro de Pessoa Física********");
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
        do{
            System.out.print("Digite o email do Cliente: ");
            email = scanner.nextLine();
            if (!isValidEmail(email)){
                System.out.print("Erro, Email invalido !!!\n");
            }
        }while (!isValidEmail(email));

        PessoaFisica pessoaFisica = new PessoaFisica(nome,cpf,email, TiposDeCliente.PESSOA_FISICA);
        return pessoaFisica;
    }

    public static PessoaJuridica cadastrarPessoaJuridica(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("********Cadastro de Pessoa Jurídica********");
        System.out.print("Digite o nome da empresa: ");
        String nome = scanner.nextLine();
        String cnpj;
        String email;
        do {
            System.out.print("Digite o CNPJ do cliente: ");
            cnpj = scanner.nextLine();
            if (!ValidaCNPJ.isCNPJ(cnpj)) {
                System.out.print("Erro, CNPJ invalido !!!\n");
            }
        } while (!ValidaCNPJ.isCNPJ(cnpj));
        do{
            System.out.print("Digite o email da empresa: ");
            email = scanner.nextLine();
            if (!isValidEmail(email)){
                System.out.print("Erro, Email invalido !!!\n");
            }
        }while (!isValidEmail(email));
        PessoaJuridica pessoaJuridica = new PessoaJuridica(nome,cnpj,email, TiposDeCliente.PESSOA_JURIDICA);
        return pessoaJuridica;
    }
}
