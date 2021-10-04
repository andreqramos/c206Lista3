package app;

import model.Endereco;
import model.Pessoa;

public class Core {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa("Noah", 111, 2);
        Endereco end = new Endereco("Rua da Direita", "Centro", 2);
        pessoa.addEndeco(end);
        end = new Endereco("Rua da Esquerda", "Centro", 1);
        pessoa.addEndeco(end);
        pessoa.mostraInfo();
    }
}
