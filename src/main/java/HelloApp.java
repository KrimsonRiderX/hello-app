public class HelloApp{
    public static void main(String[] args){
        String name = "";
        String name1 = "";
        if (args.length > 0) {
            for (String arg : args) {
                name += "," + arg;
            }
        }

        System.out.println("Hello " + name + "!");

    }
}