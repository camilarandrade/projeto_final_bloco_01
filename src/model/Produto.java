package model;

public abstract class Produto {
	
	private int idProduto;
	private String nomeProduto;
	private String Tipo;
	private float valor;
	
	
	public Produto(int idProduto, String nomeProduto, float valor, String Tipo) {
		this.idProduto = idProduto;
		this.nomeProduto = nomeProduto;
		this.Tipo = Tipo;
		this.valor = valor;
	}

	public int getIdProduto() {
		return idProduto;
	}

	public void setIdProduto(int idProduto) {
		this.idProduto = idProduto;
	}

	public String getNomeProduto() {
		return nomeProduto;
	}

	public void setNomeProduto(String nomeProduto) {
		this.nomeProduto = nomeProduto;
	}

	public String getTipo() {
		return Tipo;
	}

	public void setTipo(String Tipo) {
		this.Tipo = Tipo;
	}


	public float getValor() {
		return valor;
	}

	public void setValor(float valor) {
		this.valor = valor;
	}
	
	
	public void visualizar() {
		
		System.out.println("\n\n***********************************************************");
		System.out.println("*                    Dados do Produto                     *");
		System.out.println("***********************************************************");
		System.out.println("\nNome do Produto: " + this.nomeProduto);
		System.out.println("Tipo do Produto " + this.Tipo);
		System.out.println("Valor do Produto: " + this.valor);
	}

}
