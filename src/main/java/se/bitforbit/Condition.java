package se.bitforbit;

public interface Condition <T> {
    boolean isMetFor(T objectToCheck);

    String getDesc();
}
