public class Main {

    public static void main(String[] args) {
        String fun = "java is fun and educational";
        int StringLength = fun.length();
        System.out.println("length of the original string = " + StringLength);
        String replaced = fun.replace("educational", "awesome");
        System.out.println("Replaced string : " + replaced);
        String shortendString = fun.substring(0, 17);
        System.out.println("Shortened String : " + shortendString);


    }
}
