package se.bitforbit;

public interface Condition <T> {
    boolean isNotMetFor(T objectToCheck);

    String getDesc();
}
