package org.nixub86.SCT.Blocks;

import java.util.Random;

import org.nixub86.SCT.Items.ItemsSCT;

import cpw.mods.fml.common.IWorldGenerator;
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenMinable;

public class Generaciya implements IWorldGenerator{

	@Override
    public void generate(Random random, int chunkX, int chunkZ, World world, IChunkProvider chunkGenerator,
            IChunkProvider chunkProvider)
    {
            switch(world.provider.dimensionId)
            {
                    case -1: generateNether(world, random, chunkX * 16, chunkZ * 16); break;
                    case 0: generateOverworld(world, random, chunkX * 16, chunkZ * 16); break;
                    case 1: generateEnd(world, random, chunkX * 16, chunkZ * 16); break;
                    case 8: generateMir(world, random, chunkX * 16, chunkZ * 16); break;
            }
    }

    private void generateEnd(World world, Random random, int x, int z) 
    {
    int Xcoord = x + random.nextInt(16);
    int Ycoord = 10 + random.nextInt(128);
    int Zcoord = z + random.nextInt(16);
    
   // (new WorldGenMinable(ItemsSCT.Ryda, 1, 15, Blocks.end_stone)).generate(world, random, Xcoord, Ycoord, Zcoord);
    }

    private void generateOverworld(World world, Random random, int x, int z) 
    {
            //this.addOreSpawn(ItemsSCT.Ryda, world, random, x, z, 16, 16, 4 + random.nextInt(3), 10, 15, 50);
    }
    
    private void generateMir(World world, Random random, int x, int z) 
    {
            this.addOreSpawn(BlocksSCT.TriniumOre, world, random, x, z, 16, 16, 4 + random.nextInt(3), 10, 15, 50);
    }

    private void generateNether(World world, Random random, int x, int z)
    {
    int Xcoord = x + random.nextInt(16);

    int Ycoord = 10 + random.nextInt(128);

    int Zcoord = z + random.nextInt(16);

    //(new WorldGenMinable(ItemsSCT.Ryda, 1, 15, Blocks.netherrack)).generate(world, random, Xcoord, Ycoord, Zcoord);
    }
    
/**
 * ��������� ��������� ���� � Minecraft. ������ �������������� ���� ������� ��� ����������� ������������ ���.

 * @param block ����, ������� ������ ������������

 * @param world ��� (�� ���������), � ������� ���� ���� ������ ��������������

 * @param random ��������� ����� ��� ��������� ��������� ��������� �����

 * @param blockXPos ����� ��� ����, ����� ���� ������ ����� �� ����������� X ��� ������ ��������� (���������� ��������� ����)

 * @param blockZPos ����� ��� ����, ����� ���� ������ ����� �� ����������� Z ��� ������ ��������� (���������� ��������� ����)

 * @param maxX �����, ������� �������� ������������ X ���������� ��� ��������� ���� �� ��� X �� ����

 * @param maxZ �����, ������� �������� ������������ Z ���������� ��� ��������� ���� �� ��� Z �� ����

 * @param maxVeinSize ������������ ����� ������ ���� � ����� ����

 * @param chancesToSpawn ���� ��������� ������ �� ����

 * @param minY ����������� ���������� Y �� ������� ���� ����� ���������������

 * @param maxY ������������ ���������� Y �� ������� ���� ����� ���������������
 */
    public void addOreSpawn(Block block, World world, Random random, int blockXPos, int blockZPos, int maxX, int maxZ,
            int maxVeinSize, int chancesToSpawn, int minY, int maxY)
    {
            int maxPossY = minY + (maxY - 1);
            assert maxY > minY : "������������ Y ������ ���� ������ �����������";
            assert maxX > 0 && maxX <= 16 : "addOreSpawn: ������������ X ������ ���� ������ 0 � ������ 16";
            assert minY > 0 : "addOreSpawn: ����������� Y ������ ���� ������ 0";
            assert maxY < 256 && maxY > 0 : "addOreSpawn: ������������ Y ������ ���� ������ 256 � ������ 0";
            assert maxZ > 0 && maxZ <= 16 : "addOreSpawn: ������������ Z ������ ���� ������ 0 � ������ 16";

            int diffBtwnMinMaxY = maxY - minY;
            for (int x = 0; x < chancesToSpawn; x++)
            {
                    int posX = blockXPos + random.nextInt(maxX);
                    int posY = minY + random.nextInt(diffBtwnMinMaxY);
                    int posZ = blockZPos + random.nextInt(maxZ);
                    (new WorldGenMinable(block, maxVeinSize)).generate(world, random, posX, posY, posZ);
            }
    }
	
}
