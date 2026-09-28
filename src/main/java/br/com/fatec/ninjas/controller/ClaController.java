package br.com.fatec.ninjas.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.fatec.ninjas.model.Cla;
import br.com.fatec.ninjas.service.ClaService;
import jakarta.validation.Valid;

@RestController
@RequestMapping("/clas")
public class ClaController {

    @Autowired
    private ClaService claService;

    @PostMapping
    public Cla cadastrarCla(@Valid @RequestBody Cla cla) {
        return claService.cadastrarCla(cla);
    }

    @GetMapping
    public List<Cla> listarClas() {
        return claService.listarClas();
    }

    // PathVariable: converta o valor inserido na URL e armazene na variável ID
    @GetMapping("/id/{id}")
    public Optional<Cla> pesquisarCla(@PathVariable Long id) {
        return claService.pesquisarCla(id);
    }

    @GetMapping("/nome/{nome}")
    public Cla pesquisarClaPorNome(@PathVariable String nome) {
        return claService.pesquisarClaPorNome(nome);
    }

    @GetMapping("/descricao/{descricao}")
    public List<Cla> pesquisarClaPorParteDaDescricao(@PathVariable String descricao) {
        return claService.pesquisarClaPorParteDaDescricao(descricao);
    }

    @PutMapping("/{id}")
    public Cla atualizarCla(@PathVariable Long id, @Valid @RequestBody Cla cla) {
        return claService.atualizarCla(id, cla);
    }

    @DeleteMapping("/{id}")
    public void deletarCla(@PathVariable Long id) {
        claService.deletarCla(id);
    }
}
