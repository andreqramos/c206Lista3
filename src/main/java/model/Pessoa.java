package model;

public class Pessoa {
    public String nome;
    public int cpf;
    public Endereco[] enderecos;

    public Pessoa(String nome, int cpf, int qtdEnd) {
        this.nome = nome;
        this.cpf = cpf;
        enderecos = new Endereco[qtdEnd];
    }

    public void addEndeco(Endereco end) {
        for (Endereco endereco : enderecos) {
            if (endereco == null) {
                endereco = end;
                break;
            }
        }
    }

    public void mostraInfo() {
        System.out.println("----------Pessoa----------");
        System.out.println("Nome: " + nome);
        System.out.println("CPF: " + cpf);
        for (Endereco endereco : enderecos) {
            if(endereco == null)
                continue;
            endereco.mostraInfo();
        }
    }
}
