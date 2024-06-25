public class EmployeeWage {
    public static void main(String[] args) {
        System.out.println("Welcome TO Employee Wage");
        int num = 1;
        double wage = 20;
        final int FULL_TIME = 8;
        if(num == 1 ) {
            double totalwage = wage * FULL_TIME;
            System.out.println(totalwage);
        }
        else{
            System.out.println("Emplouyee Absent");
        }
    }
}
