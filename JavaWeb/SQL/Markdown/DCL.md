# DCL
----
管理用户及授权
## 管理用户
>主机名若使用通配符`%`表示可以在任意主机使用用户登录数据库
### 添加用户
语法
```mysql
-- 1. 切换到mysql数据库
use musql;

create user '用户名'@'主机名' identified by '密码';
```
### 删除用户
语法
```mysql
-- 1. 切换到mysql数据库
use musql;

drop user '用户名'@'主机名';
```
### 修改用户密码
语法
```mysql
-- 1. 切换到mysql数据库
use musql;

-- DML格式：
update user set password = password('新密码') where user = '用户名';
-- DCL格式：
set password for '用户名'@'主机名' = password('新密码');
```

<font color=red size=6>mysql中忘记了root密码解决方案</font>
1. 管理员权限使用cmd运行`net stop mysql`命令停止mysql服务
2. 使用`mysqld --skip-grant-tables`命令启动无验证方式的mysql服务
3. 管理员权限使用新的cmd窗口
4. 直接运行`mysql`命令进入mysql数据库
5. 运行`use mysql`命令进入mysql表
6. 运行`update user set password = password('你的新密码') where user = 'root';`命令进行重设密码
7. 关闭两个cmd窗口
8. 在任务管理器中手动结束仍在运行中的mysqld.exe进程
9. 管理员权限使用cmd运行`net start mysql`命令开启mysql服务
10. 使用`mysql -u root -p `命令和新密码登录mysql数据库

### 查询用户
语法
```mysql
-- 1. 切换到mysql数据库
use musql;
-- 2. 查询user表
select * from user;
```
## 授权
### 查询权限：
语法
```mysql
show grants for '用户名'@'主机名';
```
### 授予权限：
语法
```mysql
grant 权限列表 on 数据库名.表名 to '用户名'@'主机名';

-- 授予所有表的所有权限
grant all on *.* to '用户名'@'主机名';
```
### 撤销权限：
语法
```mysql
revoke 权限列表 on 数据库名.表名 from '用户名'@'主机名';
```