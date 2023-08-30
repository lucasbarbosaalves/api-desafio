package com.lucasalves.desafiocautus.repositories;

import com.lucasalves.desafiocautus.models.Contato;
import com.lucasalves.desafiocautus.models.Fornecedor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContatoRepository extends JpaRepository<Contato, Long>{
}
