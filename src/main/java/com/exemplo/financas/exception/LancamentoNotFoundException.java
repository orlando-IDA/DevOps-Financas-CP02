package com.exemplo.financas.exception;

public class LancamentoNotFoundException extends RuntimeException {
    public LancamentoNotFoundException(String message) {
        super(message);
    }
}
