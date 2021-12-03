package superKeyword.app;
import superKeyword.data.Rectangle;
import superKeyword.data.Shape;
public class ShapeApp {
    public static void main(String[] args) {
        var inisahpe = new Shape();
        System.out.println(inisahpe.getCorner());

        var rec = new Rectangle();
        var rectangle = new Rectangle();
        System.out.println(rectangle.getCorner());
        System.out.println(rectangle.getParentCorner());
    }
}
