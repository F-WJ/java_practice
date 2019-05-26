package cn.onedull.practice._04;

/**
关于final说法正确的是？
A.final方法等同于private方法
B.final类的方法不能被同一个包的类访问
C.final类的方法能否被同一个包的类访问不是由final决定
D.final修饰的引用和值都不能改变

答案与解析

1.相关知识
final修饰方法时， 该方法的内容无法被修改
final为单独的修饰符， 与访问修饰符无关

2.答案解析
A.final方法不能被修改，private方法，只能被本类访问，不等同，错误
B.final类的方法只要不是private修饰可以被同一个包的类访问，错误
C.能否被同一个包的类访问由访问修饰符决定与final无关，正确
D.final修饰的引用地址和值本身不能改变，但可以修改引用指向的的内容
答案选：C

 */