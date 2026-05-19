// Classe de entrada da aplicação.
public class Main {
    // Método principal responsável por iniciar a execução do programa.
    public static void main(String[] args) {

        // Instancia personagens com dados iniciais para demonstração.
        Guerreiro guerreiro1 = new Guerreiro("Kratos", 20, 100, 10.5, 30);
        Mago mago1 = new Mago("Merlin", 25, 100, 20, 20);
        Guerreiro guerreiro2 = new Guerreiro("Enéias",  56, 200, 100, 10);
        Mago mago2 = new Mago("Gandalf", 50, 100, 100, 50);

        //Criando Grupos
        Grupo grupo1 = new Grupo("Os Guardiões de Eldoria");
        
        //Adicionando membros aos grupos
        grupo1.adicionarMembro(guerreiro1);
        grupo1.adicionarMembro(mago1);
        grupo1.adicionarMembro(guerreiro2);
        grupo1.adicionarMembro(mago2);


        // Listando membros do grupo
        grupo1.listarMembros();
        
        //Ordenando membros por nível
        grupo1.ordenarMembrosPorNivel();

        /*
        // Exibe no console o estado atual de cada personagem.
        guerreiro1.exibirStatus();
        mago1.exibirStatus();
        guerreiro2.exibirStatus();
        mago2.exibirStatus();

        //Inicia os métodos especiais de cada classe com base no método da superclasse
        guerreiro1.usarHabilidadeEspecial();
        mago1.usarHabilidadeEspecial();
        guerreiro2.usarHabilidadeEspecial();
        mago2.usarHabilidadeEspecial();


        //Instanciação de objetos(personagens) em uma estrutura

        Personagem[] herois = new Personagem[4];
        herois[0] = new Guerreiro("Mario", 8, 100, 100,50);
        herois[1] = new Mago("Luigi", 6, 100, 80,40);
        herois[2] = new Guerreiro("Bowser", 10, 50, 100,20);
        herois[3] = new Mago("Peach", 8, 100, 100,50);

        // Exibe o status e a habilidade especial de cada personagem usando polimorfismo.
        for (Personagem h : herois){
            h.exibirStatus();
            h.usarHabilidadeEspecial();
        }
        */
        

        // Simula uma batalha entre dois personagens do grupo
        grupo1.batalhar(guerreiro1, mago1);
        grupo1.batalhar(guerreiro2, mago2);

    }
}
