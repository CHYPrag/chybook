# booksystem 项目
CHY

**事先声明**：本人比较差劲，因此项目做得可能比较难看。

注意事项：
1. 这个项目正在开发中，我将原来的demo0项目构件中的一些代码文件复制到了本项目中了，为原来的demo0项目所配置的MySQL数据库的名称是demo0，在此数据库中，
2. 对表使用了外键约束。
3为了解决Mybatis-Plus不支持拥有联合主键的表的映射问题，使用如下依赖：
```xml
<!--        解决联合主键映射问题，此版本兼容mybatis-plus 3.5.5+-->
<dependency>
    <groupId>com.github.jeffreyning</groupId>
    <artifactId>mybatisplus-plus</artifactId>
    <version>1.7.5-RELEASE</version>
</dependency>
```
然后再配置类或SpringBoot启动类中标注上注解@EnableMPP， 还要在根据要求重新编写dao层、service层代码，如让Mapper接口继承MPPBaseMapper接口、
让对应的Service接口继承IMppService等。有关mybatisplus-plus的详细内容，参见
<a href="https://github.com/jeffreyning/mybatisplus-plus">GitHub-Mabatisplus-Plus</a>。
4. 为了使用Log4j2日志框架，一般都会在项目中添加如下依赖：
```xml
<dependency>
            <groupId>org.apache.logging.log4j</groupId>
            <artifactId>log4j-api</artifactId>
            <version>2.13.3</version>
        </dependency>
        <dependency>
            <groupId>org.apache.logging.log4j</groupId>
            <artifactId>log4j-core</artifactId>
            <version>2.13.3</version>
        </dependency>
```

