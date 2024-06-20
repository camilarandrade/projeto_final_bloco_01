package model;

public class Acessorios extends Produto{

	private String material;

	public Acessorios(int idProduto, String nomeProduto, float valor, String Tipo,
			String material) {
		super(idProduto, nomeProduto, valor, Tipo);
		this.material = material;
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	} 
	
	
}
