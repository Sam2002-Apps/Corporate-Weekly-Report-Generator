// This is a specific type of report for the Sales Department.
public class SalesReport extends Report {

    public SalesReport() {
        this.type = "Sales Report";
    }

    @Override
    void generateHeader() {
        System.out.println("--------------------------------");
        System.out.println("   WEEKLY SALES DEPARTMENT LOG  ");
        System.out.println("--------------------------------");
    }
}