package model.enumeration;


import static util.OptionalUtil.*;

public enum Airline {
    AMERICAN_AIRLINES(AMERICAN_AIRLINES_IATACode),
    CARGO_ITALIA(CARGO_ITALIA_IATACode),
    CONTINENTAL_AIRLINES(CONTINENTAL_AIRLINES_IATACode),
    DELTA_AIR_LINES(DELTA_AIR_LINES_IATACode),
    NORTHWEST_AIRLINES(NORTHWEST_AIRLINES_IATACode),
    FEDEX(FEDEX_IATACode);
    private final String IATACode;

    Airline(String IATACode) {
        this.IATACode = IATACode;
    }

    public String getIATACode() {
        return IATACode;
    }

}
