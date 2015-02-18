package se.bitforbit;

public class Rule<T> {

    private RuleCode ruleCode;
    private String desc;
    private Condition<T> condition;
    private Action<T> action;

    public Rule(RuleCode ruleCode, Condition condition, Action actionIfConditionNotMet) {
        this.ruleCode = ruleCode;
        this.condition = condition;
        this.action = actionIfConditionNotMet;
    }

    public void applyOn(T objectToApplyRuleOn){
        if(condition.isNotMetFor(objectToApplyRuleOn)){
            action.executeFor(ruleCode, objectToApplyRuleOn);
        }
    }
}
