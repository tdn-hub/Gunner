package jp.tdn.gunner.items;

import net.minecraft.item.BowItem;
import net.minecraft.item.Item;

public class GunItem extends BowItem {
    public static String IS_RELOAD_TAG = "isReload";

    protected int fireRate;
    protected int maxAmmo;
    protected float baseDamage;
    protected float reloadTime;

    public GunItem(Properties properties, int fireRate, int maxAmmo, int baseDamage, int reloadTime){
        super(properties);
        this.fireRate = fireRate;
        this.maxAmmo = maxAmmo;
        this.baseDamage = baseDamage;
        this.reloadTime = reloadTime;
    }


}
