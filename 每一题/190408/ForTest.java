/*
__author__: 'FWJ' 
__time__: '2019-04-09 18:14:31'

*/
public class ForTest{
    public static void main(String[] args){
        int count = 0;
        int num = 0;
        for(int i = 0; i <= 100; i++){
            num = num + 1;
            count = count++;
        }
        System.out.println(num * count);
    }
}

/*
答案与解析
1.相关知识for循环是最常用的循环体之一，分号分别隔开初始化、布尔表达式、值更新。
++为运算符，代表的是自增，使操作数的值增加1，
可以放在变量前也可以在变量后++，放在变量前时先进行自增计算，
在进行表达式运算；如果放在变量后时先进行表达式运算，再进行自增计算，
还需要注意的是，当自增放在后面的时，如果赋值给自身，那么自身的值不会发生任何变化。

2.源码分析
首先定义了一个变量count，赋初始值0。
定义了一个变量num，赋值为0。
for循环从0到100，一共是遍历101次，每次num的值+1，
但是count的赋值自增是在后面，因此count的值是不变的。
最后输出num*count。

3.答案解析
因为count的值始终为0，因此最终乘积的结果同样为0
*/

