public class Produto {
    private String nome;
    private double preco;
    private int quantidade;
    
    public Produto(String nome, double preco, int quantidade){
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public void setPreco( double preco){
        if(preco > 0){
            this.preco = preco;
        }
    }
    public void setQuantidade( int quantidade){
        if(quantidade >=0){
            this.quantidade = quantidade;
        }
    }
    public String getNome(){
        return nome;
    }
    public double getPreco(){
        return preco;
    }
    public int getQuantidade(){
        return quantidade;
    }
    public double valorTotalEmEstoque(){
        return preco * quantidade;
    }
    public void adicionarEstoque(int quantidade){
        this.quantidade += quantidade;
    }
    public void removerEstoque(int quantidade){
        if(this.quantidade - quantidade >=0){
            this.quantidade -= quantidade;
        }
    }
    
}
