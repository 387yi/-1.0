package xsglxt;

import java.util.ArrayList;
import java.util.Scanner;

public class xueshengxitong {
    public static void main(String[] args) {
        ArrayList<student> b = new ArrayList<student>();
        lei s=new lei();

        boolean p = true;
        do {
            men();
            Scanner sc = new Scanner(System.in);

            System.out.println("输入你的选择：》");
            int input = sc.nextInt();
            switch (input) {
                case 1:
                    s.tianjia(b);
                    break;
                case 2:
                    s.xiugai(b);
                    break;
                case 3:
                    s.shanchu(b);
                    break;
                case 4:
                    s.chazhao(b);
                    break;
                case 5:
                    s.chakan(b);
                    break;
                case 0:
                    p = false;
                    System.out.println("退出成功");
                    break;
                default:
                    System.out.println("输入错误，请重新输入");
            }

        } while (p);


    }

    public static void men() {
        System.out.println("------学生管理系统-------");
        System.out.println("----1.添加学生信息-------");
        System.out.println("----2.修改学生信息-------");
        System.out.println("----3.删除学生信息-------");
        System.out.println("----4.查找学生信息-------");
        System.out.println("----5.查看全部学生信息----");
        System.out.println("----0.退出--------------");
    }


}
