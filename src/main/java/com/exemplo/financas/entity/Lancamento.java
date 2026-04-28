package com.exemplo.financas.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Table(name = "transacoes")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Lancamento {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;
    
    @Column(name = "descricao", nullable = false, length = 255)
    private String descricao;
    
    @Column(name = "valor", precision = 10, scale = 2)
    private BigDecimal valor;
    
    @Column(name = "data_transacao")
    private LocalDateTime dataTransacao;
    
    @PrePersist
    protected void onCreate() {
        if (dataTransacao == null) {
            dataTransacao = LocalDateTime.now();
        }
    }
}
