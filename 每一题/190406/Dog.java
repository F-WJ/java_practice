/*
__author__: 'FWJ' 
__time__: '2019-04-09 17:34:57'
*/

public class Dog extends Animal{
    //自定义构造器
    public Dog(){
        System.out.println("I am a dog");
    }

    public static void main(String[] args){
        Dog dog = new Dog();
    }
}

abstract class Animal{
    //抽象方法
    abstract void eat();
}


/*
答案与解析
1.相关知识  
abstract修饰的类时抽象类，它不能生成对象，它是不完整的，只能作为基类。
类可以实现无限个接口，但仅仅能从一个抽象类继承。java中抽象类中可以有非抽象方法，继承抽象类需要实现它其中的方法。
2.源码分析
声明了一个抽象类Animal，定义了一个抽象方法eat。
定义了一个Dog类继承抽象类Animal，其中有一个构造方法输出“I am a dog”
main函数中直接创建了Dog对象
3.答案解析
根据我们的相关知识可以知道，我们继承了抽象类，
就必须要实现它的抽象方法，抽象类本身的定义没有问题，
因此Anima可以编译，但Dog类没有实现抽象方法，
因此Dog不能编译，如果Dog类实现了eat()方法，那么程序会输出构造方法中的I am a dog。
*/