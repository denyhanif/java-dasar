public class ManagerApp {
    public static void main(String[] args) {
        var vmanager = new Manager("denymanager");
        vmanager.name="deny";
        vmanager.sayHello("Hanif");

        var vvicepresident = new VicePresident("denyvp");
        vvicepresident.name="eko";
        vvicepresident.sayHello("kanedi");

    }
}
