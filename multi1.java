public class multi1 {
    private static boolean running;

    public static void main(String[] args) {
        var t1 = new Thread(() -> {
            running = true;
            System.out.println("Java?");
        });

        t1.start();
    }
}