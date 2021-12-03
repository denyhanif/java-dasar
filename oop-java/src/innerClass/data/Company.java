package innerClass.data;

public class Company {

    private String name;

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    //innerclass

    public  class  Employee{
        private String name;

        //ambil nama copany
        public String getCompany(){
            return Company.this.getName();
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }
}
