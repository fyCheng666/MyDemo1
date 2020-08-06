package 线程;

import java.util.Random;

/**
 * current user 张++
 * 2020/7/14 0014
 * 14:38
 * 2020
 * 其中第一个线程打印连续两个数字，例如12，
 */


public class XianCheng1 implements Runnable{
    int i=1;
    @Override
    public void run() {
//            Random random = new Random();
//            int i = random.nextInt(10);
//            int j = random.nextInt(10);
            System.out.print(i++ + "" + i++);



    }
}
