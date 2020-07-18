package jp.tdn.gunner.init;

import com.google.common.collect.Lists;
import jp.tdn.gunner.Gunner;
import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

import javax.annotation.Nonnull;
import java.util.List;

@Mod.EventBusSubscriber(modid = Gunner.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModItems {
    private static final String modId = Gunner.MOD_ID;
    public static final List<Item> itemList = Lists.newArrayList();



    public static Item register(@Nonnull Item item, @Nonnull String name){
        item.setRegistryName(modId, name);
        itemList.add(item);
        return item;
    }

    @SubscribeEvent
    public static void registerItems(RegistryEvent.Register<Item> event){
        Gunner.LOGGER.info("Register items...");
        for(Item item : itemList){
            Gunner.LOGGER.info(item.getRegistryName());
            event.getRegistry().register(item);
        }
    }
}
