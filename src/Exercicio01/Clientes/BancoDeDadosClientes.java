package Exercicio01.Clientes;

import java.util.ArrayList;
import java.util.List;

public class BancoDeDadosClientes {
    static List<Cliente> listaDeClientes = new ArrayList<>();
    public static List<Cliente> registrarClientes(Cliente cliente) {
        listaDeClientes.add(cliente);
        return listaDeClientes;
    }

    public static void relatorioClienteCadastrados(){
        System.out.println("Lista de Clientes cadastrados:");
        for (Cliente clienteCadastrado: listaDeClientes){
            System.out.println(clienteCadastrado);
        }
        System.out.println();
    }
}
