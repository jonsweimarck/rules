package se.bitforbit;

public enum RuleCode {
    StringMaxLength(1, "Strängar måste vara max 6 tecken");

    private Integer id;
    private String desc;
    RuleCode(Integer id, String desc){
        this.id = id;
        this.desc = desc;
    }

    public String getDesc(){
        return desc;
    }
}
