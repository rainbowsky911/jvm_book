package org.fenixsoft.jvm.chapter2;

import java.util.ArrayList;
import java.util.List;

/**
 * VM Args：-Xms20m -Xmx20m -XX:+HeapDumpOnOutOfMemoryError
 *
 * -XX:+HeapDumpOnOutOfMemoryError开启堆转存快照文件,在内存溢出异常的时候Dump出当前内存的堆转存快照以便事后分析
 * @author zzm
 */
public class HeapOOM {

    static class OOMObject {
    }

    public static void main(String[] args) {
        List<OOMObject> list = new ArrayList<OOMObject>();

        while (true) {
            list.add(new OOMObject());
        }
    }
}

