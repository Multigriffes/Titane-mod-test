
package net.mcreator.titansmod.itemgroup;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;

import net.mcreator.titansmod.item.TitanIngotItem;
import net.mcreator.titansmod.TitansModModElements;

@TitansModModElements.ModElement.Tag
public class TitanmodItemGroup extends TitansModModElements.ModElement {
	public TitanmodItemGroup(TitansModModElements instance) {
		super(instance, 75);
	}

	@Override
	public void initElements() {
		tab = new ItemGroup("tabtitanmod") {
			@OnlyIn(Dist.CLIENT)
			@Override
			public ItemStack createIcon() {
				return new ItemStack(TitanIngotItem.block);
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return true;
			}
		}.setBackgroundImageName("item_search.png");
	}
	public static ItemGroup tab;
}
