package Exercicio01.Clientes;

public abstract class Cliente implements NumeroDocumento {
    private String nome;
    private String numeroDoDocumento;
    private String email;
    private TiposDeCliente tiposDeCliente;

    public Cliente(String nome, String numeroDoDocumento, String email, TiposDeCliente tiposDeCliente) {
        this.nome = nome;
        this.numeroDoDocumento =  formatarNumeroDeDocumentoFormatado(numeroDoDocumento);
        this.email = email;
        this.tiposDeCliente = tiposDeCliente;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNumeroDoDocumento() {
        return numeroDoDocumento;
    }

    public void setNumeroDoDocumento(String numeroDoDocumento) {
        this.numeroDoDocumento = numeroDoDocumento;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public TiposDeCliente getTipoDeCliente() {
        return tiposDeCliente;
    }

    public void setTipoDeCliente(TiposDeCliente tiposDeCliente) {
        this.tiposDeCliente = tiposDeCliente;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "nome = " + nome + '\'' +
                ", numeroDoDocumento = " + numeroDoDocumento + '\'' +
                ", email = " + email + '\'' +
                ", tipoDeCliente = " + tiposDeCliente.tipoCliente +
                '}';
    }
}
