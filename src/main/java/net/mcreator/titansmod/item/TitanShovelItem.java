
package net.mcreator.titansmod.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.ShovelItem;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;

import net.mcreator.titansmod.itemgroup.TitanmodItemGroup;
import net.mcreator.titansmod.TitansModModElements;

@TitansModModElements.ModElement.Tag
public class TitanShovelItem extends TitansModModElements.ModElement {
	@ObjectHolder("titans_mod:titan_shovel")
	public static final Item block = null;
	public TitanShovelItem(TitansModModElements instance) {
		super(instance, 10);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ShovelItem(new IItemTier() {
			public int getMaxUses() {
				return 902;
			}

			public float getEfficiency() {
				return 7f;
			}

			public float getAttackDamage() {
				return 3f;
			}

			public int getHarvestLevel() {
				return 3;
			}

			public int getEnchantability() {
				return 35;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.fromStacks(new ItemStack(TitanIngotItem.block));
			}
		}, 1, -3f, new Item.Properties().group(TitanmodItemGroup.tab)) {
		}.setRegistryName("titan_shovel"));
	}
}
