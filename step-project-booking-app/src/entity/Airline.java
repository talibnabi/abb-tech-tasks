package entity;

import static util.OptionalUtil.CONTINENTAL_AIRLINES_IATACode;
import static util.OptionalUtil.CARGO_ITALIA_IATACode;
import static util.OptionalUtil.DELTA_AIR_LINES_IATACode;
import static util.OptionalUtil.AMERICAN_AIRLINES_IATACode;
import static util.OptionalUtil.NORTHWEST_AIRLINES_IATACode;
import static util.OptionalUtil.FEDEX_IATACode;

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
