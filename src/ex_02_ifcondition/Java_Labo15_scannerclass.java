package ex_02_ifcondition;
import java.util.*;
import java.lang.*;

public class Java_Labo15_scannerclass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("My grade is");
        char grade = sc.next().charAt(0);
        if (grade>=80){
            System.out.println('A');
        }else if(grade>=60){
            System.out.println('B');
        }else if (grade >= 40){
            System.out.println('c');
        }else {
            System.out.println('d');
        }
        System.out.println("My grade is " + grade);
    }
}
