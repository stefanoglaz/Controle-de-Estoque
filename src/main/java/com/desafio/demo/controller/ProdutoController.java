package com.desafio.demo.controller;


import com.desafio.demo.dto.EstoqueDTO;
import com.desafio.demo.entity.Estoque;
import com.desafio.demo.entity.Produto;
import com.desafio.demo.mapper.ProdutoMapper;
import com.desafio.demo.service.EstoqueService;
import com.desafio.demo.service.ProdutoService;
import com.sun.deploy.security.SelectableSecurityManager;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import javax.validation.constraints.Null;
import java.util.List;
import java.util.Optional;

@RestController
@AllArgsConstructor
public class ProdutoController {

    private ProdutoService service;
    private EstoqueService estoqueService;
    private ProdutoMapper produtoMapper;

    @PostMapping("/produto")
    public EstoqueDTO save(@RequestBody Produto produto) {

            Produto product = service.save(produto);
            Estoque estoque = new Estoque();
            estoque.setProduto(product);
            estoque.setQuantidade(0L);
            estoqueService.save(estoque);
            return produtoMapper.map(product);
        }



    @PutMapping("/produto/{id}/estoque")
    public EstoqueDTO upDateQuantidade(@RequestParam Long quantidade, @PathVariable Long id) {
        Produto produto = service.findById(id).orElseThrow(() -> new NullPointerException());
        produto.getEstoque().setQuantidade(quantidade);
        estoqueService.save(produto.getEstoque());
        return produtoMapper.map(service.findById(id).orElse(null));
    }


}
