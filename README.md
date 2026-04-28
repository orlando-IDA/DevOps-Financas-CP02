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

### Lancamentos

- GET /api/lancamentos: Lista todos os lancamentos
- GET /api/lancamentos/{id}: Busca um lancamento pelo ID
- POST /api/lancamentos: Cria um novo lancamento
- PUT /api/lancamentos/{id}: Atualiza um lancamento existente
- DELETE /api/lancamentos/{id}: Remove um lancamento

## Como Executar

1. Configure o banco de dados MySQL no arquivo application.properties
2. Execute o comando: mvn spring-boot:run
