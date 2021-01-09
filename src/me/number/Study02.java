package me.number;

public class Study02 {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 0; i <= 100; i++) {
            if(judge(i)){
                System.out.println("i = " + i);
            }
        }
    }

    public static boolean judge(int a) {
        if ((a % 2) == 0) {
            return true;
        } else return false;
    }
}
