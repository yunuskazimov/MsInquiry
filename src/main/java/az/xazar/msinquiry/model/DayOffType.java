package az.xazar.msinquiry.model;

import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Locale;

public enum DayOffType {
    FULL_DAY, CUSTOM;

    @JsonValue
    public String toLower() {
        return this.toString().toLowerCase(Locale.ENGLISH);
    }
}
