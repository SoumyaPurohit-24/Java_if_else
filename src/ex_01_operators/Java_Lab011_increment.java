package ex_01_operators;

public class Java_Lab011_increment {
    static void main(String[] args) {
        int a = 10;
        System.out.println(++a);
        int b = ++a;
        System.out.println(b);//In prefix increment 1st it's increasing the value then assign it to b


        int c = 10;
        int d = c++;
        System.out.println(c);
        System.out.println(d);//In postfix increment it's directly assign the value then increase
    }
}
