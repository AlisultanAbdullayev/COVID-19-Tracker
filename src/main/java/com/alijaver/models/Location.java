package com.alijaver.models;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Getter
@Setter
public class Location {

    private String state, country;
    private int latestTotalCases;
    private int delta;

    @Override
    public String toString() {
        return "Location{" +
                "state='" + state + '\'' +
                ", country='" + country + '\'' +
                ", latestTotalCases=" + latestTotalCases +
                ", delta=" + delta +
                '}';
    }
}
