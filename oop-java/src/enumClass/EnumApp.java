package enumClass;

public class EnumApp {
    public static void main(String[] args) {
        Customer customer = new Customer();
        customer.setName("deny");
        customer.setLevel(Level.STANDARD);

        System.out.println(customer.getName());
        System.out.println(customer.getLevel());

        System.out.println(customer.getLevel().getDesc());
    }
}
