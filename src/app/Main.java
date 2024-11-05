package app;
import model.Campeao;
import service.Combate;

public class Main {
	public static void main (String[] args) {
		
		Campeao campeao1 = new Campeao("Tentacruel", 50, 2, 18);
		Campeao campeao2 = new Campeao("Nidoking", 80, 3, 10);
		
		Combate combate = new Combate(campeao1, campeao2, 5);
		
		combate.iniciarCombate();
	}
}
