package com.lucasalves.desafiocautus.models;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotEmpty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Table(name = "tb_fornecedor")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Fornecedor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotEmpty
    private String endereco;
    @NotEmpty
    private String razaoSocial;
    @OneToMany(mappedBy = "fornecedor", cascade = CascadeType.ALL)
    @NotEmpty
    private List<Contato> contatos;
}
