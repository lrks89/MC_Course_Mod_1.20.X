package net.lrks_89.mccourse.datagen;

import net.lrks_89.mccourse.MCCourseMod;
import net.lrks_89.mccourse.block.ModBlocks;
import net.lrks_89.mccourse.util.ModTags;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.BlockTags;
import net.minecraftforge.common.Tags;
import net.minecraftforge.common.data.BlockTagsProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagGenerator extends BlockTagsProvider {
    public ModBlockTagGenerator(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider,
                                @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, MCCourseMod.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider pProvider) {
        this.tag(ModTags.Blocks.METAL_DETECTOR_VALUABLES)
                .add(ModBlocks.ALEXANDRITE_ORE.get()).addTag(Tags.Blocks.ORES);

        this.tag(BlockTags.MINEABLE_WITH_PICKAXE)
                .add(ModBlocks.ALEXANDRITE_BLOCK.get(),
                        ModBlocks.ALEXANDRITE_STAIRS.get(),
                        ModBlocks.ALEXANDRITE_SLAB.get(),

                        ModBlocks.RAW_ALEXANDRITE_BLOCK.get(),

                        ModBlocks.ALEXANDRITE_ORE.get(),
                        ModBlocks.DEEPSLATE_ALEXANDRITE_ORE.get(),
                        ModBlocks.END_STONE_ALEXANDRITE_ORE.get(),
                        ModBlocks.NETHER_ALEXANDRITE_ORE.get());

        this.tag(BlockTags.MINEABLE_WITH_AXE)
                .add(ModBlocks.SOUND_BLOCK.get());

        this.tag(BlockTags.NEEDS_IRON_TOOL)
                .add(ModBlocks.ALEXANDRITE_BLOCK.get(),
                        ModBlocks.ALEXANDRITE_STAIRS.get(),
                        ModBlocks.ALEXANDRITE_SLAB.get(),

                        ModBlocks.RAW_ALEXANDRITE_BLOCK.get(),

                        ModBlocks.ALEXANDRITE_ORE.get(),

                        ModBlocks.SOUND_BLOCK.get());

        this.tag(BlockTags.NEEDS_DIAMOND_TOOL)
                .add(ModBlocks.DEEPSLATE_ALEXANDRITE_ORE.get(),
                        ModBlocks.END_STONE_ALEXANDRITE_ORE.get(),
                        ModBlocks.NETHER_ALEXANDRITE_ORE.get());
    }

    @Override
    public String getName() {
        return "Block Tags";
    }
}
