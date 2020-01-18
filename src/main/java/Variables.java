public class Variables {
    private static String TEXT = "The end.";

    public static void main(String[] args) {
        System.out.println("Hi");
        String s = "Hi!";
        System.out.println(s);
        if (args != null && args.length > 0) {
            String s2 = s;
            System.out.println(s2);
        }
        Variables variables = new Variables();
        System.out.println(variables.classVariables);
        System.out.println(TEXT);
    }

    public String classVariables;

    public Variables() {
        this.classVariables = "Class Variables test.";
    }
}