<<<<<<< feature/UC2
public class HelloApp{
    public static void main(String[] args){
        String name = args[0];
        System.out.println("Hello, "+ name + "!");
=======
public class HelloApp {
    public static void main(String[] args) {
        String defname = "World";

        if (args.length > 0) {
            StringBuilder sb = new StringBuilder();

            for (int i = 0; i < args.length; i++) {
                sb.append(args[i]);

                if (i < args.length - 1) {   // we only need to add comma between items
                    sb.append(", ");
                }
            }

            System.out.println("Hello, " + sb + "!");
        } else {
            System.out.println("Hello, " + defname + "!");
        }
>>>>>>> local
    }
}