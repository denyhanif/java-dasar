public class TipeDataBukanPrimitif {

    //memliliki default null /Object
    //bisa menggunakan method

    int iniInt = 100;
    Integer iniInt2 = iniInt;

    // ke bukan primitif

    short iniShort = iniInt2.shortValue();
    long iniLong = iniInt2.longValue();
    float iniFloat = iniInt2.shortValue();

}
