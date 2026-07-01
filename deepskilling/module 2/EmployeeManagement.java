class Employee{
    private int employeeId;
    private String name, position; 
    private double salary;

    public Employee(int employeeId, String name, String position, double salary){
        this.employeeId = employeeId;
        this.name = name;
        this.position = position;
        this.salary = salary;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee : employeeId=" + employeeId + ", name=" + name + ", position=" + position + ", salary=" + salary
                + " ";
    }


}
class EmployeeRecord{
    public void addEmployee(int id, String name,  String pos, double sal, int count){
        if(count<e.length){
            Employee e = e.getEmployeeId(count);
            count++;
            e[count].setEmployeeId(e[count].getEmployeeId());
            e[count].setName(e[count].getName());
            e[count].setPosition(e[count].getPosition());
            e[count].setSalary(e[count].getSalary());
        }
            
        else{
            
        }
    }
    public void deleteEmployee(Employee[] e, int count){

    }
    // public int searchEmployee(Employee[] e, int empId){
    //     return id;
    // }
    public void traverseEmployee(Employee[] e, int count){
        for(int i =0; i<count; i++){
            System.out.println(e[i]);
        }
    }
}
public class EmployeeManagement {
    public static void main(String[] args) {
        Employee[] emp = new Employee[7];
        int count =0;
        emp[count++] = new Employee(101, "Alia", "Student Intern", 15000);
        emp[count++] = new Employee(107, "Ria", "SDE1", 75000);
        emp[count++] = new Employee(105, "Rahul", "Cloud intern", 25000);
        emp[count++] = new Employee(103, "Santosh", "Product Manager", 60000);
        emp[count++] = new Employee(109, "Ruchi", "Associate developer", 40000);
        emp[count++] = new Employee(102, "Rohan", "Manager", 80000);


        EmployeeRecord er = new EmployeeRecord();
        er.traverseEmployee(emp, count);

        er.addEmployee(emp, count);

    }
}
