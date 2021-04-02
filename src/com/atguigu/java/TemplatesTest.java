package com.atguigu.java;

import com.atguigu.bean.Customer;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * @author wjfpeter
 * @create 2021-03-30 4:31 下午
 *
 *
 */
public class TemplatesTest {

    //模版六： prsf:可生成 private static final
    private static final Customer CUST = new Customer();

    //变形:psf
    public static final int NUM = 1;
    //变形:psfi
    public static final int NUM2 = 2;
    //变形:psfs
    public static final String NATION = "china";

    //模版一：psvm
    public static void main(String[] args) {

        //模版二：
        System.out.println("Hello!");
        //变形：soutp / soutm / soutv /xxx.sout
        System.out.println("args = " + Arrays.deepToString(args));
        System.out.println("TemplatesTest.main");
        
        int num1 = 10;
        System.out.println("num1 = " + num1);
        int num2 = 20;
        System.out.println("num2 = " + num2);
        System.out.println(num1);

        //模版三：fori
        String[] arr = new String[]{"Tom","Jerry","HanMeimei","Lilei"};
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);

        }
        //变形：iter
        for (String s : arr) {
            System.out.println(s);
        }
        //变形：itar
        for (int i = 0; i < arr.length; i++) {
            String s = arr[i];
            System.out.println(s);
        }

        //模版四：list.for
        ArrayList list = new ArrayList();
        list.add("123");
        list.add("345");
        list.add("567");

        for (Object o : list) {
            
        }
        
        //变形：list.fori
        for (int i = 0; i < list.size(); i++) {
            
        }
        
        //变形：list.forr 倒序遍历
        for (int i = list.size() - 1; i >= 0; i--) {
            
        }




    }

    public void method(){
        System.out.println("TemplatesTest.method");

        //模版五：ifn
        ArrayList list = new ArrayList();
        list.add("123");
        list.add("345");
        list.add("567");

        if (list == null) {

        }
        //变形：inn
        if (list != null) {

        }

        //变形：xxx.nn / xxx.null
        if (list == null) {

        }

        if (list != null) {

        }
    }

}
