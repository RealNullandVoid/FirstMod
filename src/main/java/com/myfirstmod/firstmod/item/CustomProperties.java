package com.myfirstmod.firstmod.item;

import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;

public class CustomProperties extends Item {

	public CustomProperties(Properties prop) {
		
		super(prop);
		
	}
		@Override
		public InteractionResultHolder<ItemStack> use(Level world, Player player, InteractionHand hand) {
			if (!world.isClientSide()) {
				
				System.out.println(player.getName().getString() + " has used item in hand " + hand.name());
				
			}
			return super.use(world, player, hand);
		}
}
