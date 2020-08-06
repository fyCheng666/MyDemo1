package 线程;

import java.util.Random;

/**
 * current user 张++
 * 2020/7/14 0014
 * 14:38
 * 2020
 * 第三个打印一个小写字母，例如a。
 */


public class XianCheng3 implements Runnable{
    boolean b;
    int i=0;
    @Override
    public void run() {
            String[] strings = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};
            String s="z";
            b=s.equals(strings[i]);
            System.out.print(strings[i++]+" ");
    }
}
