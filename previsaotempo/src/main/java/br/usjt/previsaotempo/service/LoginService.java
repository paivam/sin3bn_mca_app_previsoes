package br.usjt.previsaotempo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.usjt.previsaotempo.model.Usuario;
import br.usjt.previsaotempo.repository.UsuarioRepository;

@Service
public class LoginService {

	@Autowired
	private UsuarioRepository usuRepo;
	
	public boolean logar(Usuario usuario) {
		return usuRepo.findOneByLoginAndSenha(usuario.getLogin(), usuario.getSenha() != null);
	}
}	
