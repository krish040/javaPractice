
// class Demo {
//     public static void main(String[] args) {
//         System.out.println("Demo's Main method called!");
//     }
// }

// public class Test {
//     public static void main(String[] args) {
//         System.out.println("Calling Demo's main method:");
//         Demo.main(args); // Calling the main method explicitly
//     }
// }


// public class RecursionExample {
    //     public static void main(String[] args) {
//         System.out.println("Main method called!");
//         System.out.println("args : "+args);
//         if (args.length == 0) {
    //             String[] newArgs = {"HELLO"};
//             main(newArgs); // Recursive call to main
//         }
//     }
// }



public class Myfun{

    public static void m1(byte b){
        System.out.println("b: "+b);
    }
    public static void m2(int i){
        System.out.println("int: "+i);
    }
    public static void m3(short s){
        System.out.println("short: "+s);
    }
    public static void m4(long l){
        System.out.println("long: "+l);
    }
    public static void m5(float f){
        System.out.println("float: "+f);
    }
    public static void m6(double d){
        System.out.println("double: "+d);
    }
    public static void m7(char c){
        System.out.println("char: "+c);
    }
    public static void m8(String s){
        System.out.println("String: "+s);
    }
    public static int add(int a,int b){
        return(a+b);
    }

    public static void main(String[] args) {
        m1((byte)10);
        m2(20);
        m3((short)20);
        m4(20L);
        m5(20.5f);
        m6(20.5);
        m7('A');
        m8("kashish");
        System.out.println("addition : "+add(4,3));
    }
}