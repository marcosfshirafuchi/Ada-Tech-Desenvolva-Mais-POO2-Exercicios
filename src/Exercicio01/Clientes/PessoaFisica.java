package Exercicio01.Clientes;

public class PessoaFisica extends Cliente {

    public PessoaFisica(String nome, String numeroDoDocumento, String email, TiposDeCliente tiposDeCliente) {
        super(nome, numeroDoDocumento, email, tiposDeCliente);
    }

    @Override
    public String formatarNumeroDeDocumentoFormatado(String numeroDoDocumento) {
        return(numeroDoDocumento.substring(0, 3) + "." + numeroDoDocumento.substring(3, 6) + "." +
                numeroDoDocumento.substring(6, 9) + "-" + numeroDoDocumento.substring(9, 11));
    }

}
