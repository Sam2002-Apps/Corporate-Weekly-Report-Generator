import java.util.Hashtable;

// This class stores the "Master Templates" so we don't have to recreate them.
public class ReportRegistry {

    // A Hashtable to store our templates (Cache)
    private static Hashtable<String, Report> reportMap = new Hashtable<String, Report>();

    // This method retrieves a CLONE of the cached report
    public static Report getReport(String reportId) {
        Report cachedReport = reportMap.get(reportId);
        return (Report) cachedReport.clone();
    }

    // This simulates loading data from a database
    public static void loadCache() {
        // Create the Master Sales Report Template
        SalesReport sales = new SalesReport();
        sales.setId("1");
        sales.setContent("TEMPLATE BODY: [Insert Sales Numbers Here]");
        reportMap.put(sales.getId(), sales);

        System.out.println(">> System: Master Templates loaded into Registry.");
    }
}