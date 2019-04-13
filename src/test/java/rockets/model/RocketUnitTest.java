package rockets.model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

public class RocketUnitTest {
    private Rocket target;
    String name="test";
    String country="test";
    String manufactuer="test";
    @BeforeEach
    public void setUp() {
        target = new Rocket(name, country, manufactuer);
    }

    @DisplayName("should throw exception when null is passed to setMassToLEO function")
    @Test
    public void shouldThrowExceptionWhenSetMassToLEOToNull() {
        NullPointerException exception = assertThrows(NullPointerException.class, () -> target.setMassToLEO(null));
        assertEquals("massToLEO cannot be null or empty", exception.getMessage());
    }

    @DisplayName("should throw exception when null is passed to setMassToGTO function")
    @Test
    public void shouldThrowExceptionWhenSetMassToGTOToNull() {
        NullPointerException exception = assertThrows(NullPointerException.class, () -> target.setMassToGTO(null));
        assertEquals("massToGTO cannot be null or empty", exception.getMessage());
    }

    @DisplayName("should throw exception when null is passed to setMassToOther function")
    @Test
    public void shouldThrowExceptionWhenSetMassToOtherToNull() {
        NullPointerException exception = assertThrows(NullPointerException.class, () -> target.setMassToOther(null));
        assertEquals("massToOther cannot be null or empty", exception.getMessage());
    }

    @DisplayName("should return true when two rockets have the same details")
    @Test
    public void shouldReturnTrueWhenUsersHaveSameDetails() {
        Rocket anotherRocket = new Rocket("test","test","test");
        assertTrue(target.equals(anotherRocket));
    }

    @DisplayName("should return false when two rockets have the different details")
    @Test
    public void shouldReturnTrueWhenUsersHaveDifferentDetails() {
        Rocket anotherRocket = new Rocket("test","test","test1");
        assertFalse(target.equals(anotherRocket));
    }
}
