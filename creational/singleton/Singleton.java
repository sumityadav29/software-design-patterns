public class Singleton {

    private static Singleton instance;

    public synchronized static getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

    private Singleton(){}

    public static void main(String[] args) {

    }
}