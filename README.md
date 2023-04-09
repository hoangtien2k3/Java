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


