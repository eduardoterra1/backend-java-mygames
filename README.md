# 🎮 My Games - Java

API REST desenvolvida com **Java 17** e **Spring Boot** para gerenciar uma biblioteca de jogos. O sistema permite consultar jogos, visualizar detalhes, organizar listas personalizadas e reordenar jogos dentro dessas listas, este projeto foi desenvolvido como aula no Bootcamp da plataforma DevSuperir, sendo ministrado pelo Dr. Prof Nelio Alves.

---

## 🚀 Tecnologias Utilizadas

- **Java 17**
- **Spring Boot**
  - Spring Web
- **Maven**
- **PostgreSQL**
  - Banco local para homologação
  - Banco em nuvem (Railway) para produção
- **H2 Database** (para testes locais)
- **Docker**
- **CI/CD com Railway**

---

## 🧩 Endpoints da API

### 🎲 Jogos

- `GET /games`  
  Retorna todos os jogos com informações resumidas.

- `GET /games/{id}`  
  Retorna os detalhes de um jogo específico.

### 📚 Listas de Jogos

- `GET /lists`  
  Retorna todas as listas de jogos disponíveis.

- `GET /lists/{listId}/games`  
  Retorna todos os jogos pertencentes a uma lista específica.

- `POST /lists/{listId}/replacement`  
  Move um jogo de uma posição para outra dentro da mesma lista.

---

## 🛠️ Configurações

### Banco de Dados

- **Homologação**: PostgreSQL local
- **Produção**: PostgreSQL em nuvem via [Railway](https://railway.app)
- **Testes**: Banco em memória H2

### Docker

O projeto possui suporte a **containerização com Docker** para facilitar o ambiente de desenvolvimento e deploy.

---

## ▶️ Como Executar

```bash
# Clonar o repositório
git clone https://github.com/seuusuario/backend-java-mygames.git
cd game-library-api

# Build com Maven
mvn clean install

# Rodar o projeto
mvn spring-boot:run
