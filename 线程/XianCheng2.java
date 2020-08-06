package 线程;

import java.util.Random;

/**
 * current user 张++
 * 2020/7/14 0014
 * 14:38
 * 2020
 * 第二个打印一个大写字母，例如A，
 */


public class XianCheng2 implements Runnable{
    int i=0;
    @Override
    public void run() {
            String[] strings = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"};
            System.out.print(strings[i++]);
    }
}
