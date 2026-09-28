package br.com.fatec.ninjas.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
@Entity
@Table(name = "cla")
@Valid
public class Cla {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id_cla;

    @Column(name = "nome_cla", nullable = false)
    @NotBlank(message = "O nome é obrigatório.")
    @Size(min = 3, max = 50, message = "Nome deve ter entre 3 e 50 caracteres.")
    private String nome;

    @Column(name = "descricao_cla", nullable = false)
    @NotBlank(message = "A descrição é obrigatória.")
    @Size(min = 3, max = 200, message = "Descrição deve ter entre 3 e 200 caracteres.")
    private String descricao;

    @Column(name = "habilidade_cla", nullable = false)
    @NotBlank(message = "A habilidade é obrigatória.")
    @Size(min = 3, max = 100, message = "Habilidade deve ter entre 3 e 100 caracteres.")
    private String habilidade;

}
