# E-Commerce Application 🛍️

A scalable, microservices-based e-commerce platform built with **Spring Boot** and modern architecture patterns. This project demonstrates enterprise-level backend development with distributed systems.

## 📋 Table of Contents

- [Features](#features)
- [Tech Stack](#tech-stack)
- [Architecture](#architecture)
- [Prerequisites](#prerequisites)
- [Installation](#installation)
- [Configuration](#configuration)
- [Running the Application](#running-the-application)
- [API Endpoints](#api-endpoints)
- [Project Structure](#project-structure)
- [Contributing](#contributing)
- [License](#license)

---

## ✨ Features

- **Microservices Architecture** - Scalable, loosely coupled services
- **RESTful APIs** - Clean and well-documented endpoints
- **Database Management** - Efficient data persistence
- **Authentication & Authorization** - Secure user management
- **Order Processing** - Complete order management workflow
- **Product Catalog** - Product management and search
- **Payment Integration** - Secure payment processing
- **Inventory Management** - Real-time stock tracking

---

## 🛠️ Tech Stack

| Component | Technology |
|-----------|-----------|
| **Language** | Java 11+ |
| **Framework** | Spring Boot 2.x / 3.x |
| **Architecture** | Microservices |
| **Database** | MySQL / PostgreSQL |
| **Build Tool** | Maven |
| **Containerization** | Docker |

---

## 🏗️ Architecture

```
┌─────────────────────────────────────────────────────────────┐
│                      API Gateway                             │
└────────────────┬────────────────────────────────────────────┘
                 │
    ┌────────────┼────────────┬──────────────┐
    ▼            ▼            ▼              ▼
┌─────────┐ ┌────────┐ ┌──────────┐ ┌──────────────┐
│ Product │ │ Order  │ │ Payment  │ │ Inventory    │
│ Service │ │Service │ │ Service  │ │ Service      │
└─────────┘ └────────┘ └──────────┘ └──────────────┘
     │          │           │              │
     └──────────┴───────────┴──────────────┘
            │
            ▼
     ┌─────────────────┐
     │   Databases     │
     └─────────────────┘
```

---

## 📋 Prerequisites

- **Java 11 or higher**
- **Maven 3.6+**
- **MySQL 5.7+ or PostgreSQL 12+**
- **Docker** (Optional)
- **Git**

---

## 🚀 Installation

### 1. Clone Repository

```bash
git clone https://github.com/rishavr920/E-commerce.git
cd E-commerce
```

### 2. Set Up Database

```bash
mysql -u root -p
CREATE DATABASE ecommerce;
```

### 3. Configure Application

Edit `src/main/resources/application.yml`:

```yaml
spring:
  datasource:
    url: jdbc:mysql://localhost:3306/ecommerce
    username: root
    password: your_password
  jpa:
    hibernate:
      ddl-auto: update
```

### 4. Build & Run

```bash
# Build
mvn clean install

# Run
mvn spring-boot:run
```

The application will start at `http://localhost:8080/api`

---

## ⚙️ Configuration

### Environment Variables

Create a `.env` file:

```bash
DB_HOST=localhost
DB_PORT=3306
DB_NAME=ecommerce
DB_USER=root
DB_PASSWORD=your_password
JAVA_OPTS=-Xmx512m
```

---

## 📡 API Endpoints

### Products
```
GET    /api/products              - Get all products
GET    /api/products/{id}         - Get product by ID
POST   /api/products              - Create product
PUT    /api/products/{id}         - Update product
DELETE /api/products/{id}         - Delete product
```

### Orders
```
GET    /api/orders                - Get all orders
GET    /api/orders/{id}           - Get order by ID
POST   /api/orders                - Create order
PUT    /api/orders/{id}           - Update order status
DELETE /api/orders/{id}           - Cancel order
```

### Payments
```
POST   /api/payments              - Process payment
GET    /api/payments/{id}         - Get payment status
```

### Users
```
POST   /api/users/register        - Register new user
POST   /api/users/login           - User login
GET    /api/users/{id}            - Get user profile
```

---

## 📂 Project Structure

```
E-commerce/
├── src/
│   ├── main/java/com/ecommerce/
│   │   ├── controller/           - REST controllers
│   │   ├── service/              - Business logic
│   │   ├── repository/           - Data access layer
│   │   ├── entity/               - JPA entities
│   │   ├── dto/                  - Data transfer objects
│   │   └── exception/            - Custom exceptions
│   └── resources/
│       ├── application.yml       - Main configuration
│       └── application-dev.yml   - Development config
├── pom.xml                       - Maven configuration
├── Dockerfile                    - Docker config
└── README.md
```

---

## 🐳 Running with Docker

```bash
# Build Docker image
docker build -t ecommerce-app .

# Run container
docker run -p 8080:8080 --env-file .env ecommerce-app

# Using docker-compose
docker-compose up -d
```

---

## 🧪 Testing

```bash
# Run unit tests
mvn test

# Run integration tests
mvn verify
```

---

## 🤝 Contributing

1. Fork the repository
2. Create feature branch: `git checkout -b feature/your-feature`
3. Commit: `git commit -m "Add: description"`
4. Push: `git push origin feature/your-feature`
5. Create Pull Request

---

## 📄 License

MIT License - see [LICENSE](LICENSE)

---

## 👥 Author

**Rishav Raj**
- GitHub: [@rishavr920](https://github.com/rishavr920)
- Email: rishavr920@gmail.com
- LinkedIn: [rishav-raj-232033184](https://www.linkedin.com/in/rishav-raj-232033184/)

---

## 📚 References

- [Spring Boot Documentation](https://spring.io/projects/spring-boot)
- [Microservices Architecture](https://martinfowler.com/microservices/)
- [RESTful API Design](https://restfulapi.net/)

---

⭐ If helpful, please star this repository!

**Status:** Active 🚀
