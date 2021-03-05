package org.fenixsoft.jvm.chapter2;

public class RuntimeConstantPoolOOM_2 {

    public static void main(String[] args) {
        String str1 = new StringBuilder("计算机").append("软件").toString();
        System.out.println(str1.intern() == str1);

        //java已经在内存中定义了,
        String str2 = new StringBuilder("ja").append("va").toString();
        System.out.println(str2.intern() == str2);


        String str3 = new StringBuilder("ko").append("be").toString();
        System.out.println(str3.intern() == str3);

        String str4 = new StringBuilder("faker").append("benji").toString();
        System.out.println(str4.intern() == str4);
    }
}
