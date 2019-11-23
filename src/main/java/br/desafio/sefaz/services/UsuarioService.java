package br.desafio.sefaz.services;

import br.desafio.sefaz.dto.UsuarioNewDTO;
import br.desafio.sefaz.models.Telefone;
import br.desafio.sefaz.models.Usuario;
import br.desafio.sefaz.repositories.TelefoneRepository;
import br.desafio.sefaz.repositories.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class UsuarioService {

    @Autowired
    private UsuarioRepository usuarioRepository;

    @Autowired
    private TelefoneRepository telefoneRepository;

    public List<Usuario> findAll() {
        return this.usuarioRepository.findAll();
    }

    public Usuario findById(Long id) {
        Usuario usuario = this.usuarioRepository.getOne(id);
        return usuario;
    }

    @Transactional
    public Usuario insert(Usuario obj){
        obj.setId(null);
        return this.usuarioRepository.save(obj);
    }

    public Usuario update(Usuario obj) {
        Usuario newObj = this.findById(obj.getId());
        updateData(newObj, obj);
        return this.usuarioRepository.save(newObj);
    }

    public void delete(Long id) {
        this.usuarioRepository.deleteById(id);
    }

    private void updateData(Usuario newObj, Usuario obj) {
        newObj.setNome(obj.getNome());
        newObj.setEmail(obj.getEmail());
    }

    public Usuario fromDTO(UsuarioNewDTO objDto) {
        return new Usuario(null, objDto.getNome(), objDto.getEmail(), objDto.getSenha(), new ArrayList<>());
    }

    public void atualizar(Usuario u){
        this.usuarioRepository.save(u);
    }

}
