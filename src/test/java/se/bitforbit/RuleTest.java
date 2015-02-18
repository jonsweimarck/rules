package se.bitforbit;

import org.junit.Test;

public class RuleTest {

    @Test
    public void sdfs(){

        String objectToCheck = "aString";



        Action a = new Action(){

            @Override
            public void execute() {

            }

            @Override
            public String getDesc() {
                return null;
            }
        };

        Rule r = new Rule("desc", c, a);

    }
    
    public class MaxStringLengthCondition implements Condition<String> {

        int maxLength;

        public MaxStringLengthCondition(int maxLength){
          this.maxLength = maxLength;
        }

        @Override
        public boolean isMetFor(String objectToCheck) {
            return objectToCheck != null && objectToCheck.length() <= maxLength;
        }

        @Override
        public String getDesc() {
            return "Validerar att strängen  är maximalt " + maxLength + " tecken lång";
        }
    }

}
