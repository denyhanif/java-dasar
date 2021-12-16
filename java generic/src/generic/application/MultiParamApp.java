package generic.application;

import generic.MultipleParamGeneric;

public class MultiParamApp {
    public static void main(String[] args) {
        /**
         * Class generic juga dapat menerima lebih dari satu param
         * asalkan nama param nya berbeda
         */
        MultipleParamGeneric<String ,Integer> dataku = new MultipleParamGeneric<String,Integer>("Deny",19);
        MultipleParamGeneric<String ,String> data2 = new MultipleParamGeneric<String,String>("Deny","HAnif");

        System.out.println(dataku.getData1());
        System.out.println(dataku.getData2());
    }
}
