public class HelloApp {
    public static void main(String[] args) {

        String name = String.join(",", args);
        if (args.length > 0) {
            System.out.println("Hello " + name + "!");
        } else {
            System.out.println("Hello!");
        }
    }
}