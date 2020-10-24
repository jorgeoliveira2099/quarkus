package org.acme;

import javax.ws.rs.core.MediaType;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Consumes;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.transaction.Transactional;

@RestController

public class ProdutoResource {
	
	@PostMapping("/product")
	@Transactional
	public void addProduct(Produto product) {
		Produto.persist(product);
	}
	
	@GET
	@PostMapping("/products")
	public List<Produto> buscarTodosProdutos() throws NullPointerException{
		
	return Produto.listAll();
	
		
		
	}
}
