package model;

public abstract class Produto {
	
	private String idProduto;
	private String nomeProduto;
	private int ProdutosDisponiveis; 
	private String Tipo;
	private float valor;
	
	
	public Produto(String idProduto, String nomeProduto, int produtosDisponiveis, float valor, String Tipo) {
		this.idProduto = idProduto;
		this.nomeProduto = nomeProduto;
		this.ProdutosDisponiveis = produtosDisponiveis;
		this.Tipo = Tipo;
		this.valor = valor;
	}

	public String getIdProduto() {
		return idProduto;
	}

	public void setIdProduto(String idProduto) {
		this.idProduto = idProduto;
	}

	public String getNomeProduto() {
		return nomeProduto;
	}

	public void setNomeProduto(String nomeProduto) {
		this.nomeProduto = nomeProduto;
	}

	public int getProdutosDisponiveis() {
		return ProdutosDisponiveis;
	}

	public void setProdutosDisponiveis(int produtosDisponiveis) {
		this.ProdutosDisponiveis = produtosDisponiveis;
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
		System.out.println("\nNome do Produto: " + this.Tipo);
		System.out.println("Valor do Produto: " + this.valor);
	}

}
