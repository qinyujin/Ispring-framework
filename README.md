spring源码，成功编译spring源码后新建gradle模块*spring-mytest*，并且在它的依赖文件build.gradle中添加几个核心依赖：  
compile(project(":spring-context"))  
compile(project(":spring-beans"))  
compile(project(":spring-core"))  
compile(project(":spring-aop"))  
  
  然后就在此模块中的test类为代码入口