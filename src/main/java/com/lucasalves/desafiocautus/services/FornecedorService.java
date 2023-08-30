package com.lucasalves.desafiocautus.services;

import com.lucasalves.desafiocautus.models.Fornecedor;
import com.lucasalves.desafiocautus.repositories.FornecedorRepository;
import jakarta.validation.Valid;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Service
public class FornecedorService {

    private FornecedorRepository fornecedorRepository;

    public FornecedorService(FornecedorRepository fornecedorRepository) {
        this.fornecedorRepository = fornecedorRepository;
    }

    public Fornecedor salvarFornecedor(Fornecedor fornecedor) {
        return fornecedorRepository.save(fornecedor);
    }

    public Iterable<Fornecedor> listarFornecedores() {
        return fornecedorRepository.findAll();
    }
}
