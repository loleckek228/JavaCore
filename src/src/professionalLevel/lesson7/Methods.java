package professionalLevel.lesson7;

public class Methods {

    @BeforeSuite
    public static void printHello() {
        System.out.println("Hello");
    }

    @AfterSuite
    public static void printBye() {
        System.out.println("Bye");
    }

    @Test(priority = 2)
    public static void print2() {
        System.out.println("Приоритет метода: " + 2);
    }

    @Test(priority = 11)
    public static void print11() {
        System.out.println("Приоритет метода: " + 10);
    }

    @Test(priority = -1)
    public static void print1(){
        System.out.println("Приоритет метода: " + 1);
    }
}