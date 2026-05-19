// Representa um personagem do sistema com seus principais atributos.
public abstract class Personagem implements Comparable<Personagem> {
    String nome;
    String classe;
    int nivel;
    int pontosDeVida;
    double poderBase;

    // Inicializa um personagem com os dados recebidos por parâmetro.
    public Personagem(String nome, String classe, int nivel, int pontosDeVida, double poderBase) {
        this.nome = nome;
        this.classe = classe;
        this.nivel = nivel;
        this.pontosDeVida = pontosDeVida;
        this.poderBase = poderBase;
    }

    // Exibe no console os atributos que descrevem o estado atual do personagem.
    public void exibirStatus() {
        System.out.println("--- Status do Personagem ---");
        System.out.println("Nome: " + nome);
        System.out.println("Classe: " + classe);
        System.out.println("Nivel: " + nivel);
        System.out.println("Pontos de Vida: " + pontosDeVida);
        System.out.println("Poder Base: " + poderBase);
    }

    // Cria o método abstrato para ser implementado nas subclasses
    public abstract void usarHabilidadeEspecial();

    // Implementa o método compareTo para comparar personagens pelo nível
    @Override
    public int compareTo(Personagem outro) {
        return Integer.compare(this.nivel, outro.nivel);
    }
}

