//public final class LearnEnum extends java.lang.Enum<LearnEnum> {
//    public static final LearnEnum SPRING;
//    public static final LearnEnum SUMMER;
//    public static final LearnEnum AUTUMN;
//    public static final LearnEnum WINTER;
//    public static LearnEnum[] values();
//    public static LearnEnum valueOf(java.lang.String);
//    static {};
//}
// 想当于New一遍4个LearnEnum类
public enum LearnEnum {
    SPRING,SUMMER,AUTUMN,WINTER;

    LearnEnum() {
        System.out.println("创建实体类");
    }
}