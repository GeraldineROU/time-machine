package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
       RealTimeMaster timeMaster = new RealTimeMaster();
        Welcome welcome = new Welcome(timeMaster);
        String message = welcome.getMessage();
        System.out.print(message);
    }
}