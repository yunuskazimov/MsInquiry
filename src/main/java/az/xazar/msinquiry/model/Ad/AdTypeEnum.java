package az.xazar.msinquiry.model.Ad;

import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Locale;

public enum AdTypeEnum {
    SHARE, ACCEPT, DECLINE;

    @JsonValue
    public String toLower() {
        return this.toString().toLowerCase(Locale.ENGLISH);
    }
}
