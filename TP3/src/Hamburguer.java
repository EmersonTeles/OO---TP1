public class Hamburguer extends Produto {
	
	private float peso = 0;
	private Insumo composicao[];
	public Hamburguer(String nome, String tipo, float preco,float peso) {
		super();
		this.peso = peso;
		this.setNome(nome);
		this.setTipo(tipo);
		this.setPreco(preco);
	}
	public void FazerHamburguer() {
		
	}
	public float getPeso() {
		return peso;
	}
	public void setPeso(float peso) {
		this.peso = peso;
	}
	public Insumo[] getComposicao() {
		return composicao;
	}
	public void setComposicao(Insumo[] composicao) {
		this.composicao = composicao;
	}
	 
}
