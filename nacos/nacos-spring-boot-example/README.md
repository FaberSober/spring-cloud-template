# 说明
## mysql-example
1. 在nacos的配置列表中增加名为`mysql.properties`的配置文件，内容如下
```properties
spring.datasource.driver-class-name= com.mysql.jdbc.Driver
spring.datasource.username= root
spring.datasource.password= 123456
spring.datasource.url= jdbc:mysql://localhost:3306/nacos_test?useUnicode=true&characterEncoding=UTF-8&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC
spring.jpa.hibernate.ddl-auto= create
```

![nacos-mysql-properties.png](./assets/nacos-mysql-properties.png)

2. 配置完成后启动app

> 使用nacos的yaml文件配置会莫名其妙的读不到配置文件，目前还未找到问题所在。