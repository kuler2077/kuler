package me.study;

public class PlayGround {
    public static void main(String[] args) {
        LanguageService chinese = new Chinese();
        chinese.sayHello();
        chinese.myCountry();
        LanguageService a = new American();
        a.sayHello();
    }
}
