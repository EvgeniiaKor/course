package entity;

import jakarta.persistence.*;
import lombok.*;

@ToString
@Entity
@Getter
@Setter
@NonNull

public class Mountain {

    @Column(unique = true)
    private String mName;
    private String country;
    private int high;

    public Mountain(String mName, String country, int high) {
        setMName(mName);
        setCountry(country);
        setHigh(high);
    }
}
