/*
__author__: 'FWJ' 
__time__: '2019-04-09 17:57:01'
*/
public class Test{
    public static void main(String[] args){
        //double d = 5.1e11;
        //float f = 22.2;
        //int i = 0.0;
        //Double oD = 2;
    }
}

/*
答案与解析
1.相关知识
int为有符号的32位整数。
double为双精度、64位符合IEEE754标准的浮点数
float为单精度、32位符合IEEE754标准的浮点数
Double为java.lang.Double包装类
从范围更大的数据类型向更小的转换时需要强制类型转换，不进行强制类型转换会无法通过编译

2.答案解析
A.5.1e11表示5.1*10^11，在double的取值范围内正确。
B.22.2为double类型，赋值给float类型需要进行强制类型转换否则无法通过编译。
C.0.0虽然看似是0，但是表示的是double类型，赋值给int类型时同样需要强制类型转换，否则无法通过编译。
D.double od = 2可以，但包装类Double接收时不会进行自动类型转换，因此接收整型值2时无法通过编译。

因此答案选A
*/