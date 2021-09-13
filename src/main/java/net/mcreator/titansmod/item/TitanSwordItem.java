
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
public class TitanSwordItem extends TitansModModElements.ModElement {
	@ObjectHolder("titans_mod:titan_sword")
	public static final Item block = null;
	public TitanSwordItem(TitansModModElements instance) {
		super(instance, 9);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new SwordItem(new IItemTier() {
			public int getMaxUses() {
				return 902;
			}

			public float getEfficiency() {
				return 7f;
			}

			public float getAttackDamage() {
				return 8f;
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
		}, 3, -2f, new Item.Properties().group(TitanmodItemGroup.tab)) {
		}.setRegistryName("titan_sword"));
	}
}
