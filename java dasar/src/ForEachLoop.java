public class ForEachLoop {
    public static void main(String[] args) {

        //mengakses data dalam array

        String[] array ={
                "deny","hanif","ibrahim"
        };

        System.out.println("Tanpa Foreach");

        for(int i =0; i < array.length;i++){
            System.out.println(array[i]);
        }
        System.out.println("Dengan Foreach");

        Integer[] angka={1,23,4,5,};

        for (var printarray : angka){
            System.out.print(printarray +",");
        }


    }
}
