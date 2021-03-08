package org.fenixsoft.jvm.chapter7;

/**
 * 非法向前使用变量
 *
 * @author 51473
 */
public class Test {

    static {
        //这句可以正常赋值
        i = 0;

        //非法向前使用变量
        System.out.println(i);
    }

    static int i = 1;
}
