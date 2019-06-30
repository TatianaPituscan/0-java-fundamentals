package junior.contactlist.model;

public class Colleague extends Contact {

    private String department;
    private String company;

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    @Override
    public String toString() {
        return "Colleague{" +
                "department='" + department + '\'' +
                ", company='" + company + '\'' +
                "} " + super.toString();
    }
}
