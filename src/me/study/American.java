package me.study;

public class American implements LanguageService{
    @Override
    public void sayHello() {
        System.out.println("hello");
    }

    @Override
    public void myCountry() {
        System.out.println("USA");
    }
    public void sayAge(){
        System.out.println("18");
    }
}
