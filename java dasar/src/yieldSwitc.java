public class yieldSwitc {
    public static void main(String[] args) {

        //yield seperti return statemet
        var nilai = "A";

        String ucapan = switch(nilai){
            case "A":
                yield "anda lulus dengan baik";
            case "B","C":
                yield "nilai anda cukup";
            default:
                yield "Mungkin anda belum belajar";


        };
    }
}
