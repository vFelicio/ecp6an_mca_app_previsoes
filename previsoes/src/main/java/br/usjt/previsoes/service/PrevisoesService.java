package br.usjt.previsoes.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.usjt.previsoes.model.Previsao;
import br.usjt.previsoes.repository.PrevisoesRepository;

@Service
public class PrevisoesService {
	@Autowired
	private PrevisoesRepository previsoesRepo;
	
	public void salvar(Previsao previsao) {
		previsoesRepo.save(previsao);
	}
	
	public List<Previsao> listarTodos(){
		List<Previsao> previsoes =  previsoesRepo.findAll();

		return previsoes;
	}
	
}
