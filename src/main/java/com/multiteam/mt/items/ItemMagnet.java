package com.multiteam.mt.items;

import com.multiteam.mt.Reference;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class ItemMagnet extends Item {

    public ItemMagnet() {
        setRegistryName("magnet");
        setUnlocalizedName(Reference.MOD_ID + ".magnet");   // Used for lang files (en_US.lang)
    }
    @SideOnly(Side.CLIENT)
    public void initModel() {
        ModelLoader.setCustomModelResourceLocation(this, 0, new ModelResourceLocation(getRegistryName(), "inventory"));
    }
}
