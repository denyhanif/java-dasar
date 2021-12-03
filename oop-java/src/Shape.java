class Shape {
    int getCorner(){
        return 0;
    }
}

class Rectangel extends Shape{
    @Override
    int getCorner() {
        return 4;
    }

    int getParentCorner(){
            /*
            KEYWORD SUPER
            digunakan untuk mengakses
            method / attributr dari class parent
             */
        return super.getCorner();
    }
}
