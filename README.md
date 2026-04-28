# Financas API

API para gerenciamento de lancamentos financeiros.
Esta API e uma versao Java Spring Boot baseada no projeto ApiTransacoes (C#).

## Tecnologias Utilizadas

- Java 17
- Spring Boot 3.2.0
- Spring Data JPA
- MySQL
- Lombok

## Endpoints

### Transacoes

- GET /api/transacoes: Lista todas as transacoes (lancamentos)
- GET /api/transacoes/{id}: Busca uma transacao pelo ID
- POST /api/transacoes: Cria uma nova transacao
- PUT /api/transacoes/{id}: Atualiza uma transacao existente
- DELETE /api/transacoes/{id}: Remove uma transacao

## Como Executar

1. Configure o banco de dados MySQL no arquivo application.properties
2. Execute o comando: mvn spring-boot:run
