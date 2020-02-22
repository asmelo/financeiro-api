package com.asmelo.financeiroapi.model;

import java.math.BigDecimal;
import java.time.Instant;

public class Entry {

    private Instant date;
    private BigDecimal value;
    private String description;

    public Entry(Instant date, BigDecimal value, String description) {
        this.date = date;
        this.value = value;
        this.description = description;
    }

    public Instant getDate() {
        return date;
    }

    public BigDecimal getValue() {
        return value;
    }

    public String getDescription() {
        return description;
    }
}
