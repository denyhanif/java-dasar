package staticKeyword.app;
import staticKeyword.data.*;
public class staticApp {
    public static void main(String[] args) {
        System.out.println(staticVariable.APPLICATION);
        System.out.println(staticVariable.VERSION);

        System.out.println(statisMethod.sum(1,2,2));

        staticOuterClass.InnerClass innerClass = new staticOuterClass.InnerClass();
        innerClass.setName("asdadsasd");
        System.out.println(innerClass.getName());
    }
}
