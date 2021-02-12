本demo实现了ssm框架的基本整合配置，并提供了简单测试案例

在使用时需要的修改的地方有：
1. dbconfig-druid.properties 的数据库连接配置
2. 如果需要修改包名（现在包名是 com.xupt.yzh)
    1. 修改 applicationContext.xml 的 component-scan 和 MapperScannerConfigurer
    2. 修改 applicationContext-mvc.xml 的 component-scan

使用提供的测试案例方式：
1. 导入 sql 包下的建表语句
2. 配置外部 tomcat，然后将此项目添加进去，运行
3. controller 提供了两个接口，分别测试返回页面和数据
    1. localhost:8080/index.html 测试返回 html 页面
    2. localhost:8080/user/1 测试返回数据