package Exercicio01.Clientes;

public enum TiposDeCliente {
    PESSOA_FISICA(1,"Pessoa Física" ),
    PESSOA_JURIDICA(2,"Pessoa Jurídica");

    int codigo;
    String tipoCliente;

    TiposDeCliente(int codigo, String tipoCliente) {
        this.codigo = codigo;
        this.tipoCliente = tipoCliente;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getTipoCliente() {
        return tipoCliente;
    }
}
