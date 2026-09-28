package br.com.fatec.ninjas.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.fatec.ninjas.model.Cla;

public interface ClaRepository extends JpaRepository<Cla, Long> {

    // Query Method
    Cla findByNome(String nome);

    List<Cla> findByDescricaoContaining(String descricao);

}
