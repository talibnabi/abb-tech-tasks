package enumeration.concretes.flight;


import static util.EntityUtil.*;

public enum Airline {
    AMERICAN_AIRLINES(AMERICAN_AIRLINES_IATACode, AMERICAN_AIRLINES_NAME),
    CARGO_ITALIA(CARGO_ITALIA_IATACode, CARGO_ITALIA_NAME),
    CONTINENTAL_AIRLINES(CONTINENTAL_AIRLINES_IATACode, CONTINENTAL_AIRLINES_NAME),
    DELTA_AIR_LINES(DELTA_AIR_LINES_IATACode, DELTA_AIR_LINES_NAME),
    NORTHWEST_AIRLINES(NORTHWEST_AIRLINES_IATACode, NORTHWEST_AIRLINES_NAME),
    FEDEX(FEDEX_IATACode, FEDEX_NAME);
    private final String IATACode;
    private final String airlineName;


    Airline(String IATACode, String airlineName) {
        this.IATACode = IATACode;
        this.airlineName = airlineName;
    }

    public String getIATACode() {
        return IATACode;
    }

    public String getAirlineName() {
        return airlineName;
    }
}
