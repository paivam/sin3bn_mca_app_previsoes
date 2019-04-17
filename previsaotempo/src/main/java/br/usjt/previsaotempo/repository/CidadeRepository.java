package br.usjt.previsaotempo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import br.usjt.previsaotempo.model.Cidade;

public interface CidadeRepository extends JpaRepository<Cidade, Long>{

	public Cidade findByLatitudeAndLongitude (double latitude, double longitude);
   
	public Cidade findByNome (String nome);
	
	public Cidade findByNomeIgnoreCase (String Nome);
    
}
