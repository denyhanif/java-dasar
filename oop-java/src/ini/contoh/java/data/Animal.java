package ini.contoh.java.data;

public abstract class Animal {
    public String name;
    /*
    MTHOD ABSTRACT
    Hanya nama method saja body tdak boleh diisi,
    semua turunan clas animal wajib menggunakan method run
     * abstract method memekasa agar semua turunan dari class parent mumpunyai method abstract tersebut
     */

    public abstract void run();
}
