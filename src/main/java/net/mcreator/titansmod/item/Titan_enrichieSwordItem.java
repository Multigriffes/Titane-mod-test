
package net.mcreator.titansmod.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;

import net.mcreator.titansmod.itemgroup.TitanmodItemGroup;
import net.mcreator.titansmod.TitansModModElements;

@TitansModModElements.ModElement.Tag
public class Titan_enrichieSwordItem extends TitansModModElements.ModElement {
	@ObjectHolder("titans_mod:titan_enrichie_sword")
	public static final Item block = null;
	public Titan_enrichieSwordItem(TitansModModElements instance) {
		super(instance, 61);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new SwordItem(new IItemTier() {
			public int getMaxUses() {
				return 2380;
			}

			public float getEfficiency() {
				return 20f;
			}

			public float getAttackDamage() {
				return 48f;
			}

			public int getHarvestLevel() {
				return 10;
			}

			public int getEnchantability() {
				return 70;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.fromStacks(new ItemStack(Titan_enrichieIngotItem.block));
			}
		}, 3, -3f, new Item.Properties().group(TitanmodItemGroup.tab)) {
		}.setRegistryName("titan_enrichie_sword"));
	}
}
