public class ArrayType {
    public static void main(String[] args) {

        String [] arrayStrinng;

        arrayStrinng= new String[3];
        //System.out.println(" array string "+ arrayStrinng);

        String[] arrayString2= new String[3];
        Integer[] arrayInteg = new Integer[3];

        arrayInteg[0]=10;
        arrayInteg[1]=20;

        System.out.println(arrayInteg[1]);
        System.out.println("aray integr");
        for (var printarInteg : arrayInteg){
            System.out.println(printarInteg +",");
        }

        arrayString2[0]= "Deny";
        arrayString2[1]= "ny";
        arrayString2[2]= "eny";


        System.out.println(arrayString2[0]);
// Array Initializer
        int[] arrayint = new int[]{
                1,2,3,4,5,6
        };

        String [] namaSaya ={
                "Deny","hanif"
        };
        long[] arrayLong={
                10l,20l,30l
        };

        namaSaya.toString();
        System.out.println(namaSaya[0]);

        String[][] members={
                {"aku","kamu"},
                {"tutorial","java"},
                {"mitra","data"},
        };

        System.out.println(members[2][1]);



    }
}
