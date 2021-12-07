public class ForLoop {
    public static void main(String[] args) {
        //init statement(hanya di eksekusi sekali);kondisi; post statememt
        for (var counter = 1; counter <=10;counter++){
            System.out.println("Perulanagan" + counter);
        }
        //var count=0;
        //pos statment tidak di jalankan saat pertama kali
        for (var count=1; count<= 10;count += 1){
            count++;
            System.out.println("perulang" + count);

//2 4 6 8
        }
    }
}
