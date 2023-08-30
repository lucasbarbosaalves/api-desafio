package com.lucasalves.desafiocautus.controllers;

import com.lucasalves.desafiocautus.models.Fornecedor;
import com.lucasalves.desafiocautus.services.FornecedorService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/fornecedores")
public class FornecedorController {

    private FornecedorService fornecedorService;

    public FornecedorController(FornecedorService fornecedorService) {
        this.fornecedorService = fornecedorService;
    }

    @PostMapping(produces = "application/json", consumes = "application/json")
    public Fornecedor salvarFornecedor(@RequestBody @Valid Fornecedor fornecedor) {
        return fornecedorService.salvarFornecedor(fornecedor);
    }

    @GetMapping
    public Iterable<Fornecedor> listarFornecedores() {
        return fornecedorService.listarFornecedores();
    }
}
