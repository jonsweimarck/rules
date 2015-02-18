package se.bitforbit;

public class Rule<T> {

    private String desc;
    private Condition<T> condition;
    private Action action;

    public Rule(String desc, Condition c, Action a) {
        this.desc = desc;
        this.condition = c;
        this.action = a;
    }

    public void applyOn(T objectToApplyRuleOn){
        if(condition.isMetFor(objectToApplyRuleOn)){
            action.executeFor(condition);
        }
    }
}
