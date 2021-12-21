package az.xazar.msinquiry.model;

import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Locale;

public enum DayOffStatus {
    APPROVED, DECLINED, WAITING;

    @JsonValue
    public String toLower() {
        return this.toString().toLowerCase(Locale.ENGLISH);
    }
}
