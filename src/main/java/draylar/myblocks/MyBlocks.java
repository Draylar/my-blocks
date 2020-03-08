package draylar.myblocks;

import me.sargunvohra.mcmods.autoconfig1u.AutoConfig;
import me.sargunvohra.mcmods.autoconfig1u.serializer.GsonConfigSerializer;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class MyBlocks implements ModInitializer {

    public static final MyBlocksConfig CONFIG = AutoConfig.register(MyBlocksConfig.class, GsonConfigSerializer::new).getConfig();

    @Override
    public void onInitialize() {
        CONFIG.blocks.forEach(blockName -> {
            Block block = Registry.BLOCK.add(new Identifier("myblocks", blockName), new Block(FabricBlockSettings.of(Material.STONE).build()));
            Registry.ITEM.add(new Identifier("myblocks", blockName), new BlockItem(block, new Item.Settings()));
        });
    }
}
