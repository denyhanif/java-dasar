public class MethodRecursive {
    public static void main(String[] args) {
        System.out.println("method yang memungkinkan untuk memanggil method dirinya sendri");
        System.out.println("contoh kasus pada faktorial");
        var fr = faktorialRekursif(10);
        var f =factorial(20);
        System.out.println(fr);
        System.out.println(f);
        loop(10000);

    }
    static int factorial(long value){
        var result =1;

        for(var counter =1; counter<= value;counter++){
            result= result *counter;
        }
        return result;
    }

    static  int faktorialRekursif( int value){
        if( value ==1){
            return 1;
        }else {
            return value * faktorialRekursif( value -1);
        }

    }
    static void loop(int value){
        if (value==0){
            System.out.println("selesai");
        }else {
            System.out.println("Loop"+value);
            loop(value-1);
        }
    }
}

