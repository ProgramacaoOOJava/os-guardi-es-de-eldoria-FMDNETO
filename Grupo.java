import java.util.ArrayList;
import java.util.List;

public class Grupo {
    private String nomeDoGrupo;
    private List<Personagem> membros;

    public Grupo(String nomeDoGrupo) {
        this.nomeDoGrupo = nomeDoGrupo;
        this.membros = new ArrayList<>();
    }

    public String getNomeDoGrupo() {
        return nomeDoGrupo;
    }

    public void adicionarMembro(Personagem personagem) {
        membros.add(personagem);
    }

    public void listarMembros() {
        System.out.println("Membros do grupo " + nomeDoGrupo + ":");
        for (Personagem membro : membros) {
            System.out.println("- " + membro.nome);
        }
    }

    public void batalhar(Personagem p1, Personagem p2) {
        System.out.println("--- Batalha ---");
        System.out.println("Batalha entre " + p1.nome + " e " + p2.nome + "!");
        // Simula a batalha comparando o Poder Total (poderTotal = nivel * poderBase) dos personagens
        double poderTotalP1 = p1.nivel * p1.poderBase;
        double poderTotalP2 = p2.nivel * p2.poderBase;
        System.out.println(p1.nome + " tem poder total: " + poderTotalP1);
        System.out.println(p2.nome + " tem poder total: " + poderTotalP2);

        if (poderTotalP1 > poderTotalP2) {
            System.out.println(p1.nome + " venceu a batalha!");
        } else if (poderTotalP2 > poderTotalP1) {
            System.out.println(p2.nome + " venceu a batalha!");
        } else {
            System.out.println("A batalha terminou em empate!");
        }
        System.out.println("-------FIM DA BATALHA---------");
    }


    public void ordenarMembrosPorNivel() {
        membros.sort(null); // Usa o método compareTo de Personagem para ordenar
        System.out.println("Membros do grupo " + nomeDoGrupo + " ordenados por nível:");
        for (Personagem membro : membros) {
            System.out.println("- " + membro.nome + " (Nível: " + membro.nivel + ")");
        }
    }

    public List<Personagem> getMembros() {
        return membros;
    }
}
