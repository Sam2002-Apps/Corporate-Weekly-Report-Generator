// This is the main entry point of the application.
public class Main {
    public static void main(String[] args) {
        // Step 1: Load the templates
        ReportRegistry.loadCache();

        // Step 2: Manager asks for a new Sales Report (Cloning logic)
        // We request ID "1" which is the Sales Report
        Report myWeek1Report = ReportRegistry.getReport("1");

        // Step 3: Verify it works
        System.out.println("\nGenerating new report...");
        System.out.println("Type: " + myWeek1Report.getType());

        // Step 4: Customize the report (This proves we are working on a copy)
        myWeek1Report.generateHeader();
        myWeek1Report.setContent("Sales for Week 1: $10,000 profit.");

        System.out.println("Content: " + myWeek1Report.getContent());
    }
}