package br.usjt.previsaotempo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.usjt.previsaotempo.model.Previsao;

@Repository
public interface PrevisaoRepository extends JpaRepository<Previsao, Long> {

}
