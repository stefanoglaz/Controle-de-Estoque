package com.desafio.demo.service;

import com.desafio.demo.entity.Produto;
import com.desafio.demo.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProdutoService extends AbstractService<ProdutoRepository, Produto, Long> {

    @Autowired
    public ProdutoService(ProdutoRepository repository) {
        super(repository);
    }
}
