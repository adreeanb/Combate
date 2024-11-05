package service;
import model.Campeao;
import habilidade.Habilidade;

public class Combate {

	private Campeao campeao1;
	private Campeao campeao2;
	private int turnos;
	private Habilidade habilidade1;
	private Habilidade habilidade2;
	
	public Combate(Campeao campeao1, Campeao campeao2, Habilidade habilidade1, Habilidade habilidade2, int turnos) {
		this.campeao1 = campeao1;
		this.campeao2 = campeao2;
		this.turnos = turnos;
		this.habilidade1 = habilidade1;
		this.habilidade2 = habilidade2;
	}
	
	public void iniciarCombate(){
		
		for(int i = 1; i <= turnos; i++) {
			
			System.out.println("Turno "+i);
			
			if(i % 3 == 0) {
				habilidade1.usarHabilidade(campeao1);
				habilidade2.usarHabilidade(campeao2);
			}
			
			campeao2.receberDano(campeao1.getAtaque());
			System.out.println(campeao2.status());
			
			if (campeao2.getVida() == 0) {
                System.out.println("FIM DO COMBATE");
                break;
            }
			
			campeao1.receberDano(campeao2.getAtaque());
			System.out.println(campeao1.status());
			
			if (campeao1.getVida() == 0) {
                System.out.println("FIM DO COMBATE");
                break;
            }
		}
		System.out.println("Fim do Combate!");
	}
}
