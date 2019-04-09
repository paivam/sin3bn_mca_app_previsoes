package br.usjt.previsaotempo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.usjt.previsaotempo.model.Previsao;
import br.usjt.previsaotempo.repository.PrevisaoRepository;

@Service
public class PrevisaoService {

	@Autowired
	private PrevisaoRepository prevRepo;
	
	public void salvar (Previsao previsao) {
		prevRepo.save(previsao);
	}
    
	public List <Previsao> listartodas(){
          return prevRepo.findAll();
		
   }

}
