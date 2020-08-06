package 线程;

import com.sun.org.apache.bcel.internal.generic.IF_ACMPEQ;

/**
 * current user 张++
 * 2020/7/14 0014
 * 14:35
 * 2020
 * 4、启动三个线程，轮番打印12Aa34B56C……直到字母z出现为止。（10）
 * 注：其中第一个线程打印连续两个数字，例如12，
 *         第二个打印一个大写字母，例如A，
 *         第三个打印一个小写字母，例如a。
 */


public class XianCheng {
    private volatile static int a;
    public static void main(String[] args) {

        XianCheng1 xianCheng1=new XianCheng1();
        XianCheng2 xianCheng2=new XianCheng2();
        XianCheng3 xianCheng3=new XianCheng3();

        Thread t1=new Thread(xianCheng1);
        Thread t2=new Thread(xianCheng2);
        Thread t3=new Thread(xianCheng3);

        while (true){
            if (a%3==0){
                t1.run();
                a++;
            }else if (a%3==1){
                t2.run();
                a++;
            }else {
                t3.run();
                if (xianCheng3.b){
                    break;
                }
                a++;
            }
        }
    }
}
