/**
 * This file is part of G3N0's mod compendium
 * 
 * G3N0's mod compendium is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 * 
 * G3N0's mod compendium is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABLILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public License
 * along with G3N0's mod compendium. If not, see <http://www.gnu.org/licenses/>.
 */

package geno;

import geno.world.biome.BiomeGenSkeletonCoast;
import net.minecraft.world.biome.BiomeGenBase;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.Init;
import cpw.mods.fml.common.Mod.PostInit;
import cpw.mods.fml.common.Mod.PreInit;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;

@Mod(modid = "GMC", name = "G3N0's Mod Compendium", version = "0.0.1")
public class G3N0Core
{
    public static G3N0Core instance;
    
    public static final BiomeGenBase BIOME_SKELETON_COAST = (new BiomeGenSkeletonCoast(33)).setBiomeName("Skeleton Coast").setMinMaxHeight(0.1f, 0.1f);

    @PreInit
    public void preInit(FMLPreInitializationEvent event)
    {
        GameRegistry.addBiome(BIOME_SKELETON_COAST);
    }
    
    @Init
    public void init(FMLInitializationEvent event)
    {
        
    }
    
    @PostInit
    public void postInit(FMLPostInitializationEvent event)
    {
        
    }
}
