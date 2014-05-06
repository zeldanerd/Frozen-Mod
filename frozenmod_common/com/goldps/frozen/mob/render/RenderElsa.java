package com.goldps.frozen.mob.render;

import com.goldps.frozen.reference.ResourceLocs;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;

public class RenderElsa extends RenderLiving {

	public RenderElsa(ModelBase par1ModelBase, float par2) {
		super(par1ModelBase, par2);
		
	}

	@Override
	protected ResourceLocation getEntityTexture(Entity var1) {
		return ResourceLocs.LOC_TEXTURE_ELSA;
	}
	
}