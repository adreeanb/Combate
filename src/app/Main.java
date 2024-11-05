package app;
import model.Campeao;
import service.Combate;
import habilidade.Habilidade;
import habilidade.AumentarAtaque;
import habilidade.AumentarVida;

public class Main {
	public static void main (String[] args) {
		
		Campeao campeao1 = new Campeao("Slowpoke", 50, 2, 18);
		Campeao campeao2 = new Campeao("Dragonite", 80, 3, 10);
		
		AumentarVida habilidade1 = new AumentarVida(5);
        AumentarAtaque habilidade2 = new AumentarAtaque(3);
        
		Combate combate = new Combate(campeao1, campeao2, habilidade1, habilidade2, 8);
		
		combate.iniciarCombate();
	}
}
