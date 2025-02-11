package Exercicio02.Produtos;

public enum TiposDeProdutos {
    ROUPAS("Roupas"),
    CALCADOS("Calçados"),
    LIVROS("Livros"),
    ELETRONICOS("Eletrônicos"),
    MOVEIS("Móveis"),
    ITENS_PARA_CASA("Itens para casa"),
    INFORMATICA("Informática"),
    TELEFONIA("Telefonia");

    String categoria;

    TiposDeProdutos(String categoria) {
        this.categoria = categoria;
    }

    public String getCategoria() {
        return categoria;
    }
}
