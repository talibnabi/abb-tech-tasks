package enumeration.concretes.flight;


import static util.EntityUtil.*;

public enum Airport {

    BATNA_AIRPORT(BATNA_AIRPORT_COUNTRY, BATNA_AIRPORT_LOCATION, BATNA_AIRPORT_IATACode),
    ASSIUT_AIRPORT(ASSIUT_AIRPORT_COUNTRY, ASSIUT_AIRPORT_LOCATION, ASSIUT_AIRPORT_IATACode),
    GARDERMOEN(GARDERMOEN_COUNTRY, GARDERMOEN_LOCATION, GARDERMOEN_IATACode),
    VISBY_AIRPORT(VISBY_AIRPORT_COUNTRY, VISBY_AIRPORT_LOCATION, VISBY_AIRPORT_IATACode),
    VILNIUS_AIRPORT(VILNIUS_AIRPORT_COUNTRY, VILNIUS_AIRPORT_LOCATION, VILNIUS_AIRPORT_IATACode),
    RIGA(RIGA_COUNTRY, RIGA_LOCATION, RIGA_IATACode);

    private final String airportCountry;
    private final String airportLocation;
    private final String IATACode;

    Airport(String airportCountry, String airportLocation, String IATACode) {
        this.airportCountry = airportCountry;
        this.airportLocation = airportLocation;
        this.IATACode = IATACode;
    }

    public String getAirportCountry() {
        return airportCountry;
    }

    public String getAirportLocation() {
        return airportLocation;
    }


    public String getIATACode() {
        return IATACode;
    }
}
