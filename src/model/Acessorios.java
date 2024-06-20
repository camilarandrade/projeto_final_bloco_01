package model;

public class Acessorios extends Produto{

	private String material;

	public Acessorios(String idProduto, String nomeProduto, int produtosDisponiveis, float valor, String Tipo,
			String material) {
		super(idProduto, nomeProduto, produtosDisponiveis, valor, Tipo);
		this.material = material;
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	} 
	
	
}
