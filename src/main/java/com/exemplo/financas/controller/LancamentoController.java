package com.exemplo.financas.controller;

import com.exemplo.financas.entity.Lancamento;
import com.exemplo.financas.service.LancamentoService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/lancamentos")
@RequiredArgsConstructor
@CrossOrigin(origins = "*")
public class LancamentoController {
    
    private final LancamentoService lancamentoService;
    
    // GET: api/lancamentos
    @GetMapping
    public List<Lancamento> getAll() {
        return lancamentoService.listarTodos();
    }
    
    // GET: api/lancamentos/{id}
    @GetMapping("/{id}")
    public ResponseEntity<Lancamento> getById(@PathVariable Integer id) {
        return ResponseEntity.ok(lancamentoService.buscarPorId(id));
    }
    
    // POST: api/lancamentos
    @PostMapping
    public ResponseEntity<Lancamento> create(@RequestBody Lancamento lancamento) {
        Lancamento novoLancamento = lancamentoService.criar(lancamento);
        return ResponseEntity.status(HttpStatus.CREATED).body(novoLancamento);
    }
    
    // PUT: api/lancamentos/{id}
    @PutMapping("/{id}")
    public ResponseEntity<Lancamento> update(@PathVariable Integer id, @RequestBody Lancamento lancamento) {
        return ResponseEntity.ok(lancamentoService.atualizar(id, lancamento));
    }
    
    // DELETE: api/lancamentos/{id}
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Integer id) {
        lancamentoService.deletar(id);
        return ResponseEntity.noContent().build();
    }
}
