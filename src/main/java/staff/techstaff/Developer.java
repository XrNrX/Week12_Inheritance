package staff.techstaff;

import staff.Employee;

public class Developer extends Employee {


    public Developer(String name, String niNumber, int salary) {
        super(name, niNumber, salary);
    }

    public int payBonus(){
        return this.salary / 100;
    }



}
