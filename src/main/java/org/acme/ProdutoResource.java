package org.acme;

import javax.ws.rs.core.MediaType;
import java.util.List;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Consumes;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
@Path("produtos")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class ProdutoResource {
	
	@GET
	public List<Produto> buscarTodosProdutos() throws NullPointerException{
		
	return Produto.listAll();
	
		
		
	}
}
