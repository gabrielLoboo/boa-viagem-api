package br.com.etechoracio.boa_viagem.entity;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Table(name = "TBL_GASTO")
public class Gasto {
	
	
	@Id
	@GeneratedValue private Long id;
	
	@Column(name="TX_DESC")
	private String descricao;
	
	@Column(name="TX_LOCAL")
	private String local;
	
	@Column(name="TX_CATEGORIA")
	private String categoria;
	
	@Column(name="DT_GASTO")
	private LocalDate gasto;
	
	@Column(name="VLR_VALOR")
	private Double valor;
	
	@Column(name="TX_VIAGEM")
	private Viagem viagem;
	
}
