package br.usjt.previsaotempo.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;
import br.usjt.previsaotempo.model.Usuario;
import br.usjt.previsaotempo.service.LoginService;

@Controller
public class LoginController {

	@Autowired
	private LoginService loginServ;

	@GetMapping(value = { "/login", "/" })
	public ModelAndView login() {
		ModelAndView mv = new ModelAndView("login");
		mv.addObject(new Usuario());
		return mv;
	}

	@PostMapping("/fazerLogin")
	public String fazerLogin(HttpServletRequest request, Usuario usuario) {
		if (loginServ.logar(usuario)) {
			request.getSession().setAttribute("usuario logou", usuario);
			return "redirect:previsao";
		} else {
			return "login";
		}
	}

}
