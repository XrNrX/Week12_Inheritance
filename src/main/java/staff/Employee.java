package staff;


public abstract class Employee {

    String name;
    String niNumber;
    public int salary;

    public Employee(String name, String niNumber, int salary){
        this.name = name;
        this.niNumber = niNumber;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public String getNiNumber() {
        return niNumber;
    }

    public int getSalary() {
        return salary;
    }

    public double raiseSalary(){
//        if(this.payBonus() > 0) {
            return this.salary += this.payBonus();
//        }
    }


    public void setName(String name) {
        if(name !=null){
            this.name = name;
        }
    }

    public abstract int payBonus();


}
