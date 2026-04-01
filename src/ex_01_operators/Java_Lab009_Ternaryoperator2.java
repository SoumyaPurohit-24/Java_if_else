package ex_01_operators;

public class Java_Lab009_Ternaryoperator2 {
    static void main(String[] args) {
        int soumya_age = 24;
        String result = (soumya_age>18) ? (soumya_age>20? "she can drink" : "she can't drink" ) : ("can not go to goa") ;
        System.out.println(result);

        int marks = 100;
        int Soumya =90;
        String result1 = (Soumya>=40) ? (Soumya>=80 ? "get scholorship": "don't get scholorship") : ("fail");
        System.out.println(result1);
    }
}
