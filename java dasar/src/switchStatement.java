public class switchStatement {
    public static void main(String[] args) {
        //perbandingan dengan ==

        var nilai= 80;

        switch (nilai){
            case 90:
            System.out.println("nilai bagus");
            break;
            case 80:
                System.out.println("nilai lumayan");
                break;
            case 70:
                System.out.println("nilai kurang");
                break;
            default:
                System.out.println("ckuakkz");
        }

        //Switc Lambda

        var skor = "c";
        switch(skor){
            case "a"-> System.out.println("anda lulus dengan baik");
            case "b","c"-> System.out.println("skor anda cukup baik");
            default ->{
                System.out.println("anda salah jurusan");
            }
        }
    }
}
