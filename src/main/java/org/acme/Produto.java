package org.acme;

import javax.persistence.Entity;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import io.quarkus.hibernate.orm.panache.PanacheEntity;
import java.util.Date;
import java.math.BigDecimal;

import java.util.List;

@Entity
public class Produto extends PanacheEntity {

	public String nome;
	
	public BigDecimal valor;
	
	@CreationTimestamp
	public Date dataCriacao;
	
	@UpdateTimestamp
	public Date dataAtualização;
	
	
	
}
