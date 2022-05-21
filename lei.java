package xsglxt;

import java.util.ArrayList;
import java.util.Scanner;

public class lei {
    public static void tianjia(ArrayList<student> a) {
        Scanner sc1 = new Scanner(System.in);

        System.out.println("输入添加的学生学号");
        String sid = sc1.nextLine();


        System.out.println("输入添加的学生名字");
        String name = sc1.nextLine();

        System.out.println("输入添加的学生年龄");
        String age = sc1.nextLine();

        System.out.println("输入添加的学生地址");
        String address = sc1.nextLine();

        student s = new student(sid, name, age, address);
        for(int i=0;i<a.size();i++)
        {
            if(sid.equals(s.getSid()))
            {
                System.out.println("学号重复，添加失败");
                return;
            }
        }

        a.add(s);

        System.out.println("添加成功");
    }

    public static void xiugai(ArrayList<student> a) {
        student s=a.get(cc(a));
        Scanner sc1 = new Scanner(System.in);

        System.out.println("输入修改的学生学号");
        String sid = sc1.nextLine();

        System.out.println("输入修改的学生名字");
        String name = sc1.nextLine();

        System.out.println("输入修改的学生年龄");
        String age = sc1.nextLine();

        System.out.println("输入修改的学生地址");
        String address = sc1.nextLine();

        s.setSid(sid);
        s.setName(name);
        s.setAge(age);
        s.setAddress(address);

    }

    public static void shanchu(ArrayList<student> a) {
        a.remove(cc(a));
        System.out.println("删除成功");
    }

    public static void chazhao(ArrayList<student> a) {
        student s=a.get(cc(a));
        System.out.println(s.getSid() + "\t" + s.getName() + "\t" + s.getAge() + "岁\t" + s.getAddress());
    }

    public static void chakan(ArrayList<student> a) {
        System.out.println("学生学号\t学生名字\t学生年龄\t学生地址\t");
        for (int i = 0; i < a.size(); i++) {
            student s = a.get(i);
            System.out.println(s.getSid() + "\t" + s.getName() + "\t" + s.getAge() + "岁\t" + s.getAddress());

        }
    }
    public static int cc(ArrayList<student> a) {
        for (; ; ){
            System.out.println("输入要操作的学生学号");
        Scanner sc = new Scanner(System.in);
        String q = sc.nextLine();
        int i = 0;
        for (i = 0; i < a.size(); i++) {
            student s = a.get(i);
            if (s.getSid().equals(q)) {

                return i;

            }
        }
        System.out.println("未查询到,请重新输入");
    }

    }
}




