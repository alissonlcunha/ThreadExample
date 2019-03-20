public class ThreadCorridaCarros {
    public static void main (String[] args) {
        new ExemploThread("Ferrari").start();
        new ExemploThread("McLaren").start();
    }
}
