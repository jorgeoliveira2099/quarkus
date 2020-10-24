package org.acme;

import javax.ws.rs.core.MediaType;
import java.util.List;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Consumes;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import org.springframework.web.bind.annotation.*;
import javax.transaction.Transactional;
import javax.ws.rs.Consumes;
import javax.ws.rs.Produces;

@RestController
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class UserResource {
	
	@PostMapping("/user")
	@Transactional
	
	public void addUser(User user) {
		User.persist(user);
	}
		

	@GET
	@GetMapping("/users")
	public List<User> buscarTodosProdutos() throws NullPointerException{
		
	return User.listAll();
	
		
		
	}
	
}
