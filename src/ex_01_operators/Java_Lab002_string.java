package ex_01_operators;

public class Java_Lab002_string {
    static void main(String[] args) {
        String First_name = ("soumya");
        String Last_name = ("purohit");
    System.out.println(First_name + Last_name); //concatenation happened here
        int a = 10;
        int b = 20;
    System.out.println(First_name + Last_name + a+b);
    System.out.println(a+b+First_name + Last_name);
    System.out.println(First_name + Last_name + (a+b));
    }
}
//whenever it sees strings, it will do concatenation and for the next one also it will do concatenation
//but when it sees integer first it will do mathematical operation and the next time when it sees string
// it will do concatenation as well
//BODMAS rule applies
