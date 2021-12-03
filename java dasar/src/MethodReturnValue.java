public class MethodReturnValue {
    public static void main(String[] args) {
        jumlah(12,12);
        var jumlah2 =jumlah(12,20);

        System.out.println(jumlah(12,41));
        System.out.println(jumlah2);
        var hit2 = hitung(9,"+",80);
        System.out.println(hitung(1,"-",9));
        System.out.println(hit2);
    }

    static int jumlah(Integer val1,Integer val2){
     var total = val1 + val2;
     return total;
    }

    static int hitung(int value1, String operasi,int value2){
        switch(operasi){
            case "+":
                return value1+ value2;
            case "-":
                return value1 - value2;
            default:
                return 0;
        }
    }
}
