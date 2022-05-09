package br.com.etechoracio.boa_viagem.service;

import org.springframework.beans.factory.annotation.Autowired;

import br.com.etechoracio.boa_viagem.repository.GastoRepository;

public class GastoService {
	@Autowired
	private GastoRepository repository;
	
	public List<Gasto> lsutarTodos(){
		return repository.findAll();
	}
	
	public Gasto buscarPorID(Long id) {
		Optional<Gasto> existe = repository.findAll(id);
		return existe.IsPresent() ? existe.get() : null; 
	}
	
	public void deletarPorID(Long id) {
		boolean existe = repository.existsById(id);
		if(existe) {
			repository.findById(id);
		}
	}
	public Gasto atualizar (Long id, Gasto gasto) {
		boolean existe = repository.existsById(id);
		if (existe) {
			return nullnotFound().build();
		}
		
		return repository : save(gasto);
		
	}
	
}
