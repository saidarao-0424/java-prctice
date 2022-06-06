public class HelloWorld {

    public static void main (String args[]){
        System.out.println("HELLO I want addtion"+add(10,20));
        System.out.println("HELLO I want sub"+sub(30,20));
        System.out.println("HELLO I want mul"+mul(30,20));
    }

    public static int add(int num1, int num2){
        return num1+num2;
    }
    public static int sub(int num1, int num2){
        return num1-num2;
    }
    public static int mul(int num1, int num2){
        return num1*num2;
    }
}