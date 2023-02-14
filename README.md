

本项目是activejdbc-spring-boot-starter的springboot demo项目 虽然只有数十行有效代码、但几乎已经达到了产品级。

因此我将它命名为 <h3>ActiveAPI<h3/>
ActiveAPI 零代码为你的数据提供通用CRUD接口，仅需配置数据源即可立即启动，并为指定数据库的每一张表 提供通用的REST CRUD接口 支持大部分主流数据库



### 打开方式

将本项目导入idea、修改application-native.yml配置文件 中的数据库和端口配置即可 然后执行maven打包 jar -jar 启动即可
#### 在线接口地址
* https://y29bdwkxrh.apifox.cn/api-62175699
#### 本地接口地址
* http://127.0.0.1:9999/swagger-ui/index.html
```yml
spring:
  mvc:
    pathmatch:
      matching-strategy: ant_path_matcher
  main:
    allow-circular-references: true
  application:
    name: server
  datasource:
    type: com.zaxxer.hikari.HikariDataSource
    jdbcUrl: jdbc:mysql://127.0.0.1:3306/activiti?allowMultiQueries=true&useUnicode=true&characterEncoding=UTF-8&zeroDateTimeBehavior=convertToNull&useSSL=false
    username: root
    password: root
  jackson:
    date-format: yyyy-MM-dd HH:mm:ss
    time-zone: GMT+8
springfox:
  documentation:
    enabled: true
server:
  port: 9999
```
