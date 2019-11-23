package br.desafio.sefaz.services;

import br.desafio.sefaz.dto.TelefoneNewDTO;
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

@Service
public class TelefoneService {

    @Autowired
    private TelefoneRepository telefoneRepository;

    @Autowired
    private UsuarioRepository usuarioRepository;

    public List<Telefone> findAll() {
        return this.telefoneRepository.findAll();
    }

    public List<Telefone> findByUserId(Long id) {
        Usuario usuario = this.usuarioRepository.getOne(id);
        return usuario.getTelefones();
    }

    public Telefone findById(Long id) {
        Telefone telefone = this.telefoneRepository.getOne(id);
        return telefone;
    }

    @Transactional
    public Telefone insert(Telefone obj){
        obj.setId(null);
        return this.telefoneRepository.save(obj);
    }

    public Telefone update(Telefone obj) {
        Telefone newObj = this.findById(obj.getId());
        updateData(newObj, obj);
        return this.telefoneRepository.save(newObj);
    }

    public void delete(Long id) {
        this.telefoneRepository.deleteById(id);
    }

    private void updateData(Telefone newObj, Telefone obj) {
        newObj.setDdd(obj.getDdd());
        newObj.setNumero(obj.getNumero());
        newObj.setTipo(obj.getTipo());
    }

    public Telefone fromDTO(TelefoneNewDTO objDto) {
        return new Telefone(null, objDto.getDdd(), objDto.getNumero(), objDto.getTipo(), null);
    }

}
