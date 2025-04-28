# Portfolio API - Backend Pessoal Java

📋 **Descrição do Projeto**

Portfolio API é uma aplicação backend desenvolvida em Java com Spring Boot para gerenciar um portfólio profissional completo. Esta API permite armazenar, gerenciar e disponibilizar informações sobre seu perfil profissional, projetos, habilidades técnicas, experiências de trabalho, formação acadêmica e mensagens de contato.

A API foi projetada seguindo os princípios de arquitetura em camadas, REST, e utilizando as melhores práticas de desenvolvimento Java.

---

🚀 **Funcionalidades**

- **Gestão de Perfil Pessoal:** Armazene e atualize suas informações pessoais e profissionais
- **Gerenciamento de Projetos:** Cadastre projetos desenvolvidos com descrições, imagens, links para repositórios e demonstrações
- **Controle de Habilidades Técnicas:** Catalogue suas competências técnicas por categoria e nível de conhecimento
- **Registro de Experiências Profissionais:** Mantenha um histórico de suas experiências de trabalho com descrições detalhadas
- **Cadastro de Formação Acadêmica:** Registre sua formação educacional e certificações
- **Sistema de Contato:** Receba e gerencie mensagens de contato via formulário
- **Autenticação e Autorização:** Sistema seguro para administração do conteúdo

---

🔧 **Tecnologias Utilizadas**

- Java 17
- Spring Boot 3.0
- Spring Data JPA
- Spring Security
- JWT para autenticação
- Hibernate
- PostgreSQL (ou seu banco de dados preferido)
- Maven
- JUnit 5
- Swagger/OpenAPI para documentação

---

📁 **Estrutura do Projeto**

```
portfolio-api
│
├─ config          // Configurações da aplicação
├─ seguranca       // Configurações de segurança
├─ modelo          // Entidades e modelos de domínio
├─ repositorio     // Interfaces de acesso a dados
├─ servico         // Regras de negócio
├─ controlador     // Endpoints da API
├─ dto             // Objetos de transferência de dados
└─ util            // Classes utilitárias
```

---

🏗️ **Arquitetura**

A aplicação segue uma arquitetura em camadas:

- **Camada de Controlador:** Recebe as requisições HTTP e delega para a camada de serviço
- **Camada de Serviço:** Implementa a lógica de negócio e orquestra as operações
- **Camada de Repositório:** Responsável pelo acesso aos dados
- **Camada de Modelo:** Define as entidades do domínio

---

📝 **Principais Classes**

**Entidades:**

- **Pessoa:** Representa o perfil profissional com dados pessoais e links de redes sociais
- **Projeto:** Armazena informações sobre projetos desenvolvidos
- **Habilidade:** Representa competências técnicas categorizadas por área
- **ExperienciaProfissional:** Registra experiências de trabalho
- **Formacao:** Armazena dados de formação acadêmica
- **Contato:** Gerencia mensagens recebidas pelo formulário de contato
- **Usuario:** Gerencia credenciais para acesso administrativo

---

**APIs Expostas**

| Endpoint                         | Método | Descrição                        | Acesso      |
|----------------------------------|--------|----------------------------------|-------------|
| `/api/perfil`                    | GET    | Obtém perfil pessoal             | Público     |
| `/api/perfil`                    | PUT    | Atualiza perfil                  | Autenticado |
| `/api/projetos`                  | GET    | Lista todos os projetos          | Público     |
| `/api/projetos/destaques`         | GET    | Lista projetos destacados        | Público     |
| `/api/projetos/{id}`              | GET    | Obtém projeto por ID             | Público     |
| `/api/projetos`                  | POST   | Cria novo projeto                | Autenticado |
| `/api/projetos/{id}`              | PUT    | Atualiza projeto                 | Autenticado |
| `/api/projetos/{id}`              | DELETE | Remove projeto                   | Autenticado |
| `/api/habilidades`               | GET    | Lista habilidades                | Público     |
| `/api/experiencias`              | GET    | Lista experiências profissionais | Público     |
| `/api/formacoes`                 | GET    | Lista formação acadêmica         | Público     |
| `/api/contatos`                  | POST   | Envia mensagem de contato        | Público     |
| `/api/contatos`                  | GET    | Lista mensagens de contato       | Autenticado |
| `/api/auth/login`                | POST   | Autenticação de usuário          | Público     |

---

⚙️ **Como Executar o Projeto**

**Pré-requisitos**

- Java 17+
- Maven
- PostgreSQL (ou outro banco de dados relacional)

**Configuração**

Clone o repositório:

```bash
git clone https://github.com/seu-usuario/portfolio-api.git
cd portfolio-api
```

Configure o banco de dados no arquivo `application.yml`:

```yaml
spring:
  datasource:
    url: jdbc:postgresql://localhost:5432/portfolio
    username: seu_usuario
    password: sua_senha
  jpa:
    hibernate:
      ddl-auto: update
    show-sql: true
```

Compile e execute:

```bash
mvn clean install
mvn spring-boot:run
```

A API estará disponível em: [http://localhost:8080](http://localhost:8080)

---

📊 **Modelagem de Dados**

**Diagrama de Entidade-Relacionamento**

```
Pessoa (1) ---- (N) Habilidade
Pessoa (1) ---- (N) Projeto
Pessoa (1) ---- (N) ExperienciaProfissional
Pessoa (1) ---- (N) Formacao
Pessoa (1) ---- (N) Contato
```

---

🔒 **Segurança**

- Utiliza Spring Security com autenticação JWT
- **Endpoints públicos:** Acesso às informações do portfólio
- **Endpoints privados:** Administração do conteúdo (requer autenticação)
- Tokens JWT com expiração de 24 horas
- Senhas armazenadas com BCrypt

---

📝 **Documentação da API**

A documentação da API está disponível através do Swagger/OpenAPI no endpoint:

[http://localhost:8080/swagger-ui.html](http://localhost:8080/swagger-ui.html)

---

🧪 **Testes**

O projeto inclui testes unitários e de integração. Para executar os testes:

```bash
mvn test
```

---

🚀 **Roadmap**

Funcionalidades planejadas para o futuro:

- [ ] Suporte para múltiplos idiomas no perfil
- [ ] Sistema de tags para projetos
- [ ] Upload de imagens e arquivos
- [ ] Integração com CI/CD
- [ ] Exportação de currículo em PDF
- [ ] Estatísticas de visualização do perfil

---

👥 **Contribuição**

Contribuições são bem-vindas! Sinta-se à vontade para abrir issues ou enviar pull requests.

1. Faça um fork do projeto
2. Crie uma branch para sua feature:
   ```bash
   git checkout -b feature/nova-funcionalidade
   ```
3. Commit suas mudanças:
   ```bash
   git commit -m 'Adiciona nova funcionalidade'
   ```
4. Push para a branch:
   ```bash
   git push origin feature/nova-funcionalidade
   ```
5. Abra um Pull Request

---

📄 **Licença**

Este projeto está licenciado sob a licença MIT - veja o arquivo [LICENSE.md](LICENSE.md) para detalhes.

---

📞 **Contato**

Rodrigo - rodrigoeduque@hotmail.com

Link do projeto: [https://github.com/seu-usuario/portfolio-api](https://github.com/seu-usuario/portfolio-api)
```
