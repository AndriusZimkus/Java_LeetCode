import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class LC1491_AverageSalaryExclMinMaxTest {

    LC1491_AverageSalaryExclMinMax lc1491_averageSalaryExclMinMax = new LC1491_AverageSalaryExclMinMax();

    @Test
    void average1() {
        int[] salary = {4000, 3000, 1000, 2000};
        double expected = 2500;
        double actual = lc1491_averageSalaryExclMinMax.average(salary);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void average2() {
        int[] salary = {1000, 2000, 3000};
        double expected = 2000;
        double actual = lc1491_averageSalaryExclMinMax.average(salary);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void average3() {
        int[] salary = {48000, 59000, 99000, 13000, 78000, 45000, 31000, 17000, 39000, 37000, 93000, 77000, 33000, 28000, 4000, 54000, 67000, 6000, 1000, 11000};
        double expected = 41111.11111111111;
        double actual = lc1491_averageSalaryExclMinMax.average(salary);

        Assertions.assertEquals(expected, actual);
    }
}
