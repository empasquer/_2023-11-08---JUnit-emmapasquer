import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CatTest {
    Cat c;

    @BeforeEach
    void setUp() {
        c = new Cat("Sika", 'F', 3.1);
    }

    @Test
    void getName() {
        // Must NOT be null and must NOT be empty
        assertNotNull(c);
        assertFalse(c.getName().isEmpty());
    }

    @Test
    void getGender() {
        // Must be either 'M' or 'F'
        String formatChar = String.valueOf(c.getGender()).toUpperCase();
        char formattedChar = formatChar.charAt(0);

        assertTrue(formattedChar == 'M' || formattedChar == 'F');
    }

    @Test
    void getWeightInKg() {
        // Must be greater than zero AND lower than or equal to 10
        assertTrue(c.getWeightInKg() > 0 && c.getWeightInKg() <=10);
    }
}