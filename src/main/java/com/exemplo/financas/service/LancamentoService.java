package com.exemplo.financas.service;

import com.exemplo.financas.entity.Lancamento;
import com.exemplo.financas.exception.LancamentoNotFoundException;
import com.exemplo.financas.repository.LancamentoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor
public class LancamentoService {
    
    private final LancamentoRepository lancamentoRepository;
    
    @Transactional(readOnly = true)
    public List<Lancamento> listarTodos() {
        return lancamentoRepository.findAll();
    }
    
    @Transactional(readOnly = true)
    public Lancamento buscarPorId(Integer id) {
        return lancamentoRepository.findById(id)
                .orElseThrow(() -> new LancamentoNotFoundException("Lançamento não encontrado com ID: " + id));
    }
    
    @Transactional
    public Lancamento criar(Lancamento lancamento) {
        return lancamentoRepository.save(lancamento);
    }
    
    @Transactional
    public Lancamento atualizar(Integer id, Lancamento lancamentoAtualizado) {
        Lancamento lancamento = buscarPorId(id);
        
        lancamento.setDescricao(lancamentoAtualizado.getDescricao());
        lancamento.setValor(lancamentoAtualizado.getValor());
        lancamento.setDataTransacao(lancamentoAtualizado.getDataTransacao());
        
        return lancamentoRepository.save(lancamento);
    }
    
    @Transactional
    public void deletar(Integer id) {
        Lancamento lancamento = buscarPorId(id);
        lancamentoRepository.delete(lancamento);
    }
}
