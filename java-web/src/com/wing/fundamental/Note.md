## 1.基本概念
### 1.1 web开发
* web, 网页, www.baidu.com
* 静态web
    * html, css
    * 提供给所有人的数据始终不会发生变化
* 动态web
    * 淘宝，几乎所有的网站
    * 提供给所有人的数据始终会发生变化，每个人在不同的时间， 不同的地点看到的信息各不相同
    * 技术栈：Servlet/JSP, ASP, PHP
### 1.2 web应用程序
web应用程序：可以提供浏览器访问的程序：
* a.html,b.html...多个web资源，这些web资源可以是被外界访问，对外界提供服务
* 我们能访问到的任何一个几面或者资源，都存在于这个世界的某一个角落的计算机上
* URL
* 这个统一的web资源会被放在同一个文件夹下，web应用程序->Tomcat：服务器
* 一个web应用由多部份组成（静态web，动态web）
    * html,css,js
    * jsp,servlet
    * java程序
    * jar包
    * 配置文件（properties）

<br>web应用程序编写完毕后，若想提供给外界访问：需要提供一个服务器统一管理。 

### 1.3 静态web
* *.html,.html都是网页的后缀，如果服务器上一直存在这些东西，我们就可以直接进行读取。
* 静态web的缺点
    * web页面无法动态更新，所有用户看到的都是同一个页面
        * 轮播图，点击特效：伪动态
        * JavaScript[实际开发中，它用的最多]
        * VBScript
    * 它无法和数据库交互（数据无法持久化，用户无法交互）
### 1.4 动态Web
页面会动态展示：“Web页面的展示效果因人而异”。
#### 缺点：
* 加入服务器的动态web资源出现了错误，我们需要重新编写我们的**后台程序**，重新发布。
    * 停机维护
#### 优点：
* Web页面可以动态更新，所有用户看到的都是不同的页面
* 可以和数据库交互（数据持久化）

## 2.Web服务器
### 2.1 技术讲解
**ASP**：
* 微软：国内最早流行的就是ASP
* 在HTML中嵌入了VB的脚本，VB+COM
* 在ASP开发中，基本一个页面都有几千行的业务代码，页面极其混乱
* 维护成本高
* C#
* IIS

**PHP**：
* PHP开发速度很快，功能很强大，跨平台，代码很简单（70%， WP）
* 无法承载大访问量的情况（局限性）

**JSP/Servlet**：
<br>B/S：浏览和服务器
<br>C/S：客户端和服务器
    * Sun公司主推的B/S架构
    * 基于Java语言的（所有的大公司，或者一些开源的组件，都是用Java写的）
    * 可以承载三高（高并发，高可用和高性能）带来的影响
    * 语法像ASP，ASP->JSP，加强市场强度
    
### 2.2 Web服务器
服务器是一种被动的操作，用来处理用户的一些请求和给用户一些响应信息。

**IIS**：
<br>微软的：ASP... Windows自带。
<br>**Tomcat**：
<br>面向百度编程。
    <br>Tomcat是Apache 软件基金会（Apache Software Foundation）的Jakarta 项目中的一个核心项目，由Apache、Sun 和其他一些公司及个人共同开发而成。
由于有了Sun 的参与和支持，最新的Servlet 和JSP 规范总是能在Tomcat 中得到体现，Tomcat 5支持最新的Servlet 2.4 和JSP 2.0 规范。因为Tomcat 技术先进、
性能稳定，而且免费，因而深受Java 爱好者的喜爱并得到了部分软件开发商的认可，成为目前比较流行的Web 应用服务器。
    <br>Tomcat 服务器是一个**免费**的开放源代码的Web 应用服务器，属于轻量级应用服务器，在中小型系统和并发访问用户不是很多的场合下被普遍使用，是开发和调试JSP 
程序的首选。对于一个初学者来说，可以这样认为，当在一台机器上配置好Apache 服务器，可利用它响应HTML（标准通用标记语言下的一个应用）页面的访问请求。实际上
Tomcat是Apache 服务器的扩展，但运行时它是独立运行的，所以当你运行tomcat 时，它实际上作为一个与Apache 独立的进程单独运行的。
   <br> 诀窍是，当配置正确时，Apache 为HTML页面服务，而Tomcat 实际上运行JSP 页面和Servlet。另外，Tomcat和IIS等Web服务器一样，具有处理HTML页面的功能，
