public class LC1491_AverageSalaryExclMinMax {
    public double average(int[] salary) {

        int min = salary[0];
        int max = salary[0];
        int sum = 0;

        for (int currentSalary : salary) {
            min = Math.min(currentSalary, min);
            max = Math.max(currentSalary, max);
            sum += currentSalary;
        }

        double average = (sum - min - max) / (double) (salary.length - 2);
        return average;
    }
}
