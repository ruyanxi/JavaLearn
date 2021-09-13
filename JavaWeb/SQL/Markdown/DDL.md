##DDL：操作数据库、表
###操作数据库：C R U D
1. C：create   创建
    1. 创建数据库：create database 数据库名称;
    2. 创建数据库，并判断是否已经存在该数据库（不存在再创建）：create database if not exists 数据库名称;
    3. 创建数据库，判断是否已经存在的同时指定字符集（字符集utf-8应书写为utf8）：create database if not  exists 数据库名称 character set 字符集名;
2. R：retrieve 查询
    1. 查询所有数据库的名称：show databases;
    2. 查看指定数据库的创建语句/语法（用来查看该数据库的字符集）：show create database 数据库名称;
3. U：update   修改
    1. 修改数据库的字符集（字符集utf-8应书写为utf8）：alter database 数据库名称 character set 字符集名称;
4. D：delete   删除
    1. 删除数据库：drop database 数据库名称;
    2. 删除数据库，并判断是否已经存在该数据库（存在再删除）：drop database if exists 数据库名称;
5. 使用数据库
    1. 查询当前正在使用的数据库名称：select database();
    2. 使用数据库：use 数据库名称;

###操作表：C R U D
1. C：create   创建
    1. 创建表：
   ```mysql 
   create tables 表名称(<br>
       列名1 数据类型1,<br>
       列名2 数据类型2,<br>
       列名3 数据类型3,<br>
       &emsp;&emsp;&emsp;... ...<br>
       列名n 数据类型n<br>
       );
   ```
    1. 创建一个表从以存在的表中复制：create table 待创建表名 like 待复制表名;

>说明：
> 最后一列不需要加逗号
<table>
   <thead>数据类型</thead>
   <th colspan="3">数据类型</th>
   <tr>
      <th>分类</th>
      <th>类型名称</th>
      <th>说明</th>
   </tr>
   <tr>
      <th rowspan="4">整数类型</th>
      <th>tinyint</th>
      <th>很小的整数</th>
   </tr>
   <tr>
      <th>smallint</th>
      <th>小的整数</th>
   </tr>
   <tr>
      <th>mediumint</th>
      <th>中等大小的整数</th>
   </tr>
   <tr>
      <th><font color="red">int(integer)</font></th>
      <th>普通大小的整数</th>
   </tr>

   <tr>
      <th rowspan="3">小数类型</th>
      <th>float</th>
      <th>单精度浮点数</th>
   </tr>
   <tr>
      <th><font color="red">double</font></th>
      <th>双精度浮点数-可加：(总共位数,小数点位数)</th>
   </tr>
   <tr>
      <th>decimal(m,d)</th>
      <th>压缩严格的定点数</th>
   </tr>

   <tr>
      <th rowspan="5">日期类型</th>
      <th>year</th>
      <th>YYYY 1901～2155</th>
   </tr>
   <tr>
      <th>time</th>
      <th>HH:MM:SS -838:59:59～838:59:59</th>
   </tr>
   <tr>
      <th><font color="red">date</font></th>
      <th>YYYY-MM-DD 1000-01-01～9999-12-3</th>
   </tr>
   <tr>
      <th><font color="red">datetime</font></th>
      <th>YYYY-MM-DD HH:MM:SS 1000-01-01 00:00:00～9999-12-31 23:59:59</th>
   </tr>
   <tr>
      <th><font color="red">timestamp</font></th>
      <th>时间戳，不主动赋值时默认为当前时间<br/>YYYY-MM-DD HH:MM:SS 1970-01-01 00:00:01 UTC～2038-01-19 03:14:07 UTC</th>
   </tr>

   <tr>
      <th rowspan="2">字符串</th>
      <th>char(M)</th>
      <th>M为0～65535之间的整数</th>
   </tr>
   <tr>
      <th><font color="red">varchar(M)</font></th>
      <th>M为0～65535之间的整数</th>
   </tr>

   <tr>
      <th rowspan="4">BLOB</th>
      <th>tinyblob</th>
      <th>允许长度0～255字节</th>
   </tr>
   <tr>
      <th>blob</th>
      <th>允许长度0～65535字节</th>
   </tr>
   <tr>
      <th>mediumblob</th>
      <th>允许长度0～167772150字节</th>
   </tr>
   <tr>
      <th>longblob</th>
      <th>允许长度0～4294967295字节</th>
   </tr>

   <tr>
      <th rowspan="4">CLOB</th>
      <th>tinytext</th>
      <th>允许长度0～255字节</th>
   </tr>
   <tr>
      <th>text</th>
      <th>允许长度0～65535字节</th>
   </tr>
   <tr>
      <th>mediumtext</th>
      <th>允许长度0～167772150字节</th>
   </tr>
   <tr>
      <th>longtext</th>
      <th>允许长度0～4294967295字节</th>
   </tr>

   <tr>
      <th rowspan="2">二进制</th>
      <th>varbinary(M)</th>
      <th>允许长度0～M个字节的定长字节</th>
   </tr>
   <tr>
      <th>binary(M)</th>
      <th>允许长度0～M个字节的定长字节</th>
   </tr>
</table> 


2. R：retrieve 查询
    1. 查询指定数据库中所有表的名称（需先使用数据库）：show tables;
    2. 查询表的结构：desc 表名称;
    3. 查询表的创建语句：show table 表名;
3. U：update   修改
    1. 修改表名：alter table 表名 rename to 新表名;
    2. 修改表的字符集：alter table 表名 character 字符集名称;
    3. 修改列
        1. 添加列：alter table 表名 add 列名 数据类型;
        2. 修改列的名称 类型：alter table 表名 change 列名 新列名 新数据类型;
        3. 修改列的类型：alter table 表名 modify 列名 新数据类型;
        4. 删除列：alter table 表名 drop 列名;
4. D：delete   删除
    1. 删除表：drop table 表名称;
    2. 删除表，并判断是否已经存在该表（存在再删除）：drop table if exists 表名称;

