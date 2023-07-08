# Spring-Cloud-Shelf

spring cloud openfeign 简单的框架
spring boot+openfeign实现微服务的简单远程调用

## 介绍

项目名称为: Spring-Cloud-Shelf

### 模块

- cloud-produce: 生产者模块，用于提供给消费者进行调用的api接口
- cloud-consumer: 消费者模块，用于使用openfeign进行调用生产者的api接口进行使用
- cloud-openfeign-api: openfeign-api模块，用于编写openfeign 的调用接口
- cloud-commons: 公共模块，用于存放其他模块公共使用的类

## 使用技术及插件

|技术|框架|
|--|--|
| java | 1.8 |
| Spring boot | 2.3.12.RELEASE |
| spring Cloud | Hoxton.SR12 |
| lombok | 1.18.28 |
| slf4j | 2.0.7 |
| hutool工具 | 5.8.20 |
| fastjson2 | 2.0.34 |
| junit | 4.13.2 |

## 使用介绍
第一步：启动`cloud-produce` 模块的`com.ukayunnuo.produce.ProduceApp.java` 生产者 启动类
设置的启动端口为8081可以自己在yml中进行配置启动端口
```yml
# cloud-produce.application.yml
# 启动端口
server:
  port: 8081
```
第一步：启动`cloud-consumer` 模块的`com.ukayunnuo.consumer.ConsumerApp` 消费者 启动类
设置的启动端口为8082可以自己在yml中进行配置启动端口和调用的生产者的url
```yml
# cloud-consumer.application.yml
# 启动端口
server:
  port: 8082

feign:
  hystrix:
    enabled: true
  # 生产者url
  url: http://localhost:8081

```
