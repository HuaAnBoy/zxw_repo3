
/*
系统产生一个50-60之间的随机数，请猜出这个数字是多少。
（猜中之后程序就结束，没有猜中则继续猜）
详细步骤：
①、利用Random产生一个随机数，范围50-60（包括50和60）。
②、键盘录入我们要猜的数字
③、比较这两个数字(用if语句)
        大了：给出提示大了，并且继续猜
        小了：给出提示小了，并且继续猜
        猜中了：给出提示，恭喜你，猜中了，并且结束循环
 */


import java.util.Random;
import java.util.Scanner;

/**
 * @author zhangxiongwei
 */
public class Test1 {

    public static void main(String[] args) {

        Random random = new Random();
        int rNum = random.nextInt(61) + 50;


        while (true) {
            System.out.println("系统速记产生50~60之间的数字，请猜出这个数字");
            Scanner scanner = new Scanner(System.in);
            int sNum = scanner.nextInt();
            if (sNum > rNum) {

                System.out.println("比生成的随机数大，请继续猜");
            } else if (sNum < rNum) {

                System.out.println("比生成的随机数小，请继续猜");
            } else {

                System.out.println("恭喜你，猜中了");
                break;
            }
        }
    }


}
