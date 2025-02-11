package Exercicio02.Produtos;

public class Produto {
    private int codigo;
    private String nome;
    private int quantidade;
    private double precoUnitario;
    private TiposDeProdutos tipoDeProduto;

    public Produto(int codigo, String nome, int quantidade, double precoUnitario, TiposDeProdutos tipoDeProduto) {
        this.codigo = codigo;
        this.nome = nome;
        this.quantidade = quantidade;
        this.precoUnitario = precoUnitario;
        this.tipoDeProduto = tipoDeProduto;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public double getPrecoUnitario() {
        return precoUnitario;
    }

    public TiposDeProdutos getTipoDeProduto() {
        return tipoDeProduto;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
}
