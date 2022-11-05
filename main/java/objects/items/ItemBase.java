package objects.items;

import init.ItemInit;
import main.Main;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import util.ClientProxy;
import util.Model;

public class ItemBase extends Item implements Model {
    public ItemBase(String name){
        setUnlocalizedName(name);
        setRegistryName(name);
        setCreativeTab(CreativeTabs.MISC);

        ItemInit.ITEMS.add(this);

    }

    public void registerModels(){
        Main.proxy.registerItemRenderer(this, 0, "inventory");

    }
}
