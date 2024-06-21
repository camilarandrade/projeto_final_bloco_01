package repository;

import model.Produto;

public interface ProdutosRepository {

public void cadastrar (Produto produto);
public void listar();
public void atualizar(Produto produto);
public void deletar(int id);
	
}
 	