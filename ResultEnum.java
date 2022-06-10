public enum ResultEnum {
    SUCCESS(0,"成功"),
    UNKNOWN_ERROR(100,"未知错误"),
    FILE_NOT_FOUND(101,"文件未找到");
    private final int code;
    private final String msg;

    ResultEnum(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    @Override
    public String toString() {
        return "ResultEnum{" +
                "code=" + code +
                ", msg='" + msg + '\'' +
                '}';
    }
}
