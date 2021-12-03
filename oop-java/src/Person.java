public class Person {
    String name;
    String address;
    final String country ="indonesia";

    /*KONSTRUKTOR
        *dibwah ini yaitu constructor fungsi yang
         pertama kali di jalankan saat object di buat
         * Penamaannya sesuai dengan nama file
         * parameter wajib di tambahkan saat instansiasi object ex Person()

     */
    Person(String parameterNama, String parameterAddress){
        this.name = parameterNama;
        //this = mengacu pada object saat ini
        //var ikiperson = new Person();
        //ikiperson.address = parameterAddress;
        this.address = parameterAddress;

    }
    /*
    COSNTRUCTOR OVERLOADING
    Memubnkan untuk memiliki lebih dari satu
    konstruktor dengan nama yang sama,
    tapi di bedkan di jumlah parametternya
     */
    Person(String paramName){
        this(paramName,null);

    }
    Person(){
        this(null,null);

    }

    void sayHello(String paramName){
        System.out.println("HEllo"+paramName+ ", My name is"+name+ "From " +address);
    }

}
