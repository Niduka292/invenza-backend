# 🧠 Invenza Backend

Backend service for **Invenza** — a smart kitchen inventory management system designed to reduce food waste through intelligent tracking and analytics.

---

## 🚀 Overview

Invenza helps users manage their kitchen inventory efficiently by:

* 📦 Tracking food items and quantities
* ⏰ Monitoring expiry dates
* 🧠 Enabling future smart features like consumption prediction and recipe suggestions

This repository contains the **Spring Boot backend API** that powers the application.

---

## 🏗️ Tech Stack

* **Java Spring Boot** – REST API & business logic
* **PostgreSQL** – Relational database
* **JPA / Hibernate** – ORM for database interaction
* **Maven** – Dependency management

---

## 📂 Project Structure

```
com.invenza
│
├── controller        # REST API endpoints
├── service           # Business logic
│   └── impl
├── repository        # Database access (JPA)
├── entity            # Database models
├── dto               # Request/response objects
├── config            # Configuration (security, etc.)
```

---

## 🔑 Core Features (MVP)

* 👤 User registration & login
* 🏠 Inventory (kitchen) management
* 📦 Item management:

  * Add items
  * View items
  * Update items
  * Delete items
* ⏰ Expiry tracking

---

## 🧩 Database Design

Key entities:

* **User**
* **Inventory**
* **Item**
* **UserInventory** (mapping for shared inventories)

📊 See `/docs` folder for:

* ER Diagram
* Relational Schema

---

## ⚙️ Getting Started

### 🔧 Prerequisites

* Java 17+
* Maven
* PostgreSQL

---

### 🛠️ Setup

1. Clone the repository:

```bash
git clone https://github.com/your-username/invenza-backend.git
cd invenza-backend
```

2. Configure database in `application.properties`:

```properties
spring.datasource.url=jdbc:postgresql://localhost:5432/invenza
spring.datasource.username=your_username
spring.datasource.password=your_password

spring.jpa.hibernate.ddl-auto=update
```

3. Run the application:

```bash
./mvnw spring-boot:run
```

---

## 🔗 API Endpoints (Sample)

### 📦 Items

* `GET /api/items?inventoryId={id}` → Get all items
* `POST /api/items` → Add item
* `PUT /api/items/{id}` → Update item
* `DELETE /api/items/{id}` → Delete item

---

## 🔐 Security

* Basic authentication (JWT planned)
* Data access restricted by `inventory_id`

---

## 🚧 Future Enhancements

* 🤖 AI-based consumption prediction
* 📷 Barcode scanning (OpenCV)
* 🧾 Receipt OCR integration
* 🔔 Smart notifications
* 🍽️ Recipe recommendations

---

## 📌 Design Principles

* Clean separation of concerns (Controller → Service → Repository)
* Scalable architecture for future AI integration
* Avoid storing derived data (calculated dynamically)

---

## 📄 License

This project is licensed under the MIT License.

---

## 👨‍💻 Author

Developed as part of the **Invenza** project — a smart solution for reducing household food waste.
