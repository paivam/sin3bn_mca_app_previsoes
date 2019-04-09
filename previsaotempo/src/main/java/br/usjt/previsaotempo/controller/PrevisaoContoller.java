package br.usjt.previsaotempo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import br.usjt.previsaotempo.model.Previsao;
import br.usjt.previsaotempo.repository.PrevisaoRepository;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;

@Controller
public class PrevisaoContoller {
    
	@Autowired
	private PrevisaoRepository PrevRepo;
	
	@GetMapping ("/previsao")
	public ModelAndView Listarpervisao() {
		ModelAndView vm = new ModelAndView ("previsao_list");
		List<Previsao> previsao = PrevRepo.findAll();
		vm.addObject("previsao", previsao);
		
		return vm;
	}
}
