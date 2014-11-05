import org.junit.*;
import static org.junit.Assert.*;

public class PersonTest {
    
    @Test
    public void testsNormalName() {
        Person first = new Person();
        String input = "Dereck Robert Yssirt";
        String output = first.getInitials(input);
        String expected = "DRY";
        assertEquals(output, expected);
        
        Person second = new Person();
        String input = "Roger      Smith           Johnson";
        System.out.println(input);
        String output = second.getInitials(input);
        System.out.println(output);
        String expected = "RSJ";
        assertEquals(output, expected);
    }
    
    
    @Test
    public void testWhiteSpaceName() {
        Person third = new Person();
        String input = "I  J  W";
        System.out.println(input);
        String output = third.getInitials(input);
        System.out.println(output);
        String expected = "IJW";
        assertEquals(output, expected);
    }
}