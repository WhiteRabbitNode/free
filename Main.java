public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World");
        System.out.println("ABC");
        System.out.println(123456);
        resultEnumTest();
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
    private static void learnEnumTest() {
        System.out.println("Spring:"+LearnEnum.SPRING);
        System.out.println("Summer:"+LearnEnum.SUMMER);
        System.out.println("Autumn:"+LearnEnum.AUTUMN);
        System.out.println("Winter:"+LearnEnum.WINTER);
    }

    private static void resultEnumTest() {
        System.out.println(ResultEnum.SUCCESS);
        System.out.println(ResultEnum.UNKNOWN_ERROR);
        System.out.println(ResultEnum.FILE_NOT_FOUND);
    }
}
