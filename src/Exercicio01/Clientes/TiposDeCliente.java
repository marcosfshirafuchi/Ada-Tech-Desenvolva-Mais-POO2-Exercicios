package Exercicio01.Clientes;

public enum TiposDeCliente {
    PESSOA_FISICA("Pessoa Física" ),
    PESSOA_JURIDICA("Pessoa Jurídica");


    String tipoCliente;

    TiposDeCliente( String tipoCliente) {
        this.tipoCliente = tipoCliente;
    }


    public String getTipoCliente() {
        return tipoCliente;
    }
}
