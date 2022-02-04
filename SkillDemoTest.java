import static org.junit.Assert.*;
import org.junit.*;

public class SkillDemoTest {
    @Test
    public void getDate() {
        // create failed test
        assertEquals("Today's date is 02/02/2022", SkillDemo.getDate("02/02/2021"));
    }
}
