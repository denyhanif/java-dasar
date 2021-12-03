package enumClass;

public enum Level {
    //best practice dengan hrn kapital

    STANDARD("ini member standr"),
    PREMIUM("ini member premium"),
    VIP("ini member  vvip");

    //tambah desc ke tiap enum,
    private String desc;

    Level (String desc){
        this.desc = desc;
    }
    public String getDesc(){
        return desc;
    }
}
