# 常用API

<hr/>

- Math
- System
- Object
- Arrays
- 基本类型包装类
- 日期类

<hr/>

## Math类
包含执行基本数字运算的方法

由于成员都是static修饰，即都是静态的，所以通过；类名就可以直接调用

#### 常用方法：
|方法名|说明|
|---|---|
|public static int abs(int a)|返回参数的绝对值|
|public static double ceil(double a)|返回大于或等于参数的最小double值，等于一个整数|
|public static double floor(double a)|返回小于或等于参数的最大double值,等于一个整数|
|public static int round(float a)|按四舍五入返回最接近参数的int|
|public static int max(int a,int b)|返回两个int值中的较大值|
|public static int min(int a,int b)|返回两个int值中的较小值|
|public static double pow(double a,double b)|返回a的b次幂|
|public static double random|返回值为double的正值，[0.0,1.0) |

<hr/>

## System类
System类包含了几个有用的类字段和方法，它不能被实例化
#### 常用方法：
|方法名|说明|
|---|---|
|public static void exit(int status)|终止当前运行的Java虚拟机，非零表示异常终止|
|public static long currentTimeMillis()|返回当前时间（以毫秒为单位）|

<hr/>

## Object类
#### Objectl类的概述
Object是类层次结构的根，每个类都可以将Object作为超类。所有类都直接或间接的继承该类。

#### 构造方法
```java
public Object(){}
```
Object作为顶级父类，它只有无参构造方法，再由于每个类都直接或间接的继承该类，所以面向对象中子类默认访问父类的无参构造方法。
#### 常用方法
|方法名|说明|
|---|---|
|public String toString()|返回对象的字符串表现形式。建议所有子类重写该方法，Ctrl+Ins自动生成|
|public boolean equals(Object o)|比较对象是否相等。默认比较地址值，重写可以比较内容，Ctrl+Ins自动生成|

<hr/>

## Arrays类
Array类中包含用于操作数组的各种方法

|方法名|说明|
|---|---|
|public static String toString(int[] a)|返回指定数组的内容的字符串表示形式|
|public static void sort(int[] a)|按照数字顺序排列指定的数组|

工具类的设计思想：<br/><br/>1. 构造方法用`private`修饰<br/><br/>2. 成员用`public static`修饰
-

<hr/>

## 基本类型包装类
将基本数据类型封装成对象的好处在于可以在对象中定义更多的功能方法操作该数据
<br/>常用的操作之一：用于基本数据类型与字符串之间的转换

|基本数据类型|包装类|
|:---:|:---:|
|byte|Byte|

|short|Short|
|int|Integer|
|long|Long|
|float|Float|
|double|Double|
|char|Character|
|boolean|Boolean|

### Integer
包装一个对象中的原始类型int的值

|方法名|说明|
|---|---|
|public Integer(int value)|根据int值创建Integer对象<font color=red>（过时）</font>|
|public Integer(String s)|根据String值创建Integer对象<font color=red>（过时）</font>|
|public Integer valueOf(int i)|返回表示指定int值的Integer实例|
|public Integer valueOf(String s)|返回一个保存指定值的Integer 对象 String|

### int 和 String的相互转换
1. int 转换为 String<br/>
>public static String valueOf(int i)
<br/>返回int参数的字符串表现形式。该方法是String类中的方法
2. String 转换为 int<br/>
>public static int parseInt(String s)
<br/>将字符串解析为int类型。该方法是Integer类中的方法
> 