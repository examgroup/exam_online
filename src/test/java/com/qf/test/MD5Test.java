package com.qf.test;

import org.apache.shiro.crypto.hash.Md5Hash;
import org.junit.Test;

public class MD5Test {

    @Test
    public void test(){
        String encode = new Md5Hash("123456","shirojava",3).toString();
//        System.out.println(new Md5Hash("we will meet at 7 o'clock at square.").toString());
        System.out.println(encode);
    }
}
