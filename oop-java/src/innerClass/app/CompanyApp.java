package innerClass.app;

import innerClass.data.Company;

public class CompanyApp {
    public static void main(String[] args) {
        Company company = new Company();
        company.setName("PT MOBAT MABIT");
        //instansiasi obj inner class
        Company.Employee employee = company.new Employee();
        employee.setName("MAs Den");

        System.out.println(employee.getName());
        System.out.println(employee.getCompany());
    }
}
