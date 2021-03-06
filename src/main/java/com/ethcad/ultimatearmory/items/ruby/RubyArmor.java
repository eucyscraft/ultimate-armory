package com.ethcad.ultimatearmory.items.ruby;

import com.ethcad.ultimatearmory.Reference;

import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.util.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class RubyArmor extends ItemArmor {
	public RubyArmor(ArmorMaterial material, int renderIndex, int armorType, String name) {
		super(material, renderIndex, armorType);
		GameRegistry.registerItem(this, name);
		setUnlocalizedName(Reference.MODID + "_" + name);
		setCreativeTab(CreativeTabs.tabCombat);
	}
	
	@SideOnly(Side.CLIENT)
	@Override
	public String getArmorTexture(ItemStack stack, Entity e, int slot, String layer) {
		return Reference.MODID + ":textures/models/armor/armorRuby_layer_" + (slot == 2 ? 2 : 1) + ".png";
	}
}