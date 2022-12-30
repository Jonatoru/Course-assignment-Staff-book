public class Main {
    public static Employee[] employee = new Employee[10];

    public static void getListOfEmployees(){
        System.out.println("Полный список сотрудников:");
        for (int i = 0; i < employee.length; i++) {
            System.out.println(employee[i]);
        }
    }
    public static void getMaxSalary (){
        int maxSalary = Integer.MIN_VALUE;
        for (int i = 0; i < employee.length; i++) {
            if (employee[i].getSalary() > maxSalary) {
                maxSalary = employee[i].getSalary();
            }
        }
        for (int i =0; i < employee.length; i++) {
            if (maxSalary == employee[i].getSalary()) {
                System.out.println("Сотрудник с самой большой зарплатой: " + employee[i]);
            }
        }
    }
    public static void getMinSalary(){
        int minSalary =Integer.MAX_VALUE;
        for (int i = 0; i < employee.length; i++) {
            if (minSalary > employee[i].getSalary()) {
                minSalary = employee[i].getSalary();
            }
        }
        for (int i =0; i < employee.length; i++) {
            if (minSalary == employee[i].getSalary()) {
                System.out.println("Сотрудник с самой маленькой зарплатой: " + employee[i]);
            }
        }
    }
    public static double getSumSalary (){
        double sum = 0;
        for (int i = 0; i < employee.length; i++) {
            sum += employee[i].getSalary();
        }
        return sum;
    }
    public static double getAverageSalary(){
        double sum = 0;
        for (int i = 0; i < employee.length; i++) {
            sum += employee[i].getSalary();
        }
        double averageSalary = sum / employee.length;
        return averageSalary;
    }
    public static void getListOfEmployeesNames(){
        System.out.println("Список ФИО всех сотрудников:");
        for (int i = 0; i < employee.length; i++) {
            System.out.println(employee[i].getSurnames()+" "+employee[i].getName()+" "+employee[i].getMiddleName());
        }
    }
    public static void patchIndexing(int indexing){
        System.out.println("Индексация зарплат всех сотрудников: ");
        for (int i = 0; i < employee.length; i++) {
            int percent= (employee[i].getSalary() * indexing) / 100;
            employee[i].setSalary(employee[i].getSalary() + percent);
            System.out.println(employee[i]);
        }
    }
    public static void getListByDepartment(int numberDepartment){
        System.out.println("Список сотрудников из этого отдела:");
        for (int i = 0; i < employee.length; i++){
            if(numberDepartment == employee[i].getDepartment()){
                System.out.println(employee[i].toStringByDepartment());
            }
        }
    }
    public static int getSumSalaryByDepartment(int numberDepartment){
        int sumByDepartment = 0;
        for (int i = 0; i < employee.length; i++){
            if(numberDepartment == employee[i].getDepartment()){
                sumByDepartment += employee[i].getSalary();
            }
        }
        return sumByDepartment;
    }
    public static void getMinSalaryByDepartment (int numberDepartment){
        int minSalaryByDepartment = Integer.MAX_VALUE;
        for (int i = 0; i < employee.length; i++) {
            if (numberDepartment == employee[i].getDepartment() && minSalaryByDepartment > employee[i].getSalary()) {
                minSalaryByDepartment = employee[i].getSalary();
            }
        }
        for (int i =0; i < employee.length; i++) {
            if (numberDepartment == employee[i].getDepartment() && minSalaryByDepartment == employee[i].getSalary()) {
                System.out.println("Сотрудник с самой маленькой зарплатой: " + employee[i]);
            }
        }
    }
    public static void getMaxSalaryByDepartment (int numberDepartment){
        int maxSalaryByDepartment = Integer.MIN_VALUE;
        for (int i = 0; i < employee.length; i++) {
            if(numberDepartment == employee[i].getDepartment() && employee[i].getSalary() > maxSalaryByDepartment) {
                maxSalaryByDepartment = employee[i].getSalary();
            }
        }
        for (int i = 0; i < employee.length; i++) {
            if (numberDepartment == employee[i].getDepartment() && maxSalaryByDepartment == employee[i].getSalary()) {
                System.out.println("Сотрудник с самой большой зарплатой: " + employee[i]);
            }
        }
    }
    public static double getAverageSalaryByDepartment (int numberDepartment){
        double sumByDepartment = 0;
        double j = 0;
        for (int i = 0; i < employee.length; i++){
            if(numberDepartment == employee[i].getDepartment()){
                sumByDepartment += employee[i].getSalary();
                j++;
            }
        }
        double averageSalaryByDepartment = (sumByDepartment / j);
        return averageSalaryByDepartment;
    }
    public static void patchIndexingByDepartment(int indexing, int numberDepartment){
        System.out.println("Индексация зарплат сотрудников отдела: ");
        for (int i = 0; i < employee.length; i++) {
            if(numberDepartment == employee[i].getDepartment()){
                int percent= (employee[i].getSalary() * indexing) / 100;
                employee[i].setSalary(employee[i].getSalary() + percent);
                System.out.println(employee[i]);
            }
        }
    }
    public static void getMinMaxFromNumber(int number){
        for (int i = 0; i < employee.length; i++) {
            if(number > employee[i].getSalary()) {
                System.out.println("Зарплата меньше числа: " + employee[i].toStringByDepartment());
            }
        }
        for(int i = 0; i < employee.length; i++){
            if (number <= employee[i].getSalary()) {
                System.out.println("Зарплата больше или равна числу: " + employee[i].toStringByDepartment());
            }
        }
    }

    public static void main(String[] args) {
        employee[0] = new Employee("Иван", "Иванов", "Иванович", 1, 15000);
        employee[1] = new Employee("Александр", "Пушкин", "Сергеевич", 1, 20000);
        employee[2] = new Employee("Лев", "Толстой", "Николаевич", 2, 25000);
        employee[3] = new Employee("Антон", "Чехов", "Павлович", 2, 30000);
        employee[4] = new Employee("Николай", "Гоголь", "Васильевич", 3, 35000);
        employee[5] = new Employee("Иван", "Бунин", "Александрович", 3, 40000);
        employee[6] = new Employee("Сергей", "Есенин", "Александрович", 4, 45000);
        employee[7] = new Employee("Алексей", "Пешков", "Максимович", 4, 50000);
        employee[8] = new Employee("Александр", "Островский", "Николаевич", 5, 55000);
        employee[9] = new Employee("Иван", "Тургенев", "Сергеевич", 5, 60000);

        System.out.println("Базовая сложность:");
        System.out.println("");
        getListOfEmployees();
        System.out.println("");
        getMaxSalary();
        System.out.println("");
        getMinSalary();
        System.out.println("");
        System.out.println("Сумма затрат на зарплаты в месяц: " + getSumSalary());
        System.out.println("");
        System.out.println("Среднее значение зарплат на зарплаты в месяц: " + getAverageSalary());
        System.out.println("");
        getListOfEmployeesNames();
        System.out.println("");
        employee[6].setSalary(100000);
        employee[6].setDepartment(5);
        System.out.println("Проверка сеттера " + employee[6].toString());
        System.out.println("");
        System.out.println("Повышенная сложность:");
        System.out.println("");
        getMinSalaryByDepartment(1);
        System.out.println("");
        getMaxSalaryByDepartment(1);
        System.out.println("");
        System.out.println("Сумма затрат на зарплату в месяц по отделу: " + getSumSalaryByDepartment(1));
        System.out.println("");
        System.out.println("Среднее значение запрат в месяц по отделу: " + getAverageSalaryByDepartment(1));
        System.out.println("");
        patchIndexing(10);
        System.out.println("");
        getListByDepartment(1);
        System.out.println("");
        patchIndexingByDepartment(100,1);
        System.out.println("");
        getMinMaxFromNumber(44000);
    }
}