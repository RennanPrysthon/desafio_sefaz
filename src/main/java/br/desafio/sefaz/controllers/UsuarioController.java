package br.desafio.sefaz.controllers;

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
@CrossOrigin(origins = "https://rennan-desafio-sefaz.herokuapp.com")
@RestController
@RequestMapping(value = "/usuario")
public class UsuarioController {

    @Autowired
    private UsuarioService usuarioService;

    @Autowired
    private TelefoneService telefoneService;

    @Autowired
    private UsuarioRepository usuarioRepository;

    @RequestMapping(value = "", method = RequestMethod.GET)
    public ResponseEntity<List<UsuarioDTO>> findAll() {
        List<Usuario> usuarios = this.usuarioService.findAll();
        List<UsuarioDTO> usuarioDTOS = usuarios.stream().map(UsuarioDTO::new).collect(Collectors.toList());
        return ResponseEntity.ok().body(usuarioDTOS);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public ResponseEntity<Usuario> findById(@PathVariable("id") Long id){
        Usuario usuario = this.usuarioService.findById(id);
        return ResponseEntity.ok().body(usuario);
    }

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public ResponseEntity<Usuario> findById(@RequestParam("email") String email){
        Usuario usuario = this.usuarioService.findByEmail(email);
        return ResponseEntity.ok().body(usuario);
    }

    @RequestMapping(value = "", method = RequestMethod.POST)
    public ResponseEntity<Void> insert(@Valid @RequestBody UsuarioNewDTO objDto){
        Usuario obj = this.usuarioService.fromDTO(objDto);
        obj = this.usuarioService.insert(obj);
        URI uri = ServletUriComponentsBuilder.fromCurrentRequest()
                .path("/{id}").buildAndExpand(obj.getId()).toUri();
        return ResponseEntity.created(uri).build();
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.PUT)
    public ResponseEntity<Void> update(@RequestBody Usuario usuarioOld, @PathVariable("id") Long id) {
        usuarioOld.setId(id);
        this.usuarioService.update(usuarioOld);
        return ResponseEntity.noContent().build();
    }

    @RequestMapping(value="/{id}", method = RequestMethod.DELETE)
    public ResponseEntity<Void> delete(@PathVariable Long id){
        Usuario usuario = this.usuarioService.findById(id);
        List<Telefone> telefones = usuario.getTelefones();
        for (Telefone t: telefones) {
            this.telefoneService.delete(t.getId());
        }
        this.usuarioService.delete(id);
        return ResponseEntity.noContent().build();
    }
}
