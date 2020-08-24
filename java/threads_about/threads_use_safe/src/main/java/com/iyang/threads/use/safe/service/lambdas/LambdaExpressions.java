package com.iyang.threads.use.safe.service.lambdas;

/**
 * @author baoYang
 * @date 2020-08-24
 */

interface Description {
    String brief();
}

interface Body {
    String detailed(String head);
}

interface Multi {
    String twoArg(String head,Double d);
}

public class LambdaExpressions {

    static Body bod = h -> h + " No Perent!";

    static Body bod2 =  h -> h + " More details";

    static Description desc = () -> " Short info";

    static Multi multi =  (h,n) -> h + n;

    /**
     *  任何 lambda 表达式的基本语法:
     *  1: 参数
     *  2: 接着 -> , 可视为"产出"
     *  3： ->  之后的内容都是方法体.
     */
    static Description moreLines =  () -> {
        System.out.println("MoreLines()");
        return "from moreLines()";
    };

    public static void main(String[] args) {

        System.out.println(bod.detailed("OH!"));
        System.out.println(bod2.detailed("HI!"));
        System.out.println(desc.brief());
        System.out.println(multi.twoArg("PI", 3.14159));
        System.out.println(moreLines.brief());

    }

}
