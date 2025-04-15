class Demo {
    // 1️Static block (executes only once when class is loaded)
    static {
        System.out.println("1. Static Block");
        int staticVar = 26;
         System.out.println(staticVar);
    }

    // 2️Static variable declaration
    static int staticVar;// = staticMethod();

    static {System.out.println(staticVar);}

    static int staticMethod() {
        System.out.println("2. Static Variable Initialization");
        return 10;
    }

    // 3️ Instance variable declaration
    int instanceVar = instanceMethod();

    int instanceMethod() {
        System.out.println("4. Instance Variable Initialization");
        return 20;
    }

    // 4️Instance block (executes every time an object is created)
    {
        System.out.println("5. Instance Block");
    }

    // 5️Constructor
    Demo() {
        System.out.println("6. Constructor Execution");
    }

    public static void main(String[] args) {
        System.out.println("7. Main Method");

        // Creating two objects to see instance-level execution
        System.out.println("Creating first object:");
        Demo obj1 = new Demo();

    }
}
