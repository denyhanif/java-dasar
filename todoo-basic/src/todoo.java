public class todoo {
    /**
     * \model = variabel array utk menapung to do
     */
    public  static String[] model= new String[10];
    public static java.util.Scanner scanner = new java.util.Scanner(System.in);
    public static void main(String[] args) {
        testInput();


    }

    /**
     * Menampilkan ToDoList
     */
    public static void showTodoList(){
        for (var i =0; i< model.length;i++){
            var todo= model[i];
            var no=i+1;

            if(todo!=null){
                System.out.println(no+ ". " +todo);
            }
        }

    }
    public static void testShowTodoList(){
        model[0]="Belajar";
        model[1]="todo list";
        showTodoList();
    }


    /**
     * Menambah data to do
     */
    public static void addTodoList(String todo){

        //pengecekan apakah data model sudah penuh?
        var penuh= true;
        for(int i =0;i< model.length;i++){
            if (model[i]==null){
                //model masih ada index yang kosong
                penuh= false;
                break;
            }
        }

        //jika penuh, rezise aray jadi duakali lipat
        if(penuh){
            var data_sementara= model;// mnyimpan data model yang lama
            model = new String[model.length*2];
            //pindah data ke array yang sudah direzie
            for (int i=0;i<data_sementara.length;i++){
                model[i]=data_sementara[i];
            }

        }

        //tambah data ke index yang null
        for(var i=0; i< model.length;i++){
            if(model[i]==null){
                model[i] =todo;
                break;
            }
        }

    }
    public static void testAddTodoList(){
        for(int i =0;i<25;i++){
            var nomer= i+1;
            addTodoList("Testong Todo ke. "+nomer);
        }
        showTodoList();
    }

    /**
     * Hapus
     */
    public static boolean removeTodoList(int number){
        if((number-1) >=model.length){
            return false;
        }else if(model[number-1]==null){
            //apakah data index yang di maksud null
            return false;
            //false karna tidak ada yg bisa di hapus
        }else {
            for(int i =(number-1);i<model.length;i++){
                if(i ==(model.length -1)){
                    model[i] =null;
                }else {
                    model[i]=model[i+1];
                }

            }
            return true;
        }
    }
    public static void testRemoveTodoList(){
        addTodoList("satu");
        addTodoList("dua");
        addTodoList("tiga");
        addTodoList("empat");
        addTodoList("lima");
        var hasil = removeTodoList(20);
        System.out.println(hasil);

        hasil =removeTodoList(2);
        System.out.println(hasil);

        showTodoList();
    }

    public static String input(String info){
        System.out.print(info +" : ");
        String data= scanner.nextLine();
        return data;
    }
    public static void testInput(){
        var data=input("Nama");
        System.out.println("HI "+data);
    }
    /**
     * View Tampilan toDo list
     */

    public static void viewShowTodoList(){
        while (true){
            showTodoList();
            System.out.println("Menu");
            System.out.println("1. Tambah");
            System.out.println("2. Hapus");
            System.out.println("3. Keluar");

            var input = input("Pilih");
            if (input.equals("1")){
                viewAddTodoList();
            }else if(input.equals("2")){
                viewRemoveShowTodoList();
            }else if(input.equals("3")){
                break;
            }else {
                System.out.println("pilihan salah");
            }
        }

    }
    /**
     * View Tambah toDo list
     */
    public static void viewAddTodoList(){



    }
     public static void testViewAddTodoList(){
        viewAddTodoList();
     }

    /**
     * View Remove toDo list
     */
    public static void viewRemoveShowTodoList(){

    }

}
