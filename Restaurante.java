package SistemaDeliveryParte1;

public class Restaurante {
     String nome;
     String endereco;
     String categoria;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    void MostrarInformacoes() {
        System.out.println("Nome :" + nome);
        System.out.println("Endereco :" + endereco);
        System.out.println("Categoria :" + categoria);
    }
}
