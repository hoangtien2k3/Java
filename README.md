<p align="center">
    <img src="https://resources.jetbrains.com/storage/products/company/brand/logos/jb_beam.svg" height="150">
    <img src="https://2.bp.blogspot.com/-gphUOIAs3Fw/Xdj35REehzI/AAAAAABHMxM/EYOFvtkYx0A1AQo839vnfNnj0ORDf7SywCLcBGAsYHQ/s1600/AW4045541_23.gif" height="150">
</p>

[![Build](https://github.com/hoangtien2k3qx1/Java/actions/workflows/build.yml/badge.svg?branch=master)](https://github.com/hoangtien2k3qx1/Java/blob/main/DIRECTORY.md)
[![Discord chat](https://img.shields.io/discord/808045925556682782.svg?logo=discord&colorB=7289DA&style=flat-square)](https://discord.gg/cFAkCXVQ)
[![Gitpod ready-to-code](https://img.shields.io/badge/Gitpod-ready--to--code-blue?logo=gitpod)](https://gitpod.io/#https://github.com/hoangtien2k3qx1)

Full My [**Directory**](DIRECTORY.md) has the full list of applications. [backend](https://github.com/hoangtien2k3qx1/Java/blob/main/src/java/ProgrammingBook/roadmap-backend.pdf)

### All Project are implemented in Java.
These implementations are intended for learning purposes. As such, project java may be less efficient than the Java standard library.


[hệ thống booking bằng micro service hỗ trợ chịu tải lớn bằng Java và Spring boot, MySQL](https://viblo.asia/p/thiet-ke-chi-tiet-he-thong-booking-bang-micro-service-ho-tro-chiu-tai-lon-bang-java-va-spring-boot-mysql-AZoJjXeyVY7?fbclid=IwAR3XuTJSOxyYNQ_xHfu17_K-GnmdfAvZiEfNsUSv2AUhG2-PSgNAHnth0nM)


```mermaid
graph TD;
    Back-End-->Language;
    Language-->Java
    Language-->Golang
    Language-->Python
    
    Back-End-->Database;
    Database-->MySQL;
    Database-->MongoDB;
    Database-->PostgreSQL;
    
    Back-End-->Frameworks;
    Frameworks-->Spring
    Frameworks-->Laravel
    
    Back-End-->Web;
    Web-->HTTP
    Web-->TCP/IP
    Web-->SMTP

    Back-End-->Microservices;
    Microservices-->RESTfulAPI
    Microservices-->MessageQueueing
    Microservices-->Postman
    Microservices-->API
    Microservices-->JSON
    
    
    Back-End-->Docker;
    Back-End-->Containerization
   
```


```mermaid
graph LR;
    Client-- Gửi request --> Frontend;
    Frontend-- Truyền request --> Backend;
    Backend-- Xử lý request --> Application;
    Application-- Truy vấn database --> Database;
    Application-- Trả về response --> Backend;
    Backend-- Truyền response --> Frontend;
    Frontend-- Hiển thị response --> Client;
```



```mermaid
graph LR;
    A[Backend Developer] -- Ngôn ngữ lập trình --> B[Programming Language]
    A -- Framework --> C[Web Framework]
    A -- Cơ sở dữ liệu --> D[Database]
    A -- Server --> E[Web Server]
    A -- RESTful API --> F[API]
    A -- Các công cụ phát triển --> G[Development Tools]
    A -- Kiến trúc phân tán --> H[Distributed Architecture]
    A -- Triển khai --> I[Deployment]

    subgraph Programming Language
        B -- Syntax --> J
        B -- Data Types --> K
        B -- Control Flow --> L
        B -- Functions --> M
        B -- Object-Oriented Programming --> N
    end

    subgraph Web Framework
        C -- Routing --> O
        C -- Model-View-Controller (MVC) Architecture --> P
        C -- ORM/ODM --> Q
        C -- Middleware --> R
        C -- Authentication and Authorization --> S
    end

    subgraph Database
        D -- Relational Databases --> T
        D -- Non-Relational Databases --> U
        D -- Data Modeling --> V
        D -- Querying and Manipulating Data --> W
        D -- Transactions and Concurrency --> X
    end

    subgraph Web Server
        E -- HTTP Protocol --> Y
        E -- Reverse Proxy --> Z
        E -- Load Balancing --> AA
        E -- Caching --> AB
        E -- Security --> AC
    end

    subgraph Development Tools
        G -- Integrated Development Environment (IDE) --> AD
        G -- Version Control System (VCS) --> AE
        G -- Testing Framework --> AF
        G -- Debugging Tools --> AG
        G -- Build and Deployment Tools --> AH
    end

    subgraph Distributed Architecture
        H -- Microservices --> AI
        H -- Service-Oriented Architecture (SOA) --> AJ
        H -- Message Queues --> AK
        H -- Event-Driven Architecture --> AL
        H -- Containers and Orchestration --> AM
    end

    subgraph Deployment
        I -- Infrastructure as a Service (IaaS) --> AN
        I -- Platform as a Service (PaaS) --> AO
        I -- Continuous Integration and Continuous Deployment (CI/CD) --> AP
        I -- Scalability --> AQ
        I -- Monitoring and Logging --> AR
    end

