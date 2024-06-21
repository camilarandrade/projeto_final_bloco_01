package produto.controller;

import model.Produto;
import java.util.ArrayList;
import java.util.Optional;

import repository.ProdutosRepository;

public class ProdutoController implements ProdutosRepository {
	
	
	private ArrayList <Produto> listaProdutos= new ArrayList <Produto>();
	int id= 0;

	@Override
	public void cadastrar(Produto produto) {
		listaProdutos.add(produto);
		System.out.println ("O produto id: " + produto.getId()+ "foi cadastrado com sucesso!");
	}

	@Override
	public void listar() {
		for (var produto : listaProdutos) {
			produto.visualizar();
		}
		
	}

	@Override
	public void atualizar(Produto produto) {
		Optional <Produto> buscaProduto= buscarNaCollection(produto.getId());
		if (buscaProduto.isPresent()) {
			listaProdutos.set(listaProdutos.indexOf(buscaProduto.get()), produto); 
			System.out.println("O produto id: " + produto.getId() + "foi atualizado com sucesso!");
		} else {
			
			System.out.println("O produto id: " + produto.getId() + "não foi encontrado!");
		}
		
	}

	private Optional<Produto> buscarNaCollection(int id) {
		for (var produto:listaProdutos) {
			if(produto.getId()==id) {
				return Optional.of(produto);
			}
		}
		return Optional.empty();
	}

	@Override
	public void deletar(int idProduto) {
		
		Optional<Produto> produto= buscarNaCollection(id);
		
		if(produto.isPresent()) {
			if (listaProdutos.remove(produto.get())==true)
				System.out.println("O produto id: " + id + "foi excluído com sucesso!");
		} else {
			
			System.out.println("O produto id: " + id + "não foi localizado!");
		}
		
	}

}
