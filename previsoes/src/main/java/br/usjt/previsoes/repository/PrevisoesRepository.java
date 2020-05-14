package br.usjt.previsoes.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.usjt.previsoes.model.Previsao;

public interface PrevisoesRepository extends JpaRepository<Previsao, Long> {
	
	

}
