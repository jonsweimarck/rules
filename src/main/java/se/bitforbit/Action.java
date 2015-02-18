package se.bitforbit;

public interface Action <T>{
    void executeFor(RuleCode ruleCode, T objectThatConditionsWhereNotMet);
    String getDesc();

}
