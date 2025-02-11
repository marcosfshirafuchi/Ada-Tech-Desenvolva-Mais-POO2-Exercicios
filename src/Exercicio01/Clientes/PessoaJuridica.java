package Exercicio01.Clientes;

public class PessoaJuridica extends Cliente {

    public PessoaJuridica(String nome, String numeroDoDocumento, String email, TiposDeCliente tiposDeCliente) {
        super(nome, numeroDoDocumento, email, tiposDeCliente);
    }

    @Override
    public String formatarNumeroDeDocumentoFormatado(String numeroDodocumento) {
        return(numeroDodocumento.substring(0, 2) + "." + numeroDodocumento.substring(2, 5) + "." +
                numeroDodocumento.substring(5, 8) + "." + numeroDodocumento.substring(8, 12) + "-" +
                numeroDodocumento.substring(12, 14));
    }

}
