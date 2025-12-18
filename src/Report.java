// Ideally, put this in a package if you know how, otherwise default package is fine for a simple exam.
// This abstract class defines the structure of all reports.
// It implements Cloneable to allow copying.

public abstract class Report implements Cloneable {
    private String id;
    protected String type;
    protected String content;

    // Abstract method to be implemented by specific reports
    abstract void generateHeader();

    // Getters and Setters (Clean Code Practice)
    public String getType() { return type; }
    
    public String getId() { return id; }
    public void setId(String id) { this.id = id; }
    
    public String getContent() { return content; }
    public void setContent(String content) { this.content = content; }

    // THE PROTOTYPE PATTERN LOGIC
    // This method creates a copy of the object
    public Object clone() {
        Object clone = null;
        try {
            clone = super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return clone;
    }
}