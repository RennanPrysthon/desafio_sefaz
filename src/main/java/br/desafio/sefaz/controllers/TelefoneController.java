package br.desafio.sefaz.controllers;

import br.desafio.sefaz.dto.TelefoneNewDTO;
import br.desafio.sefaz.dto.UsuarioDTO;
import br.desafio.sefaz.dto.UsuarioNewDTO;
import br.desafio.sefaz.models.Telefone;
import br.desafio.sefaz.models.Usuario;
import br.desafio.sefaz.repositories.UsuarioRepository;
import br.desafio.sefaz.services.TelefoneService;
import br.desafio.sefaz.services.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import javax.validation.Valid;
import java.net.URI;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping(value = "/telefone")
public class TelefoneController {

    @Autowired
    private UsuarioService usuarioService;

    @Autowired
    private TelefoneService telefoneService;

    @Autowired
    private UsuarioRepository usuarioRepository;

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public ResponseEntity<List<TelefoneNewDTO>> findTelefones(@PathVariable("id") Long id) {
        Usuario usuario = this.usuarioService.findById(id);
        List<TelefoneNewDTO> telefones = usuario.getTelefones().stream().map(TelefoneNewDTO::new).collect(Collectors.toList());
        return ResponseEntity.ok().body(telefones);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.POST)
    public ResponseEntity<List<URI>> addTelefone(@PathVariable("id") Long id, @RequestBody TelefoneNewDTO telefoneNewDTO) {
        Usuario usuario = this.usuarioService.findById(id);
        Telefone telefone = this.telefoneService.fromDTO(telefoneNewDTO);
        telefone.setUsuario(usuario);
        telefoneService.insert(telefone);

        usuario.getTelefones().add(telefone);
        usuarioRepository.save(usuario);

        URI uri = ServletUriComponentsBuilder.fromCurrentRequest()
                .path("/{id}").buildAndExpand(telefone.getId()).toUri();
        return ResponseEntity.created(uri).build();
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public ResponseEntity<Telefone> removeTelefone(@PathVariable("id") Long idTelefone) {
        this.telefoneService.delete(idTelefone);
        return ResponseEntity.noContent().build();
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.PUT)
    public ResponseEntity<Void> update(@RequestBody Telefone telefoneOld, @PathVariable("id") Long idTelefone) {
        telefoneOld.setId(idTelefone);
        this.telefoneService.update(telefoneOld);
        return ResponseEntity.noContent().build();
    }
}
