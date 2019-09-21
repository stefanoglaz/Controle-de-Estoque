package com.desafio.demo.mapper;

import com.desafio.demo.dto.EstoqueDTO;
import com.desafio.demo.entity.Estoque;
import com.desafio.demo.entity.Produto;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

@Mapper(componentModel = "spring")
public interface ProdutoMapper {

    @Mappings({
            @Mapping(source = "id", target = "id"),
            @Mapping(source = "nome", target = "nomeProduto"),
            @Mapping(source = "estoque.quantidade", target = "quantidade"),
            @Mapping(source = "valor", target = "valorProduto"),
    })
    EstoqueDTO map(Produto produto);

   // List<EstoqueDTO> map(List<Produto> produtos);

}
