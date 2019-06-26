package rocks.zipcode.io.quiz3.collections;

/**
 * @author leon on 10/12/2018.
 */
public class Lab {
    private String labName;
    private LabStatus stat;

    public Lab() {
        this(null);
    }

    public Lab(String labName) {
        this.labName=labName;

    }

    public String getName() {

        return labName;
    }

    public void setStatus(LabStatus labStatus) {
        this.stat=labStatus;
    }

    public LabStatus getStatus() {

        return stat;
    }
}
