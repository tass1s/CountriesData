import org.junit.Before;
import org.junit.Test;
import Services.CountryAPIService;
import test.CountryApi;
import Model.CountryInfo;
import Exception.CountriesAPIException;
import java.util.List;

public class CountryApiTest {

    private CountryApi countryApi;

    @Before
    public void setUp() {
        countryApi = new CountryApi();
    }

    @Test
    public void testGetCountryByName() {
        try {
            CountryInfo country = countryApi.getCountryByName("Greece");
            System.out.println(country);
        } catch (CountriesAPIException e) {
            e.printStackTrace();
        }
    }

   
}
