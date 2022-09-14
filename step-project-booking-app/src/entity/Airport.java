package entity;

public enum Airport {

    BATNA_AIRPORT("Algeria", "Batna", "BLJ"),
    ASSIUT_AIRPORT("Egypt", "Asyut", "ATZ"),
    GARDERMOEN("Norway", "Oslo", "OSL"),
    VISBY_AIRPORT("Sweden", "Visby", "VBY"),
    VILNIUS_AIRPORT("Lithuania", "Vilnius", "VNO"),
    RIGA("Latvia", "Riga", "RIX");


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
