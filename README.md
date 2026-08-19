# Workshop Spring Boot + JPA

Este é o meu projeto de uma API RESTful completa para um sistema de e-commerce, que estou desenvolvendo no curso de Java.
## 🎯 Objetivos do Meu Projeto
* Criar um modelo de domínio complexo com associações (Um-para-Muitos, Muitos-para-Um, Um-para-Um e Muitos-para-Muitos).
* Implementar uma tabela associativa (tb_order_item) com chave primária composta (OrderItemPK) usando @EmbeddedId.
* Consolidar o padrão de arquitetura em camadas de mercado.
* Desenvolver um sistema robusto e padronizado de tratamento de exceções.

## 🏗️ Arquitetura do Sistema
Segui rigorosamente o padrão de desenvolvimento em camadas para garantir o isolamento de responsabilidades e facilidade de manutenção no meu código:

* **Camada de Controladores (Resource)**: Intercepta a rota Web e gerencia as respostas HTTP.
* **Camada de Serviço (Service)**: Concentra toda a lógica e as regras de negócio.
* **Camada de Acesso a Dados (Repository)**: Interface que gerencia as operações de CRUD no Banco.
## 🛠️ Tecnologias e Conceitos que Implementei
* **Spring Data JPA**: Abstração total de consultas SQL através da interface JpaRepository.
* **Database Seeding**: Instanciação automática de dados de teste (User, Order, Category, Product, OrderItem, Payment) ao iniciar a aplicação no perfil de teste (test).
* **Mapeamento de Enums**: Implementação segura de Enums (OrderStatus) gravando códigos inteiros de forma transparente no banco de dados.
* **Cálculos Dinâmicos**: Lógica matemática embutida nas entidades para cálculo de subtotal por item (price * quantity) e total geral do pedido através de loops acumuladores.
* **Carregamento Otimizado**: Uso do método repository.getReferenceById(id) no fluxo de atualização para evitar consultas desnecessárias ao banco de dados.

## 🛡️ Tratamento de Exceções Global (@ControllerAdvice)
Criei um interceptador global de erros (ResourceExceptionHandler) que captura as falhas em tempo de execução e as traduz em respostas JSON estruturadas (StandardError) enviadas ao cliente:
* **404 Not Found**: Disparado ao buscar ou tentar gerenciar IDs que não existem no banco de dados, utilizando validações modernas como existsById.
* **400 Bad Request**: Captura violações de integridade de dados (como tentar deletar um usuário que possui pedidos associados).

## 🚀 Como Executar o Meu Projeto

1. Certifique-se de ter o Java 17 ou superior e o Maven instalados na sua máquina.
2. Clone o meu repositório:
   git clone https://github.com/BenjaminSchill/workshop-springboot4-jpa.git
3. Importe o projeto na sua IDE (Eclipse, STS, IntelliJ).
4. Execute a classe principal CourseApplication.java como uma aplicação Java (Spring Boot App).
5. O servidor iniciará por padrão na porta 8080.

### Endpoints Disponíveis para Teste:
* **Usuários**: GET, POST, PUT, DELETE em http://localhost:8080/users
* **Pedidos**: GET em http://localhost:8080/orders
* **Produtos**: GET em http://localhost:8080/products
* **Categorias**: GET em http://localhost:8080/categories
* **Console do Banco H2**: Acesse http://localhost:8080/h2-console (JDBC URL: jdbc:h2:mem:testdb)