另外它还是一个Servlet和JSP容器，独立的Servlet容器是Tomcat的默认模式。不过，Tomcat处理静态HTML的能力不如Apache服务器。目前Tomcat最新版本为9.0。

## 3.Tomcat
### 使用Tomcat
- 安装或解压：[Tomcat官网](https://tomcat.apache.org/)
- 了解配置文件及目录结构
- 了解作用
- 启动：startup.bat / startuo.sh
- 关闭：shutdown.bat / shutdown.sh
- 访问测试：http://localhost:8080

### 可能遇到的问题
- Java环境变量没有配置
- 闪退问题：需要配置兼容性
- 乱码问题：配置文件中设置

### 配置
- 文件路径: $tomcat/conf/server.xml
- 可以配置的端口号
    - tomcat默认的端口号：8080
    - mysql：3306
    - http：80
    - https：443
- 可以配置的主机名称
    - 默认的主机名：localhost->127.0.0.1
    - 默认网站应用存放的位置：webapps
    
### 面试题
请你谈谈网站是如何进行访问的？
- 输入一个域名：回车
- 检查本机的```C:\Windows\System32\drivers\etc\hosts```配置文件下有没有这个域名因映射
    - 有：直接返回对应的IP地址，在这个地址中，有我们要访问的web程序，可以之际访问
    ``` 
    127.0.0.1  www.xxx.com 
    ```
    - 没有，去DNS服务器找，找到的话返回，找不到就返回找不到。
- 可以配置下环境变量
    - CATALINA_HOME：Tomcat安装目录
    - 在系统Path中添加：%CATALINA_HOME%\bin

### 发布网站
- 将自己写的网站，放到服务器(Tomcat)中指定的web应用的文件夹(webapps)下，就可以让问了
- 网站应该有的结构
```
--webapps
    -ROOT
    -yourWeb
        - WEB-INF
            -classes
            -libs
            -web.xml
        - index.html
        - static
            -css
                - style.css
            -js
            -img 
```  
    
## 4.Http
### 4.1 什么是http
<br>超文本传输协议（Hypertext Transfer Protocol，HTTP）是一个简单的请求-响应协议，它通常运行在TCP之上。它指定了
客户端可能发送给服务器什么样的消息以及得到什么样的响应。请求和响应消息的头以ASCII形式给出；而消息内容则具有一个类似MIME
的格式。这个简单模型是早期Web成功的有功之臣，因为它使开发和部署非常地直截了当。
#### HTTP(超文本传输协议)
是一种简单的请求-响应协议，它通常运行在TCP之上。
- 文件：html,字符串,...
- 超文本：图片,音乐,视频,定位,地图...
- 80
#### HTTPS：安全的
- 443

###4.2 两个时代
- http1.0
    - HTTP/1.0：客户端可以与web服务器连接，只能获得一个web资源，断开连接
- http2.0
    - HTTP/1.1：客户端可以与web服务器连接，只能获得多个web资源
    
###4.3 Http请求
- 客户端---发请求---服务器
```
Request URL: https://www.baidu.com/  # 请求地址
Request Method: GET                  # get方法/post方法
Status Code: 200 OK                  # 状态码：200
Remote Address: 14.215.177.38:443
```
```
Accept: application/json, text/javascript, */*; q=0.01
Accept-Encoding: gzip, deflate, br
Accept-Language: zh-CN,zh;q=0.9         # 语言
Cache-Control:max-age=0
Connection: keep-alive
```
#### 请求行
- 请求行中的请求方式：GET
- 请求方式：**GET,POST**,HEAD，DELETE,PUT,TRACT
    - GET：请求能够携带的参数比较少，大小有限制，会在浏览器的URL地址栏显示数据内容，不安全，但高效
    - POST：请求能够携带的参数没有限制，大小没有限制，不会在浏览器的URL地址栏显示数据内容，安全，但不高效
#### 消息头
```
Accept:                # 告诉浏览器，它所支持的数据类型
Accept-Encoding:       # 支持哪种编码格式：GBK UTF-8 GB2312 ISO8859-1
Accept-Language:       # 告诉浏览器，它的语言环境
Cache-Control:         # 缓存控制
Connection:            # 告诉浏览器，请求完成时是断开还是连接
HOST:                  # 主机
```
###4.4 Http响应 
- 服务器---响应---客户端
```
Cache-Control: private             # 缓存控制
Connection: keep-alive             # 连接
Content-Encoding: gzip             # 编码
Content-Type: text/html;charset=utf-8 # 类型
```
#### 响应体
```
Accept:                # 告诉浏览器，它所支持的数据类型
Accept-Encoding:       # 支持哪种编码格式：GBK UTF-8 GB2312 ISO8859-1
Accept-Language:       # 告诉浏览器，它的语言环境
Cache-Control:         # 缓存控制
Connection:            # 告诉浏览器，请求完成时是断开还是连接
HOST:                  # 主机
Refresh:               # 告诉客户端多久刷新一次
Location:              # 让网页重新定位
```
#### 响应状态码
* 200：请求响应成功
* 3xx：请求重定向
    * 重定向：重新到我给你新位置去
* 4xx：找不到资源 404
    * 资源不存在
* 5xx：服务器代码错误 500 502-网关错误
  
## 5.Maven
### Why
- 在javaweb开发中，需要使用大量的jar包，要手动导入
- 如何能够让一个东西自动帮助我们导入和配置这些jar包
<br>由此，Maven诞生了！

### 5.1 Maven项目架构管理工具
Maven的核心思想: **约定大于配置**
- 有约束，不要去违反
<br>Maven规定好你该如何去编写我们的java代码，必须要按照这个规范来。

### 5.2 下载安装Maven
- 下载Maven，[Maven官网](http://maven.apache.org/)
- 解压即可

### 5.3 配置环境变量
在系统环境变量中：
- M2_HOME： Maven目中下的bin目录
- MAVEN_HOME：Maven的目录
- 在系统的Path中配置%MAVEN_HOME%\bin
- 测试环境：
``` 
mvn -version
```

### 5.4 阿里云镜像
- 镜像：mirrors
    - 作用：加速我们的下载
- 国内建议使用阿里云镜像
<br>在$maven\conf\settings.xml中，加入下述内容：
```
  <mirrors>
    <mirror>
    <id>aliyunmaven</id>
    <mirrorOf>central</mirrorOf>
    <name>aliyun maven</name>
    <url>https://maven.aliyun.com/repository/public </url>
    </mirror>
  </mirrors>
```

### 5.5 本地仓库
建立一个本地仓库: **localRepository**
<br>在$maven\conf\settings.xml中，加入下述内容：
```
<localRepository>本地具体路径</localRepository>
```
## 6.Web开发
### 6.1 创建web项目
在上述配置好环境之后，使用IDEA创建Web项目。步骤如下：
- File->New->Project
- Maven->勾选”Create from archetype"->maven-archetype-webapp
- 项目名称，GroupId，Artifact信息
- 完成创建。

### 6.2 web.xml配置信息
```
<?xml version="1.0" encoding="UTF-8"?>
<web-app xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
         xmlns="http://xmlns.jcp.org/xml/ns/javaee"
         xsi:schemaLocation="http://xmlns.jcp.org/xml/ns/javaee
                      http://xmlns.jcp.org/xml/ns/javaee/web-app_4_0.xsd"
         version="4.0"
         metadata-complete="true">

  <!-----注册servlet--->
  <servlet>
    <servlet-name>helloServlet</servlet-name>
    <servlet-class>HelloServlet</servlet-class>
  </servlet>
    <!-----servlet映射--->
  <servlet-mapping>
    <servlet-name>helloServlet</servlet-name>
    <url-pattern>/test</url-pattern>
  </servlet-mapping>
</web-app>
```
### 6.2 Servlet项目主要依赖包
```xml
  <dependencies>
    <!--Java Servlet依赖包-->
    <dependency>
      <groupId>javax.servlet</groupId>
      <artifactId>javax.servlet-api</artifactId>
      <version>4.0.1</version>
    </dependency>
    <!-- JSP依赖 -->
    <dependency>
      <groupId>javax.servlet.jsp</groupId>
      <artifactId>javax.servlet.jsp-api</artifactId>
      <version>2.3.3</version>
    </dependency>
    <!--JSTL表达式依赖 -->
    <dependency>
      <groupId>javax.servlet.jsp.jstl</groupId>
      <artifactId>jstl</artifactId>
      <version>1.2</version>
    </dependency>
    <!-- Standard标签依赖 -->
    <dependency>
      <groupId>taglibs</groupId>
      <artifactId>standard</artifactId>
      <version>1.1.2</version>
    </dependency>
    <!-- 数据库连接依赖 -->
    <dependency>
      <groupId>mysql</groupId>
      <artifactId>mysql-connector-java</artifactId>
      <version>5.1.49</version>
    </dependency>
  </dependencies>
```