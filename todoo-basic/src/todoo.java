public class todoo {
    /**
     * \model = variabel array utk menapung to do
     */
    public  static String[] model= new String[10];
    public static void main(String[] args) {
        testRemoveTodoList();


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
    /**
     * View Tampilan toDo list
     */

    public static void viewShowTodoList(){

    }
    /**
     * View Tambah toDo list
     */
    public static void viewAddTodoList(){

    }
    /**
     * View Remove toDo list
     */
    public static void removeShowTodoList(){

    }

}
