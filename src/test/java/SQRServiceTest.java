



public class SQRServiceTest {

    @ParameterizedTest
    @CsvSource({
            "200,300,3",
            "400,200,-1",
            "0,10000,90",
            "99,101,1",
            "10,20,0"
    })
    public void everythingIsGoodTest(int minValue, int maxValue, int expected){
        SQRService service = new SQRService();

        int actual = service.sqrCount(minValue, maxValue);

        Assertions.assertEquals(actual, expected);

    }

}