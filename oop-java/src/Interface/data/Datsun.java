package Interface.data;

public class Datsun implements Car,IsMaintenance{

    @Override
    public boolean isMaintenance() {
        return false;
    }

    @Override
    public String getBrands() {
        return "Toyota";
    }

    public void drive() {
        System.out.println("Datsun drive");
    }


    public int getTier() {
        return 0;
    }
}
