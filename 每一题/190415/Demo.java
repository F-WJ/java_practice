package title01;



public class Demo {
    public static void main(String[] args) {
        double result = Math.cos(30);
        System.out.println(result);
        double result2 = Math.cos(Math.toDegrees(30));
        System.out.println(result2);
        //double result3 = Math.cosine(30);
        //System.out.println(result3);
        double result4 = Math.cos(Math.toRadians(30));
        System.out.println(result4);
    }
}

/*
答案与解析
1.相关知识
Math包下包含很多的方法能进行基础的数字运算，比如指数、对数、平方三角函数的计算方法。
Math.cos(double a)方法返回一个角度的三角函数的余弦值，需要弧度作为参数
Math.toDegrees(double angrad)方法将一个弧度数转换为角度
Math.toRadians(double angdeg)方法将一个角度转换为弧度

2.答案解析
方法调用正确，但30不是弧度值，因此无法正确计算
toDegrees是将弧度转换为角度，参数需要弧度作为参数，因此无法得出正确结果
在Math中consine方法不存在
toRadians()正确将30度转换为弧度之后通过cos方法得出结果，正确。
*/
