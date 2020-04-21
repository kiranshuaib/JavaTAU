package chapter9;

import java.nio.file.WatchEvent;

public class WeddingCake extends Cake {
    private int tier;

    public WeddingCake(){
        super("almond");
    }
    public int getTier() {
        return tier;
    }

    public void setTier(int tier) {
        this.tier = tier;
    }



}
