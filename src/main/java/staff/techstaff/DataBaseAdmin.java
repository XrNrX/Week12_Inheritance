package staff.techstaff;

import staff.Employee;

public class DataBaseAdmin extends Employee {


    public DataBaseAdmin(String name, String niNumber, int salary) {
        super(name, niNumber, salary);
    }

    public int payBonus(){
        return this.salary / 100;
    }
}
