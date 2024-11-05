package habilidade;
import model.Campeao;

public class AumentarVida implements Habilidade {
	private int qtd;
	
	public AumentarVida(int qtd) {
		this.qtd = qtd;
	}
	
	public void usarHabilidade(Campeao alvo){
		alvo.curar(qtd);
		System.out.println(alvo.getNome()+ " usou Curar e agora tem "+ alvo.getVida()+" de vida!");
	}
}
