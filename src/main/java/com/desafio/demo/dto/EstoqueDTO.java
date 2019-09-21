package com.desafio.demo.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@AllArgsConstructor
@Data
@NoArgsConstructor
@Builder
public class EstoqueDTO {
    private Long id;
    private String nomeProduto;
    private BigDecimal valorProduto;
    private Long quantidade;
}
