package com.doraro.cosmocraft.init;

import com.doraro.cosmocraft.Reference.Reference;
import com.doraro.cosmocraft.items.ItemCopperIngot;
import com.doraro.cosmocraft.items.ItemCosmoCraft;
import com.doraro.cosmocraft.items.ItemLeadIngot;
import com.doraro.cosmocraft.items.ItemNames;
import com.doraro.cosmocraft.items.ItemWrench;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.Item;

@GameRegistry.ObjectHolder(Reference.Mod_ID)
public class ModItems {
	
	public static final ItemCosmoCraft wrench = new ItemWrench();
	public static final ItemCosmoCraft copperinogt = new ItemCopperIngot();
	public static final ItemCosmoCraft leadinogt = new ItemLeadIngot();
	
	//Register Items
	public static void init() {
		GameRegistry.registerItem(wrench, ItemNames.ItemNameWrench);
		GameRegistry.registerItem(copperinogt, ItemNames.ItemNameCopperIngot);
		GameRegistry.registerItem(leadinogt, ItemNames.ItemNameLeadIngot);
	}
}

