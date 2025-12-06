package org.studyeasy;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        try{
            System.out.println("Before Expeption");
            System.out.println("This divide by 8 excption"+10/0);
            System.out.println("After Expeption");
        }catch (ArithmeticException e){
            System.out.println("Arithmetic Exception");
        }catch (Exception e){
            System.out.println("Expeption");
        }

    }
}