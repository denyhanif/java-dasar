package generic.application;

import generic.MultipleParamGeneric;
import generic.MyData;

public class GenericClassApp {
    public static void main(String[] args) {

        /**
         * Parameter pada generic class bebas menerima type apa saja
         */

        /**
         *Instansiasi generic class
         * obj MyData menerima param<String>
         */
        MyData<String> dataString = new MyData<String>("MasDen");
        /**
         *Instansiasi generic class
         * obj MyData menerima param<Integer> parameter harus bersifat object / tipe bukan primitif
         */
        MyData<Integer> dataInteg= new MyData<Integer>(12);

        String nilaiString = dataString.getData();
        Integer nilaiInteger = dataInteg.getData();

        System.out.println(nilaiString);
        System.out.println(nilaiInteger);

        System.out.println(dataInteg.getData());


    }
}
