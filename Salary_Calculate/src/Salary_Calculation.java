
public class Salary_Calculation {
    public static void main(String[] args) {
        // ayhan ve emre nin bonusu yok --> sarti 40 saatten fazla calismak
        Employee employee = new Employee("Ayhan Kara", 8500, 36, 2015);
        employee.toString();

        Employee employe2 = new Employee("Poyraz Sari", 2000, 45, 1985); // hw example --> 2390
        employe2.toString();

        Employee employe3 = new Employee("Emre Ekinci", 16000, 29, 2010);
        employe3.toString();

        Employee employe4 = new Employee("Kaya Mavi", 18600, 45, 2022); // hireyear error
        employe4.toString();    // for invalid input value

    }
}