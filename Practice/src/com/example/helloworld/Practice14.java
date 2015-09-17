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
        "http://oxogamestudio.com/passwd.current9.htm";

    public static void main() {
    }

    @Test
    public void test1() {
        AngelPage.setMaster("master");
        AngelPage.setSitename("google.com");
        AngelPage.generate();

        System.out.println(AngelPage.getPassword());
        TestHelper.slpMs(5000);
    }

    @Test
    public void test2() {
        AngelPage.setMaster("hello");
        AngelPage.setSitename("google.com");
        AngelPage.generate();
        System.out.println(AngelPage.getPassword());
        TestHelper.slpMs(5000);
    }
    //
    @Test
    public void test3() {
        AngelPage.setMaster("qwe123");
        AngelPage.setSitename("gmail.com");
        AngelPage.waitForGenerateButton();
        AngelPage.submitEnter();
        AngelPage.waitForGeneratedPassword();
        Assert.assertEquals("mKJAakDvwbhi6@1a", AngelPage.getPassword());
        TestHelper.slpMs(5000);
    }

    @Test
    public void test4(){
        AngelPage.setMaster("qwe123");
        AngelPage.setSitename("gmail.com");
        AngelPage.generate();
        AngelPage.waitForGeneratedPassword();
        Assert.assertEquals("mKJAakDvwbhi6@1a", AngelPage.getPassword());
        TestHelper.slpMs(5000);
    }

    @Test
    public void test5(){
        AngelPage.setMaster("");
        AngelPage.setSitename("");
        AngelPage.generate();
        AngelPage.waitForGeneratedPassword();
        Assert.assertEquals("BaefBs8/Z/cm2@1a", AngelPage.getPassword());
        TestHelper.slpMs(5000);
    }

    @Test
    public void test6(){
        AngelPage.setMaster("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        AngelPage.setSitename("bbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbb");
        AngelPage.generate();
        AngelPage.waitForGeneratedPassword();
        Assert.assertEquals("D3YvdfMKPtXGn@1a", AngelPage.getPassword());
        TestHelper.slpMs(5000);
    }

    @Test
    public void test7(){
        AngelPage.setMaster("");
        AngelPage.submitEnter();
        AngelPage.generate();
        AngelPage.waitForGeneratedPassword();
        Assert.assertEquals("BaefBs8/Z/cm2@1a", AngelPage.getPassword());
        TestHelper.slpMs(5000);
    }

    @Test
    public void test8(){
        AngelPage.setMaster("333");
        AngelPage.setSitename("111");
        AngelPage.generate();
        AngelPage.waitForGeneratedPassword();
        Assert.assertEquals("CD/iUTsNwzV4v@1a", AngelPage.getPassword());
        TestHelper.slpMs(5000);
    }

    @Test
    public void test9(){
        AngelPage.setMaster("111");
        AngelPage.setSitename("333");
        AngelPage.generate();
        AngelPage.waitForGeneratedPassword();
        Assert.assertEquals("A61tAOVfX4wCm@1a", AngelPage.getPassword());
        TestHelper.slpMs(5000);
    }

    @Test
    public void test10(){
        AngelPage.setMaster("~!@#$%^&*()_+{}|\":?></\\");
        AngelPage.setSitename("~!@#$%^&*()_+{}|\":?></\\");
        AngelPage.generate();
        AngelPage.waitForGeneratedPassword();
        Assert.assertEquals("mWxGz2VYwGgZK@1a", AngelPage.getPassword());
        TestHelper.slpMs(5000);
    }


    @Test
    public void test11(){
        AngelPage.setMaster("qwe123");
        AngelPage.setSitename("asd");
        AngelPage.generate();
        AngelPage.waitForGeneratedPassword();
        Assert.assertEquals("agdjoTB4cjI5E@1a", AngelPage.getPassword());
        TestHelper.slpMs(5000);
    }

    @Test
    public void test12(){
        AngelPage.setMaster("qwe123");
        AngelPage.setSitename("ASD");
        AngelPage.generate();
        AngelPage.waitForGeneratedPassword();
        Assert.assertEquals("FkfaCm2ddwvDg@1a", AngelPage.getPassword());
        TestHelper.slpMs(5000);
    }

    //bug in this test case. version2
    @Test
    public void test13(){
        AngelPage.setMaster("qwe123");
        AngelPage.setSitename("gmail.com");
        AngelPage.generate();
        Assert.assertEquals("qwe123", AngelPage.getMaster());
        Assert.assertEquals("gmail.com", AngelPage.getSitename());
        TestHelper.slpMs(5000);
    }

    //bug in this test case. version3
    @Test
    public void test14(){
        AngelPage.setMaster("qwe123");
        AngelPage.setSitename("gmail.com");
        AngelPage.generate();
        //попробовать очистить поле Master isEnabled - свойство, вернет true, false. assert(true, ...)
        //TestHelper.findElement("//td/input[@name='master']").click();
        Assert.assertEquals(true, AngelPage.MasterEnable());
        //TestHelper.findElement("//td/input[@name='master']").clear();
        TestHelper.slpMs(5000);
    }

    //bug in this test case. version4
    @Test
    public void test15(){
        AngelPage.setMaster("qwe123");
        AngelPage.setSitename("gmail.com");
        AngelPage.generate();
        //попробовать очистить поле Master isEnabled - свойство, вернет true, false. assert(true, ...)
        //TestHelper.findElement("//td/input[@name='master']").click();
        Assert.assertEquals(true, AngelPage.PasswordEnable());
        //TestHelper.findElement("//td/input[@name='master']").clear();
        TestHelper.slpMs(5000);
    }

    //bug in this test case. version4
    @Test
    public void test16(){
        AngelPage.setMaster("qwe123");
        AngelPage.setSitename("gmail.com");
        AngelPage.generate();
        //попробовать очистить поле Master isEnabled - свойство, вернет true, false. assert(true, ...)
        //TestHelper.findElement("//td/input[@name='master']").click();
        Assert.assertEquals(true, AngelPage.GeneratedPasswordEnable());
        //TestHelper.findElement("//td/input[@name='master']").clear();
        TestHelper.slpMs(5000);
    }
    //bug in 5th version
    @Test
    public void test17(){
        Assert.assertEquals("Your master password", AngelPage.getMasterFieldName());
        Assert.assertEquals("Site name", AngelPage.getSiteFieldName());
        Assert.assertEquals("Generate", AngelPage.getGenerateButtonName());
        Assert.assertEquals("Generated password", AngelPage.getGeneratedPasswordName());
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
