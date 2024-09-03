package ex19;

import java.util.ArrayList;
import java.util.List;

public class AgendaTelefonica {
    private List<Contato> contatos;

    public AgendaTelefonica() {
        contatos = new ArrayList<Contato>();
    }

    public void adicionarContato(Contato contato) {
        contatos.add(contato);
        System.out.println("Contato cadastrado com sucesso!");
    }

    public void deletarContato(String nome) {
        boolean contatoRemovido = false;

        for (Contato contato : contatos) {
            if (contato.getNome().equals(nome)) {
                contatos.remove(contato);
                contatoRemovido = true;
                System.out.println("Contato removido com sucesso!");
                break;
            }
        }

        if (!contatoRemovido) {
            System.out.println("Contato não encontrado.");
        }
    }

    public void listarContatos() {
        for (Contato contato : contatos) {
            System.out.println("Nome: "+contato.getNome());
            System.out.println("Telefone: "+contato.getTelefone());
        }
    }

    public boolean isEmpty() {
        if (contatos.isEmpty()){
            return true;
        }else{
            return false;
        }
    }
}
