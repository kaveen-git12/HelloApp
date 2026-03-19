public class HelloApp{
    public static void main(String[] args){
        String defname = "World";
        if(args.length > 0){
            String name = args[0];
            System.out.println("Hello, "+ name + "!");
            return;
        }
        System.out.println("Hello, "+ defname + "!");

    }
}