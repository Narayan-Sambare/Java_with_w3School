package college.model;

public class Department {
    private int deptId;
    private String deptName;
    private String hodName;

    public Department(int deptId, String deptName, String hodName) {
        this.deptId = deptId;
        this.deptName = deptName;
        this.hodName = hodName;
    }

    public int getDeptId() { return deptId; }
    public void setDeptId(int deptId) { this.deptId = deptId; }

    public String getDeptName() { return deptName; }
    public void setDeptName(String deptName) { this.deptName = deptName; }

    public String getHodName() { return hodName; }
    public void setHodName(String hodName) { this.hodName = hodName; }

    public void displayInfo() {
        System.out.println("Department ID: " + deptId);
        System.out.println("Department Name: " + deptName);
        System.out.println("HOD: " + hodName);
    }
}
