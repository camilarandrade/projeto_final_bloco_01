package repository;

import model.Produto;

public interface ProdutosRepository {

public void cadastrar (Produto produto);
public void listar();
public void buscar();
public void deletar(int idProduto);
	
}
