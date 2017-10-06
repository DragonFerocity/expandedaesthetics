package com.DragonFerocity.expanded.world;

import com.DragonFerocity.expanded.ExpandedAesthetics;
import net.minecraft.init.Biomes;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.DimensionType;
import net.minecraft.world.WorldProvider;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.BiomeProviderSingle;
import net.minecraft.world.gen.IChunkGenerator;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class WorldProviderArctic extends WorldProvider
{
    /**
     * Creates a new {@link BiomeProvider} for the WorldProvider, and also sets the values of {@link #hasSkylight} and
     * {@link #hasNoSky} appropriately.
     *  
     * Note that subclasses generally override this method without calling the parent version.
     */
    public void init()
    {
        this.biomeProvider = new BiomeProviderSingle(Biomes.ICE_PLAINS);
        setAllowedSpawnTypes(true, false);
    }

    public IChunkGenerator createChunkGenerator()
    {
        return new ChunkGeneratorArctic(this.world, this.world.getWorldInfo().isMapFeaturesEnabled(), this.world.getSeed(), this.getSpawnCoordinate());
    }

    /**
     * Return Vec3D with biome specific fog color
     */
    @SideOnly(Side.CLIENT)
    public Vec3d getFogColor(float p_76562_1_, float p_76562_2_)
    {
        int i = 10518688;
        float f = MathHelper.cos(p_76562_1_ * ((float)Math.PI * 2F)) * 2.0F + 0.5F;
        f = MathHelper.clamp(f, 0.0F, 1.0F);
        float f1 = 0.627451F;
        float f2 = 0.5019608F;
        float f3 = 0.627451F;
        f1 = f1 * (f * 0.0F + 0.15F);
        f2 = f2 * (f * 0.0F + 0.15F);
        f3 = f3 * (f * 0.0F + 0.15F);
        return new Vec3d((double)f1, (double)f2, (double)f3);
    }

    /**
     * True if the player can respawn in this dimension (true = overworld, false = nether).
     */
    public boolean canRespawnHere()
    {
        return false;
    }

    /**
     * Returns 'true' if in the "main surface world", but 'false' if in the Nether or End dimensions.
     */
    public boolean isSurfaceWorld()
    {
        return false;
    }

    /**
     * Will check if the x, z position specified is alright to be set as the map spawn point
     */
    public boolean canCoordinateBeSpawn(int x, int z)
    {
        return false;
    }

    /**
     * Returns true if the given X,Z coordinate should show environmental fog.
     */
    @SideOnly(Side.CLIENT)
    public boolean doesXZShowFog(int x, int z)
    {
        return false;
    }

    public DimensionType getDimensionType()
    {
        return ExpandedAesthetics.arcticDimension;
    }
    @Override
    public Biome getBiomeForCoords(BlockPos pos)
    {
        return world.getBiomeForCoordsBody(pos);
    }
    @Override
    public boolean shouldMapSpin(String entity, double x, double z, double rotation)
    {
        return true;
    }
    @Override
    public boolean canSnowAt(BlockPos pos, boolean checkLight)
    {
        return true;
    }
}