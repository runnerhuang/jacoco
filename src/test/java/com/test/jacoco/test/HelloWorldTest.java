package com.test.jacoco.test;

/**
 * Created by zc on 2017/5/2.
 */

import junit.framework.Assert;
import junit.framework.TestCase;
import org.junit.Test;
import com.test.jacoco.HelloWorld;

public class HelloWorldTest {
    @Test
    public void testMethod1() {
        HelloWorld hw = new HelloWorld();
        String ss = hw.testMethod1();
        TestCase.assertNotNull(ss);
    }

    @Test
    public void testMethod2() {
        HelloWorld hw = new HelloWorld();
        int ss = hw.addMethod(1, 1);
        TestCase.assertEquals(ss, 2);
    }

    @Test
    public void testMethod3(){
        HelloWorld hw = new HelloWorld();
        int cc = hw.addMethod(3,2);
        TestCase.assertEquals(cc, 4);

    }
}
