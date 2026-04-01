package ex_01_operators;

public class Java_Lab008_Ternaryoperator {
    static void main(String[] args) {
        int age = 19;
        String can_go_to_goa = age>18 ? "yes":"No";
        System.out.println(can_go_to_goa);
        int number = 5;
        String findout = number>0 ? "+ve":"-ve";
        System.out.println(findout);
        int number1 = -5;
        String result = number<0 ? "+ve":"-ve";
        System.out.println(result);
        int a = 10;
        Boolean results = a>10 ? true : false ;
        System.out.println(results);
    }
}
