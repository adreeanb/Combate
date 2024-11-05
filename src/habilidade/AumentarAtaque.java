package habilidade;
import model.Campeao;

public class AumentarAtaque implements Habilidade{
	
	private int qtd;
	
	public AumentarAtaque(int qtd) {
		this.qtd = qtd;
	}
	
	public void usarHabilidade(Campeao alvo) {
		alvo.aumentarAtaque(qtd);
		System.out.println(alvo.getNome()+ " usou Aumentar Ataque!");
	}
}
