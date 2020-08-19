package com.iyang.threads.use.safe.optimize;

import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/**
 * @author Yang
 * @date 2020/8/17 / 14:58
 *
 * 关于字符串知识的内容
 * Java8中, char[] + hash.
 *
 * final 修饰的好处:  安全的/保证hash属性值不会频繁变更/实现字符串常量池.
 * 字符串当有重复的时候,要善于利用   intern 方法,具体是要结合使用场景的.
 *
 * 正则表达式: DFA 和 NFA(存在大量的分支和回溯)
 *
 * ArrayList防止没有元素的多余空间也被序列化(666).
 */
public class StrOptimize {

    private final AtomicBoolean closed = new AtomicBoolean(false);

    public static void main(String[] args) {

        String str1 = "abc";
        String str2 = new String("abc");
        String str3 = str2.intern();

        System.out.println(str1 == str2);
        System.out.println(str2 == str3);
        System.out.println(str1 == str3);

    }

}
