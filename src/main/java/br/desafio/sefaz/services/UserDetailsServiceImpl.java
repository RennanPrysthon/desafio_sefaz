package br.desafio.sefaz.services;

import br.desafio.sefaz.models.Usuario;
import br.desafio.sefaz.repositories.UsuarioRepository;
import br.desafio.sefaz.security.UserSS;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {

    @Autowired
    private UsuarioRepository usuarioRepository;

    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
        Usuario usua = this.usuarioRepository.findByEmail(email);

        if ( usua == null) {
            throw new UsernameNotFoundException(email);
        }
        return new UserSS(usua.getId(), usua.getEmail(), usua.getSenha(), usua.getPerfis());
    }
}
