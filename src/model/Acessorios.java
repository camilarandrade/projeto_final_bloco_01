package model;

public class Acessorios extends Produto{

	private String material;

	public Acessorios(int id, String nomeProduto, float valor, String Tipo,
			String material) {
		super(id, nomeProduto, valor, Tipo);
		this.material = material;
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	} 
	
	@Override
	public void visualizar() {
		super.visualizar();
		System.out.println("Material: " + this.material);
	
	}
}
