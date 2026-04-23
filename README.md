# introduction_module

## 项目说明

这个仓库用来集中记录不同技术栈的入门代码、基础语法练习和小型示例。最初它更像一个持续追加的学习笔记仓库，因此目录跨度较大，既有单文件 demo，也有完整的 Maven / Vue 项目。

这次已经把历史上的 `front-end`、`go-learn`、`gt`、`scala-learn`、`test` 分支内容整理回 `master`，目标是保留尽量完整的源码，不再把学习内容分散在多个分支上。

说明：仓库里保留了部分历史 IDE 文件、编译产物和练习输出文件，这是为了尽量保留原始学习记录，当前没有做激进清理。

## 模块总览

| 路径 | 说明 |
| --- | --- |
| `C&CPlus/` | C 语言基础练习，包含数组、变量、枚举、文件、字符串、指针和基础语法示例。 |
| `css/` | CSS 基础示例，目前包含背景色相关练习。 |
| `flume/flume-hello/` | Flume 自定义拦截器示例。 |
| `go/go_base/` | 原始 Go 入门练习，包含 HelloWorld、参数传递和基础说明。 |
| `go_base/` | 从历史分支回收的 Go 语法练习，包含常量、函数、运算、数组、Map、切片、指针和 `range` 示例。 |
| `java/design-modle/` | Java 设计模式、Java 8 Stream、对象工具、线程与线程池相关练习。 |
| `java/distributed_base/config/apollo-client/` | Apollo 配置中心客户端示例。 |
| `java/io-learn/` | Java IO 与 `Optional` 基础练习。 |
| `java/java8-learn/` | Java 8 Lambda、函数式接口、文件编码与 OOM 场景练习。 |
| `java/maven/` | Maven 初始化和基础说明。 |
| `java/spring_bean_module/spring-bean-use/` | Spring Bean 加载、配置类、条件装配、`FactoryBean` 等练习。 |
| `java/spring_bean_module/spring-aop-use/` | 从历史分支并入的 Spring AOP 示例，包含切面配置和简单计算服务。 |
| `java/threads_about/threads_use_safe/` | 线程安全、JMM 可见性、`ThreadLocal`、函数式接口和并发相关示例。 |
| `js/` | JavaScript 数据类型、语法、运算符和标准库练习。 |
| `python/base/` | Python 条件、字符串、列表、对象、多进程基础练习。 |
| `python/data_read/` | Python 读取 CSV / JSON / XML / Excel 的示例。 |
| `python/db/` | 从历史分支并入的 Redis 客户端示例。 |
| `scala_base/base_project/` | Scala 基础项目源码，包含基础语法、对象和数组示例。 |
| `scala_base/maven_scala_hello/` | Scala Maven 工程，补充了集合、匹配、异常和案例练习。 |
| `scala_base/akka-hello/` | 从历史分支并入的 Akka 入门示例。 |
| `software_skills/` | 软件使用技巧和过程性记录。 |
| `ts/base_grammar/` | TypeScript 基础语法练习。 |
| `vue/` | Vue 相关学习目录，既有单页 HTML 示例，也有多个完整的小项目。 |
| `vue/vue_component/` | Vue 组件、过滤器、表单、生命周期、样式示例。 |
| `vue/js/` | 前端对象与函数示例。 |
| `vue/src_code/` | Vue 基础路由和页面切换示例项目。 |
| `vue/src_mint-ui/` | Mint UI 基础接入示例。 |
| `vue/todosone/` | Todo 示例项目版本一。 |
| `vue/todostwo/` | Todo 示例项目版本二。 |
| `vue/todosthree/` | Todo 示例项目版本三。 |
| `vue/users/` | Vue 用户搜索/展示示例。 |
| `vue/yshop/` | Vue CLI 生成的商城练习项目。 |

## 本次分支整合

| 原分支 | 整合结果 |
| --- | --- |
| `front-end` | 合并了 7 个 Vue 单页练习：`vue/base_compent_use.html`、`vue/compoent_demo.html`、`vue/event_watch.html`、`vue/helloWorld.html`、`vue/provide_inject_demo.html`、`vue/reader_demo.html`、`vue/regis_compent.html`。 |
| `go-learn` | 回收了 `go_base/` 下的基础 Go 语法文件。 |
| `gt` | 分支里主要是根 `README.md` 的成长性说明，已吸收到当前仓库说明，不再单独保留分支。 |
| `scala-learn` | 回收了 `go_base/` 补充文件、Scala 基础源码、`maven_scala_hello` 练习文件和 `akka-hello` 示例。 |
| `test` | 回收了 `spring-aop-use`、`spring-bean-use` 测试类和 `python/db` 下的 Redis 示例。 |
| `python-learn` | 该分支的提交已经在主线历史中，不需要额外回收文件。 |

## 使用建议

1. 这个仓库更适合按模块逐个阅读，不适合把它当成一个统一构建的单体项目。
2. Java、Vue、Scala 模块大多是彼此独立的练习工程，进入对应目录后再单独执行构建或运行命令。
3. 如果后续继续新增学习内容，建议直接在 `master` 下新增目录或模块，避免再按主题切多个长期分叉分支。
