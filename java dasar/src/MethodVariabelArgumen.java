public class MethodVariabelArgumen {

    public static void main(String[] args){
        System.out.println("mengirim data ke method dengan jumlah yg belum pasti");
        System.out.println("di tempatkan di parameter ke dua/ akhir");

        System.out.println("hello");
        int []nilai = {80,80,80};
        sayCongrats("deny",nilai);
        sayCongrats("budi",20,20,70);
    }

    static void sayCongrats(String nama, int... values){
        var total = 0;
        for(var value : values){
            total += value;
        }
        var finalvalue= total/ values.length;
         if (finalvalue>=75){
             System.out.println("lulus");
         }else {
             System.out.println("belum lulus");
         }
    }
}
