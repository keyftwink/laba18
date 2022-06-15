public class Main {

    public static void main(String[] args) {

        Singleton singleton = Singleton.getInstance();
        singleton.function(2,1);
    }
}
class Singleton {
    private static Singleton INSTANCE;

    private Singleton() {
    }

    public static Singleton getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new Singleton();
        }
        return INSTANCE;
    }

    public void function(int x, int y) {
        System.out.println(2 * x + 3 / y);
    }
}

