public class ParentApp {
    public static void main(String[] args) {
        Child child = new Child();
        child.name = "Eko";
        child.doIt();
        System.out.println(child.name);

        // Object Parent di konvesi ke child
        Parent parent = (Parent) child;
        parent.doIt();//sehingga yang di panggil yang child

        Parent parent1= new Parent();
        parent1.doIt();
    }
}
