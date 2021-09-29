package FastFood;
import java.util.Scanner;
public abstract class Produto {
	Scanner leitura = new Scanner(System.in);
	private String nome;
	private int id;
	private float preco;
	private String tipo;
//private float taxaDeLucro; 
public void cadastrar(String nome, float preco, String tipo) {
	System.out.println("Digite o nome do produto que deseja cadastrar:");
	nome = leitura.next();
	System.out.println("Digite o preco do produto que deseja cadastrar:");
	preco= leitura.nextFloat();
	System.out.println("Digite o tipo do produto que deseja cadastrar:");
	tipo= leitura.next();
	
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
//private int getId() {
	//return id;
//}
//private void setId(int id) {
	//this.id = id;
//}
public float getPreco() {
	return preco;
}
public void setPreco(float preco) {
	this.preco = preco;
}
public String getTipo() {
	return tipo;
}
public void setTipo(String tipo) {
	this.tipo = tipo;
}
}

