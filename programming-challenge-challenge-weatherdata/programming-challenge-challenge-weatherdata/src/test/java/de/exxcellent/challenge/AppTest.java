package de.exxcellent.challenge;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Example JUnit4 test case.
 * @author Benjamin Schmid <benjamin.schmid@exxcellent.de>
 */
public class AppTest {

    private String successLabel = "not successful";

    @Test
    public void checkDifferenceForNegativeValuesTest() {
   
    }

    @Test
    public void aPointlessTest() {
        Assert.assertEquals("Expectations met", "successful", successLabel);
    }

}