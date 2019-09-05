package pl.martajastrzabek.sumsquaredifference.service;


import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SumSquareDifferenceServiceTest {

    SumSquareDifferenceService underTest;
    
    @BeforeEach
    void setUp() {
        underTest = new SumSquareDifferenceService();
    }

    @Test
    void whenLimitIsTen_sumOfSquaresShouldBe385() {
        //given
        int limit = 10;
        int expectedResult = 385;

        //when
        int result = underTest.sumSquaresOfNumbers(limit);

        //then
        Assertions.assertThat(result).isEqualTo(expectedResult);
    }

    @Test
    void whenLimitIsTen_squareOfSumShouldBe3025() {
        //given
        int limit = 10;
        int expectedResult = 3025;

        //when
        int result = underTest.squareOfNumbersSum(limit);

        //then
        Assertions.assertThat(result).isEqualTo(expectedResult);
    }

    @Test
    void whenLimitIsTen_differenceShouldBe2640() {
        //given
        int limit = 10;
        int expectedResult = 2640;

        //when
        int result = underTest.calculateDifference(limit);

        //then
        Assertions.assertThat(result).isEqualTo(expectedResult);
    }
}