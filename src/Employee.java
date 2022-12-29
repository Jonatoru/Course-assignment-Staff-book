public class Employee {
    private String name;
    private String surnames;
    private String middleName;
    private int department;
    private int salary;
    private static int id = 0;
    private final int currentId;
    public Employee (String name, String surnames, String middleName, int department, int salary){
        this.name = name;
        this.surnames = surnames;
        this.middleName = middleName;
        this.department = department;
        this.salary = salary;
        id++;
        this.currentId = getId();
    }
    public String getName(){
        return this.name;
    }
    public String getSurnames(){
        return this.surnames;
    }
    public String getMiddleName(){
        return  this.middleName;
    }
    public int getDepartment(){
        return this.department;
    }
    public int getSalary(){
        return this.salary;
    }
    public static int getId(){
        return id;
    }
    public void setDepartment(int department){
        this.department = department;
    }
    public void setSalary(int salary){
        this.salary = salary;
    }
    public int getCurrentId(){
        return currentId;
    }
    @Override
    public String toString() {
        return "Id сотрудника: "+getCurrentId()+". ФИО сотрудника: "+ getSurnames() +" "+ getName() +" "+ getMiddleName() + ". Отдел: " + getDepartment() +". Зарплата: " + getSalary() +".";
    }
    public String toStringByDepartment() {
        return "Id сотрудника: "+getCurrentId()+". ФИО сотрудника: "+ getSurnames() +" "+ getName() +" "+ getMiddleName() + ". Зарплата: " + getSalary() +".";
    }
}