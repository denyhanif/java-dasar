public class ShapeApp {
    public static void main(String[] args) {
        var inisahpe = new Shape();
        System.out.println(inisahpe.getCorner());

       // var rec = new Rectangel();
        var rectangle = new Rectangel();
        System.out.println(rectangle.getCorner());
        System.out.println(rectangle.getParentCorner());
    }
}
