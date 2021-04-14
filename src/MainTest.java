import org.junit.Test;
import org.junit.jupiter.api.DisplayName;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static junit.framework.TestCase.assertEquals;

@RunWith( Parameterized.class)
public class MainTest {
    private int day;
    private int month;
    private int year;
    private String expected;

    public MainTest(int day, int month, int year, String expected) {
        this.day = day;
        this.month = month;
        this.year = year;
        this.expected = expected;
    }
    @Parameterized.Parameters
    public static Collection<Object[]> getAllCollection() {
        return Arrays.asList(new Object[][] {
                { 1, 1, 2018, "2/1/2018"},
                {31, 1, 2018, "1/2/2018"},
                {30, 4, 2018, "1/5/2018"},
                {28, 2, 2018, "1/3/2018"},
                {29, 2, 2020, "1/3/2020"},
                {31, 12, 2018, "1/1/2019"}

        });
    }

    @Test
    @DisplayName("case test")
    public void checkAllCaculator(){
//        Assert.assertEquals(this.expectedS,Main.nextDayCaculator(this.day, this.month, this.year));
//        assertEquals(this.expectedS,Main.nextDayCaculator(this.day,this.month,this.year));
//        String a = Main.nextDayCaculator(29,2,2020);
//        assertEquals("1/3/2020",a);
        // this is meejt moi
        assertEquals(this.expected,Main.nextDayCaculator(this.day,this.month,this.year));

    }



}
