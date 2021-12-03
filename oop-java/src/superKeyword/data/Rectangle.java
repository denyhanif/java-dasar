package superKeyword.data;



public class Rectangle extends Shape{
    @Override
    public  int getCorner() {
        return 4;
    }

    public int getParentCorner(){
            /*
            KEYWORD SUPER
            digunakan untuk mengakses
            method / attributr dari class parent
             */
        return super.getCorner();
    }
}
