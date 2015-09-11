package com.example.helloworld;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by OlhaY on 9/8/2015.
 */
public class Practice14 {
//убрать переменную drv из всех функций
    //убираем у ф-й static, чтобы у них был доступ к переменной класса drv
public static String url =
/*"http://angel.net/~nic/passwd.current.html";*/
/*"http://oxogamestudio.com/passwd.current2.htm"*/
        /*"http://oxogamestudio.com/passwd.current3.htm"*/
        "http://oxogamestudio.com/passwd.current6.htm";

    public static void main() {
    }

    @Test
    public void test1() {
        TestHelper.setMaster("master");
        TestHelper.setSitename("google.com");
        TestHelper.generate();
        System.out.println(TestHelper.getPassword());
        TestHelper.slpMs(5000);
    }

    @Test
    public void test2() {
        TestHelper.setMaster("hello");
        TestHelper.setSitename("google.com");
        TestHelper.generate();
        System.out.println(TestHelper.getPassword());
        TestHelper.slpMs(5000);
    }
    //
    @Test
    public void test3() {
        TestHelper.setMaster("qwe123");
        TestHelper.setSitename("gmail.com");
        TestHelper.submitEnter();
        Assert.assertEquals("mKJAakDvwbhi6@1a", TestHelper.getPassword());
        TestHelper.slpMs(5000);
    }

    @Test
    public void test4(){
        TestHelper.setMaster("qwe123");
        TestHelper.setSitename("gmail.com");
        TestHelper.generate();
        Assert.assertEquals("mKJAakDvwbhi6@1a", TestHelper.getPassword());
        TestHelper.slpMs(5000);
    }

    @Test
    public void test5(){
        TestHelper.setMaster("");
        TestHelper.setSitename("");
        TestHelper.generate();
        Assert.assertEquals("BaefBs8/Z/cm2@1a", TestHelper.getPassword());
        TestHelper.slpMs(5000);
    }

    @Test
    public void test6(){
        TestHelper.setMaster("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        TestHelper.setSitename("bbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbb");
        TestHelper.generate();
        Assert.assertEquals("D3YvdfMKPtXGn@1a", TestHelper.getPassword());
        TestHelper.slpMs(5000);
    }

    @Test
    public void test7(){
        TestHelper.setMaster("");
        TestHelper.submitEnter();
        TestHelper.generate();
        Assert.assertEquals("BaefBs8/Z/cm2@1a", TestHelper.getPassword());
        TestHelper.slpMs(5000);
    }

    @Test
    public void test8(){
        TestHelper.setMaster("333");
        TestHelper.setSitename("111");
        TestHelper.generate();
        Assert.assertEquals("CD/iUTsNwzV4v@1a", TestHelper.getPassword());
        TestHelper.slpMs(5000);
    }

    @Test
    public void test9(){
        TestHelper.setMaster("111");
        TestHelper.setSitename("333");
        TestHelper.generate();
        Assert.assertEquals("A61tAOVfX4wCm@1a", TestHelper.getPassword());
        TestHelper.slpMs(5000);
    }

    @Test
    public void test10(){
        TestHelper.setMaster("~!@#$%^&*()_+{}|\":?></\\");
        TestHelper.setSitename("~!@#$%^&*()_+{}|\":?></\\");
        TestHelper.generate();
        Assert.assertEquals("mWxGz2VYwGgZK@1a", TestHelper.getPassword());
        TestHelper.slpMs(5000);
    }


    @Test
    public void test11(){
        TestHelper.setMaster("qwe123");
        TestHelper.setSitename("asd");
        TestHelper.generate();
        Assert.assertEquals("agdjoTB4cjI5E@1a", TestHelper.getPassword());
        TestHelper.slpMs(5000);
    }

    @Test
    public void test12(){
        TestHelper.setMaster("qwe123");
        TestHelper.setSitename("ASD");
        TestHelper.generate();
        Assert.assertEquals("FkfaCm2ddwvDg@1a", TestHelper.getPassword());
        TestHelper.slpMs(5000);
    }

    //bug in this test case. version2
    @Test
    public void test13(){
        TestHelper.setMaster("qwe123");
        TestHelper.setSitename("gmail.com");
        TestHelper.generate();
        Assert.assertEquals("qwe123", TestHelper.getMaster());
        Assert.assertEquals("gmail.com", TestHelper.getSitename());
        TestHelper.slpMs(5000);
    }

    //bug in this test case. version3
    @Test
    public void test14(){
        TestHelper.setMaster("qwe123");
        TestHelper.setSitename("gmail.com");
        TestHelper.generate();
        //попробовать очистить поле Master isEnabled - свойство, вернет true, false. assert(true, ...)
        //TestHelper.findElement("//td/input[@name='master']").click();
        Assert.assertEquals(true, TestHelper.MasterEnable());
        //TestHelper.findElement("//td/input[@name='master']").clear();
        TestHelper.slpMs(5000);
    }

    //bug in this test case. version4
    @Test
    public void test15(){
        TestHelper.setMaster("qwe123");
        TestHelper.setSitename("gmail.com");
        TestHelper.generate();
        //попробовать очистить поле Master isEnabled - свойство, вернет true, false. assert(true, ...)
        //TestHelper.findElement("//td/input[@name='master']").click();
        Assert.assertEquals(true, TestHelper.PasswordEnable());
        //TestHelper.findElement("//td/input[@name='master']").clear();
        TestHelper.slpMs(5000);
    }

    //bug in this test case. version4
    @Test
    public void test16(){
        TestHelper.setMaster("qwe123");
        TestHelper.setSitename("gmail.com");
        TestHelper.generate();
        //попробовать очистить поле Master isEnabled - свойство, вернет true, false. assert(true, ...)
        //TestHelper.findElement("//td/input[@name='master']").click();
        Assert.assertEquals(true, TestHelper.GeneratedPasswordEnable());
        //TestHelper.findElement("//td/input[@name='master']").clear();
        TestHelper.slpMs(5000);
    }
    //bug in 5th version
    @Test
    public void test17(){
        Assert.assertEquals("Your master password", TestHelper.getMasterFieldName());
        Assert.assertEquals("Site name", TestHelper.getSiteFieldName());
        Assert.assertEquals("Generate", TestHelper.getGenerateButtonName());
        Assert.assertEquals("Generated password", TestHelper.getGeneratedPasswordName());
        TestHelper.slpMs(5000);
    }


    @Before
    public void funcBeforeEveryTest() {
        TestHelper.setupUrl(Practice14.url);
    }

    //чтобы после каждого теста закрывался браузер. Иначе при фейле будет открыт браузер
    // и следующие тесты - браузеры открыты, но не закрыты
    @After
    public void funcAfterEveryTest() {
        TestHelper.quit();
    }
}
