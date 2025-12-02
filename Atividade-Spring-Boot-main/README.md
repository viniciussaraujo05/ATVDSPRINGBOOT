# 🛒 Supermarket Manager — Spring Boot CRUD

Este é um projeto de **gerenciamento de supermercado** desenvolvido em **Spring Boot**, atendendo aos requisitos da 2ª fase do projeto:

✔ CRUD completo
✔ Relacionamentos entre entidades
✔ API REST
✔ Banco em memória H2
✔ Arquitetura organizada (Controller, Service, Repository)

---

## 📌 **Tecnologias usadas**

* Java 17+
* Spring Boot 3.x
* Spring Web
* Spring Data JPA
* H2 Database
* Maven

---

## 📂 **Entidades**

O sistema contém 5 entidades, com **quatro tipos diferentes de relacionamentos**:

### 1. **Category**

* One-to-Many → Products

### 2. **Supplier**

* One-to-Many → Products

### 3. **Product**

* Many-to-One → Category
* Many-to-One → Supplier
* One-to-One → ProductDetail
* Many-to-Many ↔ Orders

### 4. **ProductDetail**

* One-to-One → Product

### 5. **Order**

* Many-to-Many ↔ Products

---

## 🔗 **Relacionamentos implementados**

| Tipo de Relacionamento | Exemplo no Projeto      |
| ---------------------- | ----------------------- |
| 1–1 (One-to-One)       | Product ↔ ProductDetail |
| 1–N (One-to-Many)      | Category → Products     |
| N–1 (Many-to-One)      | Products → Supplier     |
| N–N (Many-to-Many)     | Orders ↔ Products       |

---

## 🚀 Endpoints principais

### 📦 Categorias (`/api/categories`)

| Método | Endpoint               | Descrição      |
| ------ | ---------------------- | -------------- |
| GET    | `/api/categories`      | Lista tudo     |
| POST   | `/api/categories`      | Cria categoria |
| DELETE | `/api/categories/{id}` | Remove         |

---

### 🛍 Fornecedores (`/api/suppliers`)

| Método | Endpoint              | Descrição |
| ------ | --------------------- | --------- |
| GET    | `/api/suppliers`      | Lista     |
| POST   | `/api/suppliers`      | Cria      |
| DELETE | `/api/suppliers/{id}` | Remove    |

---

### 🍎 Produtos (`/api/products`)

| Método | Endpoint             | Descrição |
| ------ | -------------------- | --------- |
| GET    | `/api/products`      | Lista     |
| POST   | `/api/products`      | Cria      |
| DELETE | `/api/products/{id}` | Remove    |

Exemplo de criação:

```json
{
  "name": "Arroz",
  "price": 10.50,
  "stock": 20,
  "category": { "id": 1 },
  "supplier": { "id": 1 }
}
```

### 📄 Detalhes do Produto (`/api/productdetails`)

| Método | Endpoint                   | Descrição |
| ------ | -------------------------- | --------- |
| GET    | `/api/productdetails`      | Lista     |
| POST   | `/api/productdetails`      | Cria      |
| DELETE | `/api/productdetails/{id}` | Remove    |


### 📦 Pedidos (`/api/orders`)

| Método | Endpoint           | Descrição |
| ------ | ------------------ | --------- |
| GET    | `/api/orders`      | Lista     |
| POST   | `/api/orders`      | Cria      |
| DELETE | `/api/orders/{id}` | Remove    |


## 📄 Licença

Uso livre para fins acadêmicos e profissionais.

---

## 👤 Autor
Vinicius Sales, Pedro Henrique Gomes, Murilo Sergio, Ryan Aguiar, Gabriell Nascimento.
