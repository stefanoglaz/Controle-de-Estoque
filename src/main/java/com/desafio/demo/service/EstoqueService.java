package com.desafio.demo.service;


import com.desafio.demo.entity.Estoque;
import com.desafio.demo.repository.EstoqueRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EstoqueService extends AbstractService<EstoqueRepository, Estoque,Long> {

    @Autowired
    public EstoqueService(EstoqueRepository repository) {
        super(repository);
    }
}
