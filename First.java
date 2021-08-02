public class First {
    public static void main(String[] args) {
        String out = myMethod("Qwerty12345");
        System.out.println(out);
    }
    private static String myMethod(String input) {
        if ("Qwerty12345".equals(input)) {
            return input.substring(0,6)+input.substring(9);
        }
        else {
            return "ERROR";
        }
    }
}
