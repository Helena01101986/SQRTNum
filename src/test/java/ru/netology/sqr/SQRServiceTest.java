package ru.netology.sqr;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;


public class SQRServiceTest {

    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/matchers.csv")
    public void shouldFindNumMatchersInRange(int min, int max, int expected) {
        SQRService service = new SQRService();
        int actual = service.calcNumSqr(min, max);
        Assertions.assertEquals(expected, actual);

    }

    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/matchers.csv")
    public void shouldFindNumMatchersInOtherRange(int min, int max, int expected) {
        SQRService service = new SQRService();
        int actual = service.calcNumSqr(min, max);
        Assertions.assertEquals(expected, actual);

    }

    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/matchers.csv")
    public void shouldFindNumMatchersInNextRange(int min, int max, int expected) {
        SQRService service = new SQRService();
        int actual = service.calcNumSqr(min, max);
        Assertions.assertEquals(expected, actual);

    }


}



