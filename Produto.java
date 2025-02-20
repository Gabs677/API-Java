package frontend.produtofrontend;

public class Produto {
    
    //Atributos
    private int id;
    private String descricao;
    private Double preco;
    private int quantidade;
    private String categoria;
    private String marca;
    private String fornecedor;
    private int dataFabricacao;
    private int validade;
    
    public Produto(int id, String descricao, double preco, int quantidade, String categoria, String marca, String fornecedor, int dataFabricacao, int validade) {
        
    this.id = id;
    this.descricao = descricao;
    this.preco = preco;
    this.quantidade = quantidade;
    this.categoria = categoria;
    this.marca = marca;
    this.fornecedor = fornecedor;
    this.dataFabricacao = dataFabricacao;
    this.validade = validade;
    }
    
    public Produto() {
        super();
    }
    
    //Getters e setters
    public int getId() {
        return id;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    
    public String getDescricao() {
        return descricao;
    }
    
    public void setDescricao(String id) {
        this.descricao = descricao;
    }
    
    public double getPreco() {
        return preco;
    }
    
    public void setPreco(double preco) {
        this.preco = preco;
    }
    
    public int getQuantidade() {
        return quantidade;
    }
    
    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
    
    public String getCategoria() {
        return categoria;
    }
    
    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
    public String getMarca() {
        return marca;
    }
    
    public void setMarca(String marca) {
        this.marca = marca;
    }
    
    public String getFornecedor() {
        return fornecedor;
    }
    
    public void setFornecedor(String fornecedor) {
        this.fornecedor = fornecedor;
    }
    
    public int getDataFabricacao() {
        return dataFabricacao;
    }
    
    public void setDataFabricacao(int dataFabricacao) {
        this.dataFabricacao = dataFabricacao;
    }
    
    public int getValidade() {
        return validade;
    }
    
    public void setValidade(int validade) {
        this.validade = validade;
    }
}