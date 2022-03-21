

package br.com.etechoracio.boa_viagem.entity;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.Table;


import lombok.Getter;
import lombok.Setter;

@Column
@Table
@Entity
@Getter
@Setter
public class Viagem {
	private Long id;
	private String destino;
	private String tipo;
	private LocalDate chegada;
	private LocalDate saida;
	private Double orcamento;
	private Integer pessoas;
}


