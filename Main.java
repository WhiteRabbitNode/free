public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World");
        System.out.println("ABC");
        System.out.println(123456);
    }
    private static void patternMatchTest() {
        String str = "Hello";
        PatternMatch.which(str);
        PatternMatch.which(123);
        PatternMatch.which(2.3);
    }
    private static void recodeTest() {
        RecordTest rt = new RecordTest("abc");
        System.out.println(rt);
    }
}
