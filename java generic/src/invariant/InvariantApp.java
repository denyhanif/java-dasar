package invariant;

import generic.MyData;

public class InvariantApp {
    public static void main(String[] args) {
        MyData<String > StrMyData = new MyData<>("deny");
        //iniObj(StrMyData); EROR karena tidak bisa mengubah string ke obj

        MyData<Integer > intMyData = new MyData<>(20);
        iniObjInt(intMyData);
        //iniObj(intMyData);EROR tidak bisa mengubah Integer ke obj

    }

    public static void iniObj(MyData<Object> objectMyData){
        System.out.println();
    }


    public static void iniObjInt(MyData<Integer> intMyData){

    }

}

