package br.usjt.previsoes.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.usjt.previsoes.model.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario,Long> {
	public Usuario findOneByLoginAndSenha(String login, String senha);
}
