package staticKeyword.data;

public class staticBlock {

    public static int PROCESSORS;

    static {
        System.out.println("Meng akses klass staticBLOK");
        PROCESSORS = Runtime.getRuntime().availableProcessors();

    }
}
