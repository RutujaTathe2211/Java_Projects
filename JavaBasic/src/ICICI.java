//class that extends interface//also support multiple inheritance
//interface are 100% abstraction
public class ICICI implements Employee,RBi {
    //Employee Interface
    @Override
    public void employeeDetails() {
        System.out.println("Employee Details");
    }

    @Override
    public void companyDetails() {
        System.out.println("Company details");
    }

    @Override
    public void educationLoan() {
        System.out.println("Education loan");
    }

    @Override
    public void homeLoan() {
        System.out.println("Home loan");
    }

    @Override
    public void carloan() {
        System.out.println("Car Loan");

    }

    public static void main(String[] args) {
        ICICI i=new ICICI();
        i.employeeDetails();
        i.companyDetails();
        i.carloan();
        i.educationLoan();
        i.homeLoan();
        System.out.println(Employee.minbalance);
    }
}
