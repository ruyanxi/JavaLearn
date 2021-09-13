# SQL

----
##什么是SQL
全称结构化语言-Structured Query Language,SQL语句就是对数据库进行操作的一种语言。<br/>
即，定义了一种操作所有关系型数据库的规则。<br/>
但是每一种数据库操作的方式存在不一样的地方，称为”方言“
##SQL作用
通过SQL语句我们可以方便的操作数据库中的数据、表、数据库。SQL是数据库管理系统都需要遵循的规范。不同的数据库生产厂商都支持SQL语句，但都有特有内容。

##SQL通用语法
1. SQL语句可以单行或多行书写，以分号结尾。
2. 可使用空格和缩进来增强语句的可读性。
3. MySQL数据库的SQL语句不区分大小写，关键字建议使用大写。
4. 3种注释：
   1. 单行注释： -- 注释内容 或 # 注释内容（MySQL特有,#后可以不加空格，但是--必须加空格）
   2. 多行注释： /× 注释 */
   
## SQL语句分类
1. DDL（Date Definition Language）数据定义语言
   <br/>&emsp;&emsp;用来定义数据库对象：数据库，表，列等。关键字：create,drop,alter等<br/>
2. DML（Date Manipulation Language）数据操作语言
   <br/>&emsp;&emsp;用来对数据库中表的数据进行增删改。关键字：insert,delete,update等<br/>
3. DQL（Date query Language）数据查询语言
   <br/>&emsp;&emsp;用来查询数据库中表的记录（数据）。关键字：select,where等<br/>
4. DCL（Date Control Language）数据控制语言
   <br/>&emsp;&emsp;<br/>
