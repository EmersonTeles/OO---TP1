package FastFood;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Insumo {

	Scanner leitura = new Scanner(System.in);
	public String toString() {
		return "nome=" + nome + " Preço do insumo= R$" + custo;
	}
	private String nome;
	private int id;
	private float custo;
	private Date dataValidade;
	public void cadastrar(String nome, float custo) {
		System.out.println("Digite o nome do Insumo:");
		nome = leitura.next();
		System.out.println("Digite o custo do insumo que deseja cadastrar:");
		custo= leitura.nextFloat();
		
	}
	public void editar() {
	
	}
	public void deletar() {
		
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public float getCusto() {
		return custo;
	}
	public void setCusto(float custo) {
		this.custo = custo;
	}
	public Date getDataValidade() {
		return dataValidade;
	}
	public void setDataValidade(Date dataValidade) {
		this.dataValidade = dataValidade;
	}
}
