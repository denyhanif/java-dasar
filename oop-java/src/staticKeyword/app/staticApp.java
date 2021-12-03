package staticKeyword.app;
import staticKeyword.data.*;
import static staticKeyword.data.staticVariable.APPLICATION;
public class staticApp {
    public static void main(String[] args) {
        //static var
        System.out.println(APPLICATION);
        System.out.println(staticVariable.VERSION);
        //static func
        System.out.println(statisMethod.sum(1,2,2));
        //static method
        staticOuterClass.InnerClass innerClass = new staticOuterClass.InnerClass();
        innerClass.setName("asdadsasd");
        System.out.println(innerClass.getName());

        //static block
        System.out.println(staticBlock.PROCESSORS);
    }
}
