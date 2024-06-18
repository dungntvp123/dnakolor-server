package com.dnakolor.account.common;

public enum Package {
    MONTH1(1L*30*24*60*60*1000),
    MONTH6(6L*30*24*60*60*1000),
    YEAR1(12L*30*24*60*60*1000)
    ;
    public final long time;
    Package(long time) {
        this.time = time;
    }
}
