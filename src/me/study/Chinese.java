package me.study;

public class Chinese implements LanguageService{
    @Override
    public void sayHello() {
        System.out.println("你好");
    }

    @Override
    public void myCountry() {
        System.out.println("中华民国");
    }
}
