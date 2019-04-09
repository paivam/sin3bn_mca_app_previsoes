package br.usjt.previsaotempo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import br.usjt.previsaotempo.model.Previsao;

public interface PrevisaoRepository extends JpaRepository<Previsao, Long> {

}
