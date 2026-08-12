public class SalaryCalculator {
    private static double base_salary = 1000.00;
    private static double max_salary = 2000.00;
    public double salaryMultiplier(int daysSkipped) {
        return daysSkipped>=5 ? 0.85 : 1;
    }
    public int bonusMultiplier(int productsSold) {
        return productsSold >= 20 ? 13 : 10;
    }
    public double bonusForProductsSold(int productsSold) {
        return bonusMultiplier(productsSold) * productsSold;
    }
    public double finalSalary(int daysSkipped, int productsSold) {
        double finalSalary = base_salary * salaryMultiplier(daysSkipped) + bonusForProductsSold(productsSold);
        return finalSalary < max_salary ? finalSalary : max_salary;
    } 
}
