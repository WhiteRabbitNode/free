// 学习模式匹配
public class PatternMatch {
    public static void which(Object obj) {
        if(obj instanceof String str) {
            System.out.println(str + "是String类型");
        } else if (obj instanceof Integer i) {
            System.out.println(i + "是Integer类型");
        } else {
            System.out.println("其它类型");
        }
    }
}

