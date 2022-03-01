package com.supermartijn642.rechiseled;

import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;

import java.util.Locale;
import java.util.function.Supplier;

import static com.supermartijn642.rechiseled.RechiseledBlockType.BlockOption.*;
import static com.supermartijn642.rechiseled.api.BaseChiselingRecipes.*;

/**
 * Created 21/12/2021 by SuperMartijn642
 */
public enum RechiseledBlockType {

    ACACIA_PLANKS_BEAMS("Acacia Plank Beams", () -> Blocks.ACACIA_PLANKS, NON_CONNECTING, CONNECTING, ACACIA_PLANKS),
    ACACIA_PLANKS_BRICKS("Acacia Plank Bricks", () -> Blocks.ACACIA_PLANKS, NON_CONNECTING, CONNECTING, ACACIA_PLANKS),
    ACACIA_PLANKS_CRATE("Acacia Planks Crate", () -> Blocks.ACACIA_PLANKS, NON_CONNECTING, CONNECTING, ACACIA_PLANKS),
    ACACIA_PLANKS_DIAGONAL_STRIPES("Diagonal Acacia Plank Stripes", () -> Blocks.ACACIA_PLANKS, NON_CONNECTING, CONNECTING, ACACIA_PLANKS),
    ACACIA_PLANKS_DIAGONAL_TILES("Diagonal Acacia Plank Tiles", () -> Blocks.ACACIA_PLANKS, NON_CONNECTING, CONNECTING, ACACIA_PLANKS),
    ACACIA_PLANKS_DOTTED("Dotted Acacia Planks", () -> Blocks.ACACIA_PLANKS, NON_CONNECTING, CONNECTING, ACACIA_PLANKS),
    ACACIA_PLANKS_FLOORING("Acacia Plank Flooring", () -> Blocks.ACACIA_PLANKS, NON_CONNECTING, CONNECTING, ACACIA_PLANKS),
    ACACIA_PLANKS_LARGE_TILES("Large Acacia Plank Tiles", () -> Blocks.ACACIA_PLANKS, NON_CONNECTING, CONNECTING, ACACIA_PLANKS),
    ACACIA_PLANKS_PATTERN("Acacia Plank Pattern", () -> Blocks.ACACIA_PLANKS, NON_CONNECTING, CONNECTING, ACACIA_PLANKS),
    ACACIA_PLANKS_SMALL_BRICKS("Small Acacia Plank Bricks", () -> Blocks.ACACIA_PLANKS, NON_CONNECTING, CONNECTING, ACACIA_PLANKS),
    ACACIA_PLANKS_SMALL_TILES("Small Acacia Plank Tiles", () -> Blocks.ACACIA_PLANKS, NON_CONNECTING, CONNECTING, ACACIA_PLANKS),
    ACACIA_PLANKS_SQUARES("Acacia Plank Squares", () -> Blocks.ACACIA_PLANKS, NON_CONNECTING, CONNECTING, ACACIA_PLANKS),
    ACACIA_PLANKS_TILES("Acacia Plank Tiles", () -> Blocks.ACACIA_PLANKS, NON_CONNECTING, CONNECTING, ACACIA_PLANKS),
    ACACIA_PLANKS_WAVY("Wavy Acacia Planks", () -> Blocks.ACACIA_PLANKS, NON_CONNECTING, CONNECTING, ACACIA_PLANKS),
    ACACIA_PLANKS_WOVEN("Woven Acacia Planks", () -> Blocks.ACACIA_PLANKS, NON_CONNECTING, CONNECTING, ACACIA_PLANKS),
    ANDESITE_BRICKS("Andesite Bricks", () -> Blocks.POLISHED_ANDESITE, NON_CONNECTING, CONNECTING, ANDESITE),
    ANDESITE_DIAGONAL_BRICKS("Diagonal Andesite Bricks", () -> Blocks.POLISHED_ANDESITE, NON_CONNECTING, CONNECTING, ANDESITE),
    ANDESITE_DOTTED("Dotted Andesite", () -> Blocks.POLISHED_ANDESITE, NON_CONNECTING, CONNECTING, ANDESITE),
    ANDESITE_PAVING("Andesite Paving", () -> Blocks.POLISHED_ANDESITE, NON_CONNECTING, CONNECTING, ANDESITE),
    ANDESITE_POLISHED("Polished Andesite", () -> Blocks.POLISHED_ANDESITE, USE_PARENT, CONNECTING, ANDESITE),
    ANDESITE_ROTATED_BRICKS("Rotated Andesite Bricks", () -> Blocks.POLISHED_ANDESITE, NON_CONNECTING, CONNECTING, ANDESITE),
    ANDESITE_SQUARES("Andesite Squares", () -> Blocks.POLISHED_ANDESITE, NON_CONNECTING, CONNECTING, ANDESITE),
    ANDESITE_TILES("Andesite Tiles", () -> Blocks.POLISHED_ANDESITE, NON_CONNECTING, CONNECTING, ANDESITE),
    ANDESITE_WAVY("Wavy Andesite", () -> Blocks.POLISHED_ANDESITE, NON_CONNECTING, CONNECTING, ANDESITE),
    BIRCH_PLANKS_BEAMS("Birch Plank Beams", () -> Blocks.BIRCH_PLANKS, NON_CONNECTING, CONNECTING, BIRCH_PLANKS),
    BIRCH_PLANKS_BRICKS("Birch Plank Bricks", () -> Blocks.BIRCH_PLANKS, NON_CONNECTING, CONNECTING, BIRCH_PLANKS),
    BIRCH_PLANKS_CRATE("Birch Planks Crate", () -> Blocks.BIRCH_PLANKS, NON_CONNECTING, CONNECTING, BIRCH_PLANKS),
    BIRCH_PLANKS_DIAGONAL_STRIPES("Diagonal Birch Plank Stripes", () -> Blocks.BIRCH_PLANKS, NON_CONNECTING, CONNECTING, BIRCH_PLANKS),
    BIRCH_PLANKS_DIAGONAL_TILES("Diagonal Birch Plank Tiles", () -> Blocks.BIRCH_PLANKS, NON_CONNECTING, CONNECTING, BIRCH_PLANKS),
    BIRCH_PLANKS_DOTTED("Dotted Birch Planks", () -> Blocks.BIRCH_PLANKS, NON_CONNECTING, CONNECTING, BIRCH_PLANKS),
    BIRCH_PLANKS_FLOORING("Birch Plank Flooring", () -> Blocks.BIRCH_PLANKS, NON_CONNECTING, CONNECTING, BIRCH_PLANKS),
    BIRCH_PLANKS_LARGE_TILES("Large Birch Plank Tiles", () -> Blocks.BIRCH_PLANKS, NON_CONNECTING, CONNECTING, BIRCH_PLANKS),
    BIRCH_PLANKS_PATTERN("Birch Plank Pattern", () -> Blocks.BIRCH_PLANKS, NON_CONNECTING, CONNECTING, BIRCH_PLANKS),
    BIRCH_PLANKS_SMALL_BRICKS("Small Birch Plank Bricks", () -> Blocks.BIRCH_PLANKS, NON_CONNECTING, CONNECTING, BIRCH_PLANKS),
    BIRCH_PLANKS_SMALL_TILES("Small Birch Plank Tiles", () -> Blocks.BIRCH_PLANKS, NON_CONNECTING, CONNECTING, BIRCH_PLANKS),
    BIRCH_PLANKS_SQUARES("Birch Plank Squares", () -> Blocks.BIRCH_PLANKS, NON_CONNECTING, CONNECTING, BIRCH_PLANKS),
    BIRCH_PLANKS_TILES("Birch Plank Tiles", () -> Blocks.BIRCH_PLANKS, NON_CONNECTING, CONNECTING, BIRCH_PLANKS),
    BIRCH_PLANKS_WAVY("Wavy Birch Planks", () -> Blocks.BIRCH_PLANKS, NON_CONNECTING, CONNECTING, BIRCH_PLANKS),
    BIRCH_PLANKS_WOVEN("Woven Birch Planks", () -> Blocks.BIRCH_PLANKS, NON_CONNECTING, CONNECTING, BIRCH_PLANKS),
    COBBLESTONE_BEAMS("Cobblestone Beams", () -> Blocks.COBBLESTONE, NON_CONNECTING, CONNECTING, COBBLESTONE),
    COBBLESTONE_CROSSES("Cobblestone Crosses", () -> Blocks.COBBLESTONE, NON_CONNECTING, CONNECTING, COBBLESTONE),
    COBBLESTONE_DENTED("Dented Cobblestone", () -> Blocks.COBBLESTONE, NON_CONNECTING, CONNECTING, COBBLESTONE),
    COBBLESTONE_INVERTED_DENTED("Inverted Dented Cobblestone", () -> Blocks.COBBLESTONE, NON_CONNECTING, CONNECTING, COBBLESTONE),
    COBBLESTONE_PAVING("Cobblestone Paving", () -> Blocks.COBBLESTONE, NON_CONNECTING, CONNECTING, COBBLESTONE),
    COBBLESTONE_PULVERIZED("Pulverized Cobblestone", () -> Blocks.COBBLESTONE, NON_CONNECTING, CONNECTING, COBBLESTONE),
    COBBLESTONE_ROTATED_BRICKS("Rotated Cobblestone Bricks", () -> Blocks.COBBLESTONE, NON_CONNECTING, CONNECTING, COBBLESTONE),
    COBBLESTONE_SMALL_TILES("Small Cobblestone Tiles", () -> Blocks.COBBLESTONE, NON_CONNECTING, CONNECTING, COBBLESTONE),
    COBBLESTONE_SQUARES("Cobblestone Squares", () -> Blocks.COBBLESTONE, NON_CONNECTING, CONNECTING, COBBLESTONE),
    COBBLESTONE_STRIPES("Cobblestone Stripes", () -> Blocks.COBBLESTONE, NON_CONNECTING, CONNECTING, COBBLESTONE),
    COBBLESTONE_TILES("Cobblestone Tiles", () -> Blocks.COBBLESTONE, NON_CONNECTING, CONNECTING, COBBLESTONE),
    COBBLESTONE_WORN_STRIPES("Weathered Cobblestone Stripes", () -> Blocks.COBBLESTONE, NON_CONNECTING, CONNECTING, COBBLESTONE),
    DARK_OAK_PLANKS_BEAMS("Dark Oak Plank Beams", () -> Blocks.DARK_OAK_PLANKS, NON_CONNECTING, CONNECTING, DARK_OAK_PLANKS),
    DARK_OAK_PLANKS_BRICKS("Dark Oak Plank Bricks", () -> Blocks.DARK_OAK_PLANKS, NON_CONNECTING, CONNECTING, DARK_OAK_PLANKS),
    DARK_OAK_PLANKS_CRATE("Dark Oak Planks Crate", () -> Blocks.DARK_OAK_PLANKS, NON_CONNECTING, CONNECTING, DARK_OAK_PLANKS),
    DARK_OAK_PLANKS_DIAGONAL_STRIPES("Diagonal Dark Oak Plank Stripes", () -> Blocks.DARK_OAK_PLANKS, NON_CONNECTING, CONNECTING, DARK_OAK_PLANKS),
    DARK_OAK_PLANKS_DIAGONAL_TILES("Diagonal Dark Oak Plank Tiles", () -> Blocks.DARK_OAK_PLANKS, NON_CONNECTING, CONNECTING, DARK_OAK_PLANKS),
    DARK_OAK_PLANKS_DOTTED("Dotted Dark Oak Planks", () -> Blocks.DARK_OAK_PLANKS, NON_CONNECTING, CONNECTING, DARK_OAK_PLANKS),
    DARK_OAK_PLANKS_FLOORING("Dark Oak Plank Flooring", () -> Blocks.DARK_OAK_PLANKS, NON_CONNECTING, CONNECTING, DARK_OAK_PLANKS),
    DARK_OAK_PLANKS_LARGE_TILES("Large Dark Oak Plank Tiles", () -> Blocks.DARK_OAK_PLANKS, NON_CONNECTING, CONNECTING, DARK_OAK_PLANKS),
    DARK_OAK_PLANKS_PATTERN("Dark Oak Plank Pattern", () -> Blocks.DARK_OAK_PLANKS, NON_CONNECTING, CONNECTING, DARK_OAK_PLANKS),
    DARK_OAK_PLANKS_SMALL_BRICKS("Small Dark Oak Plank Bricks", () -> Blocks.DARK_OAK_PLANKS, NON_CONNECTING, CONNECTING, DARK_OAK_PLANKS),
    DARK_OAK_PLANKS_SMALL_TILES("Small Dark Oak Plank Tiles", () -> Blocks.DARK_OAK_PLANKS, NON_CONNECTING, CONNECTING, DARK_OAK_PLANKS),
    DARK_OAK_PLANKS_SQUARES("Dark Oak Plank Squares", () -> Blocks.DARK_OAK_PLANKS, NON_CONNECTING, CONNECTING, DARK_OAK_PLANKS),
    DARK_OAK_PLANKS_TILES("Dark Oak Plank Tiles", () -> Blocks.DARK_OAK_PLANKS, NON_CONNECTING, CONNECTING, DARK_OAK_PLANKS),
    DARK_OAK_PLANKS_WAVY("Wavy Dark Oak Planks", () -> Blocks.DARK_OAK_PLANKS, NON_CONNECTING, CONNECTING, DARK_OAK_PLANKS),
    DARK_OAK_PLANKS_WOVEN("Woven Dark Oak Planks", () -> Blocks.DARK_OAK_PLANKS, NON_CONNECTING, CONNECTING, DARK_OAK_PLANKS),
    DARK_PRISMARINE_BEAMS("Dark Prismarine Beams", () -> Blocks.DARK_PRISMARINE, NON_CONNECTING, CONNECTING, DARK_PRISMARINE),
    DARK_PRISMARINE_BRICKS("Dark Prismarine Bricks", () -> Blocks.DARK_PRISMARINE, NON_CONNECTING, CONNECTING, DARK_PRISMARINE),
    DARK_PRISMARINE_DOTTED("Dotted Dark Prismarine", () -> Blocks.DARK_PRISMARINE, NON_CONNECTING, CONNECTING, DARK_PRISMARINE),
    DARK_PRISMARINE_FABRIC("Dark Prismarine Fabric", () -> Blocks.DARK_PRISMARINE, NON_CONNECTING, CONNECTING, DARK_PRISMARINE),
    DARK_PRISMARINE_LARGE_TILES("Large Dark Prismarine Tiles", () -> Blocks.DARK_PRISMARINE, NON_CONNECTING, CONNECTING, DARK_PRISMARINE),
    DARK_PRISMARINE_ROWS("Dark Prismarine Rows", () -> Blocks.DARK_PRISMARINE, NON_CONNECTING, CONNECTING, DARK_PRISMARINE),
    DARK_PRISMARINE_SQUARES("Dark Prismarine Squares", () -> Blocks.DARK_PRISMARINE, NON_CONNECTING, CONNECTING, DARK_PRISMARINE),
    DARK_PRISMARINE_TILES("Dark Prismarine Tiles", () -> Blocks.DARK_PRISMARINE, NON_CONNECTING, CONNECTING, DARK_PRISMARINE),
    DARK_PRISMARINE_WAVY("Wavy Dark Prismarine", () -> Blocks.DARK_PRISMARINE, NON_CONNECTING, CONNECTING, DARK_PRISMARINE),
    DARK_PRISMARINE_WOVEN("Woven Dark Prismarine", () -> Blocks.DARK_PRISMARINE, NON_CONNECTING, CONNECTING, DARK_PRISMARINE),
    DIORITE_BRICKS("Diorite Bricks", () -> Blocks.POLISHED_DIORITE, NON_CONNECTING, CONNECTING, DIORITE),
    DIORITE_DIAGONAL_BRICKS("Diagonal Diorite Bricks", () -> Blocks.POLISHED_DIORITE, NON_CONNECTING, CONNECTING, DIORITE),
    DIORITE_DOTTED("Dotted Diorite", () -> Blocks.POLISHED_DIORITE, NON_CONNECTING, CONNECTING, DIORITE),
    DIORITE_PAVING("Diorite Paving", () -> Blocks.POLISHED_DIORITE, NON_CONNECTING, CONNECTING, DIORITE),
    DIORITE_POLISHED("Polished Diorite", () -> Blocks.POLISHED_DIORITE, USE_PARENT, CONNECTING, DIORITE),
    DIORITE_ROTATED_BRICKS("Rotated Diorite Bricks", () -> Blocks.POLISHED_DIORITE, NON_CONNECTING, CONNECTING, DIORITE),
    DIORITE_SQUARES("Diorite Squares", () -> Blocks.POLISHED_DIORITE, NON_CONNECTING, CONNECTING, DIORITE),
    DIORITE_TILES("Diorite Tiles", () -> Blocks.POLISHED_DIORITE, NON_CONNECTING, CONNECTING, DIORITE),
    DIORITE_WAVY("Wavy Diorite", () -> Blocks.POLISHED_DIORITE, NON_CONNECTING, CONNECTING, DIORITE),
    DIRT_BLOBS("Dirt Blobs", () -> Blocks.DIRT, NON_CONNECTING, CONNECTING, DIRT),
    DIRT_BRICKS("Dirt Bricks", () -> Blocks.DIRT, NON_CONNECTING, CONNECTING, DIRT),
    DIRT_CHUNKS("Dirt Chunks", () -> Blocks.DIRT, NON_CONNECTING, CONNECTING, DIRT),
    DIRT_CLUMPS("Dirt Clumps", () -> Blocks.DIRT, NON_CONNECTING, CONNECTING, DIRT),
    DIRT_COBBLED("Cobbled Dirt", () -> Blocks.DIRT, NORMAL, NONE, DIRT),
    DIRT_GROOVES("Dirt Grooves", () -> Blocks.DIRT, NORMAL, NONE, DIRT),
    DIRT_LARGE_TILES("Large Dirt Tiles", () -> Blocks.DIRT, NON_CONNECTING, CONNECTING, DIRT),
    DIRT_MUDDY("Muddy Dirt", () -> Blocks.DIRT, NORMAL, NONE, DIRT),
    DIRT_SMALL_BRICKS("Small Dirt Bricks", () -> Blocks.DIRT, NON_CONNECTING, CONNECTING, DIRT),
    DIRT_SMALL_TILES("Small Dirt Tiles", () -> Blocks.DIRT, NON_CONNECTING, CONNECTING, DIRT),
    DIRT_SMOOTH_CLUMPS("Smooth Dirt Clumps", () -> Blocks.DIRT, NON_CONNECTING, CONNECTING, DIRT),
    DIRT_SOIL("Dirt Soil", () -> Blocks.DIRT, NON_CONNECTING, CONNECTING, DIRT),
    DIRT_SQUARES("Dirt Squares", () -> Blocks.DIRT, NON_CONNECTING, CONNECTING, DIRT),
    DIRT_TILES("Dirt Tiles", () -> Blocks.DIRT, NON_CONNECTING, CONNECTING, DIRT),
    DIRT_TILLED("Tilled Dirt", () -> Blocks.DIRT, NON_CONNECTING, CONNECTING, DIRT),
    END_STONE_BLOBS("End Stone Blobs", () -> Blocks.END_STONE, NON_CONNECTING, CONNECTING, END_STONE),
    END_STONE_CHISELED("Chiseled End Stone", () -> Blocks.END_STONE, NON_CONNECTING, CONNECTING, END_STONE),
    END_STONE_CRUSHED("Crushed End Stone", () -> Blocks.END_STONE, NON_CONNECTING, CONNECTING, END_STONE),
    END_STONE_DIAGONAL_BRICKS("Diagonal End Stone Bricks", () -> Blocks.END_STONE_BRICKS, NON_CONNECTING, CONNECTING, END_STONE),
    END_STONE_MESH("End Stone Mesh", () -> Blocks.END_STONE, NON_CONNECTING, CONNECTING, END_STONE),
    END_STONE_PAVING("End Stone Paving", () -> Blocks.END_STONE, NON_CONNECTING, CONNECTING, END_STONE),
    END_STONE_POLISHED("Polished End Stone", () -> Blocks.END_STONE_BRICKS, NON_CONNECTING, CONNECTING, END_STONE),
    END_STONE_SCALES("End Stone Scales", () -> Blocks.END_STONE, NON_CONNECTING, CONNECTING, END_STONE),
    END_STONE_SMALL_TILES("Small End Stone Tiles", () -> Blocks.END_STONE, NON_CONNECTING, CONNECTING, END_STONE),
    END_STONE_SPIRAL_PATTERN("Spiral End Stone Pattern", () -> Blocks.END_STONE, NON_CONNECTING, CONNECTING, END_STONE),
    END_STONE_SQUARES("End Stone Squares", () -> Blocks.END_STONE, NON_CONNECTING, CONNECTING, END_STONE),
    END_STONE_TILES("End Stone Tiles", () -> Blocks.END_STONE_BRICKS, NON_CONNECTING, CONNECTING, END_STONE),
    GLOWSTONE_BRICKS("Glowstone Bricks", () -> Blocks.GLOWSTONE, NON_CONNECTING, CONNECTING, GLOWSTONE),
    GLOWSTONE_CRUSHED("Crushed Glowstone", () -> Blocks.GLOWSTONE, NON_CONNECTING, CONNECTING, GLOWSTONE),
    GLOWSTONE_LARGE_TILES("Large Glowstone Tiles", () -> Blocks.GLOWSTONE, NON_CONNECTING, CONNECTING, GLOWSTONE),
    GLOWSTONE_SMALL_TILES("Small Glowstone Tiles", () -> Blocks.GLOWSTONE, NON_CONNECTING, CONNECTING, GLOWSTONE),
    GLOWSTONE_SMOOTH("Smooth Glowstone", () -> Blocks.GLOWSTONE, NON_CONNECTING, CONNECTING, GLOWSTONE),
    GLOWSTONE_TILES("Glowstone Tiles", () -> Blocks.GLOWSTONE, NON_CONNECTING, CONNECTING, GLOWSTONE),
    GRANITE_BRICKS("Granite Bricks", () -> Blocks.POLISHED_GRANITE, NON_CONNECTING, CONNECTING, GRANITE),
    GRANITE_DIAGONAL_BRICKS("Diagonal Granite Bricks", () -> Blocks.POLISHED_GRANITE, NON_CONNECTING, CONNECTING, GRANITE),
    GRANITE_DOTTED("Dotted Granite", () -> Blocks.POLISHED_GRANITE, NON_CONNECTING, CONNECTING, GRANITE),
    GRANITE_PAVING("Granite Paving", () -> Blocks.POLISHED_GRANITE, NON_CONNECTING, CONNECTING, GRANITE),
    GRANITE_POLISHED("Polished Granite", () -> Blocks.POLISHED_GRANITE, USE_PARENT, CONNECTING, GRANITE),
    GRANITE_ROTATED_BRICKS("Rotated Granite Bricks", () -> Blocks.POLISHED_GRANITE, NON_CONNECTING, CONNECTING, GRANITE),
    GRANITE_SQUARES("Granite Squares", () -> Blocks.POLISHED_GRANITE, NON_CONNECTING, CONNECTING, GRANITE),
    GRANITE_TILES("Granite Tiles", () -> Blocks.POLISHED_GRANITE, NON_CONNECTING, CONNECTING, GRANITE),
    GRANITE_WAVY("Wavy Granite", () -> Blocks.POLISHED_GRANITE, NON_CONNECTING, CONNECTING, GRANITE),
    JUNGLE_PLANKS_BEAMS("Jungle Plank Beams", () -> Blocks.JUNGLE_PLANKS, NON_CONNECTING, CONNECTING, JUNGLE_PLANKS),
    JUNGLE_PLANKS_BRICKS("Jungle Plank Bricks", () -> Blocks.JUNGLE_PLANKS, NON_CONNECTING, CONNECTING, JUNGLE_PLANKS),
    JUNGLE_PLANKS_CRATE("Jungle Planks Crate", () -> Blocks.JUNGLE_PLANKS, NON_CONNECTING, CONNECTING, JUNGLE_PLANKS),
    JUNGLE_PLANKS_DIAGONAL_STRIPES("Diagonal Jungle Plank Stripes", () -> Blocks.JUNGLE_PLANKS, NON_CONNECTING, CONNECTING, JUNGLE_PLANKS),
    JUNGLE_PLANKS_DIAGONAL_TILES("Diagonal Jungle Plank Tiles", () -> Blocks.JUNGLE_PLANKS, NON_CONNECTING, CONNECTING, JUNGLE_PLANKS),
    JUNGLE_PLANKS_DOTTED("Dotted Jungle Planks", () -> Blocks.JUNGLE_PLANKS, NON_CONNECTING, CONNECTING, JUNGLE_PLANKS),
    JUNGLE_PLANKS_FLOORING("Jungle Plank Flooring", () -> Blocks.JUNGLE_PLANKS, NON_CONNECTING, CONNECTING, JUNGLE_PLANKS),
    JUNGLE_PLANKS_LARGE_TILES("Large Jungle Plank Tiles", () -> Blocks.JUNGLE_PLANKS, NON_CONNECTING, CONNECTING, JUNGLE_PLANKS),
    JUNGLE_PLANKS_PATTERN("Jungle Plank Pattern", () -> Blocks.JUNGLE_PLANKS, NON_CONNECTING, CONNECTING, JUNGLE_PLANKS),
    JUNGLE_PLANKS_SMALL_BRICKS("Small Jungle Plank Bricks", () -> Blocks.JUNGLE_PLANKS, NON_CONNECTING, CONNECTING, JUNGLE_PLANKS),
    JUNGLE_PLANKS_SMALL_TILES("Small Jungle Plank Tiles", () -> Blocks.JUNGLE_PLANKS, NON_CONNECTING, CONNECTING, JUNGLE_PLANKS),
    JUNGLE_PLANKS_SQUARES("Jungle Plank Squares", () -> Blocks.JUNGLE_PLANKS, NON_CONNECTING, CONNECTING, JUNGLE_PLANKS),
    JUNGLE_PLANKS_TILES("Jungle Plank Tiles", () -> Blocks.JUNGLE_PLANKS, NON_CONNECTING, CONNECTING, JUNGLE_PLANKS),
    JUNGLE_PLANKS_WAVY("Wavy Jungle Planks", () -> Blocks.JUNGLE_PLANKS, NON_CONNECTING, CONNECTING, JUNGLE_PLANKS),
    JUNGLE_PLANKS_WOVEN("Woven Jungle Planks", () -> Blocks.JUNGLE_PLANKS, NON_CONNECTING, CONNECTING, JUNGLE_PLANKS),
    MOSSY_COBBLESTONE_BEAMS("Mossy Cobblestone Beams", () -> Blocks.MOSSY_COBBLESTONE, NON_CONNECTING, CONNECTING, COBBLESTONE),
    MOSSY_COBBLESTONE_DENTED("Dented Mossy Cobblestone", () -> Blocks.MOSSY_COBBLESTONE, NON_CONNECTING, CONNECTING, COBBLESTONE),
    MOSSY_COBBLESTONE_INVERTED_DENTED("Inverted Dented Mossy Cobblestone", () -> Blocks.MOSSY_COBBLESTONE, NON_CONNECTING, CONNECTING, COBBLESTONE),
    MOSSY_COBBLESTONE_PAVING("Mossy Cobblestone Paving", () -> Blocks.MOSSY_COBBLESTONE, NON_CONNECTING, CONNECTING, COBBLESTONE),
    MOSSY_COBBLESTONE_SMALL_TILES("Small Mossy Cobblestone Tiles", () -> Blocks.MOSSY_COBBLESTONE, NON_CONNECTING, CONNECTING, COBBLESTONE),
    MOSSY_COBBLESTONE_SQUARES("Mossy Cobblestone Squares", () -> Blocks.MOSSY_COBBLESTONE, NON_CONNECTING, CONNECTING, COBBLESTONE),
    MOSSY_COBBLESTONE_STRIPES("Mossy Cobblestone Stripes", () -> Blocks.MOSSY_COBBLESTONE, NON_CONNECTING, CONNECTING, COBBLESTONE),
    MOSSY_COBBLESTONE_WORN_STRIPES("Weathered Mossy Cobblestone", () -> Blocks.MOSSY_COBBLESTONE, NON_CONNECTING, CONNECTING, COBBLESTONE),
    NETHERRACK_BEAMS("Netherrack Beams", () -> Blocks.NETHERRACK, NON_CONNECTING, CONNECTING, NETHERRACK),
    NETHERRACK_BRICKS("Netherrack Bricks", () -> Blocks.NETHERRACK, NON_CONNECTING, CONNECTING, NETHERRACK),
    NETHERRACK_DENTED("Dented Netherrack", () -> Blocks.NETHERRACK, NON_CONNECTING, CONNECTING, NETHERRACK),
    NETHERRACK_SMALL_TILES("Small Netherrack Tiles", () -> Blocks.NETHERRACK, NON_CONNECTING, CONNECTING, NETHERRACK),
    NETHERRACK_STRIPES("Netherrack Stripes", () -> Blocks.NETHERRACK, NON_CONNECTING, CONNECTING, NETHERRACK),
    NETHERRACK_TILES("Netherrack Tiles", () -> Blocks.NETHERRACK, NON_CONNECTING, CONNECTING, NETHERRACK),
    NETHER_BRICKS_BEAMS("Nether Brick Beams", () -> Blocks.NETHER_BRICKS, NON_CONNECTING, CONNECTING, NETHER_BRICKS),
    NETHER_BRICKS_CHISELED_SQUARES("Chiseled Nether Brick Squares", () -> Blocks.NETHER_BRICKS, NON_CONNECTING, CONNECTING, NETHER_BRICKS),
    NETHER_BRICKS_DIAGONAL_BRICKS("Diagonal Nether Bricks", () -> Blocks.NETHER_BRICKS, NON_CONNECTING, CONNECTING, NETHER_BRICKS),
    NETHER_BRICKS_LARGE_BRICKS("Large Nether Bricks", () -> Blocks.NETHER_BRICKS, NON_CONNECTING, CONNECTING, NETHER_BRICKS),
    NETHER_BRICKS_LARGE_TILES("Large Nether Brick Tiles", () -> Blocks.NETHER_BRICKS, NON_CONNECTING, CONNECTING, NETHER_BRICKS),
    NETHER_BRICKS_ROTATED_BRICKS("Rotated Nether Bricks", () -> Blocks.NETHER_BRICKS, NON_CONNECTING, CONNECTING, NETHER_BRICKS),
    NETHER_BRICKS_SMALL_TILES("Small Nether Brick Tiles", () -> Blocks.NETHER_BRICKS, NON_CONNECTING, CONNECTING, NETHER_BRICKS),
    NETHER_BRICKS_SMOOTH("Nether Bricks Smooth", () -> Blocks.NETHER_BRICKS, NON_CONNECTING, CONNECTING, NETHER_BRICKS),
    NETHER_BRICKS_SQUARES("Nether Brick Squares", () -> Blocks.NETHER_BRICKS, NON_CONNECTING, CONNECTING, NETHER_BRICKS),
    NETHER_BRICKS_TILES("Nether Brick Tiles", () -> Blocks.NETHER_BRICKS, NON_CONNECTING, CONNECTING, NETHER_BRICKS),
    OAK_PLANKS_BEAMS("Oak Plank Beams", () -> Blocks.OAK_PLANKS, NON_CONNECTING, CONNECTING, OAK_PLANKS),
    OAK_PLANKS_BRICKS("Oak Plank Bricks", () -> Blocks.OAK_PLANKS, NON_CONNECTING, CONNECTING, OAK_PLANKS),
    OAK_PLANKS_CRATE("Oak Planks Crate", () -> Blocks.OAK_PLANKS, NON_CONNECTING, CONNECTING, OAK_PLANKS),
    OAK_PLANKS_DIAGONAL_STRIPES("Diagonal Oak Plank Stripes", () -> Blocks.OAK_PLANKS, NON_CONNECTING, CONNECTING, OAK_PLANKS),
    OAK_PLANKS_DIAGONAL_TILES("Diagonal Oak Plank Tiles", () -> Blocks.OAK_PLANKS, NON_CONNECTING, CONNECTING, OAK_PLANKS),
    OAK_PLANKS_DOTTED("Dotted Oak Planks", () -> Blocks.OAK_PLANKS, NON_CONNECTING, CONNECTING, OAK_PLANKS),
    OAK_PLANKS_FLOORING("Oak Plank Flooring", () -> Blocks.OAK_PLANKS, NON_CONNECTING, CONNECTING, OAK_PLANKS),
    OAK_PLANKS_LARGE_TILES("Large Oak Plank Tiles", () -> Blocks.OAK_PLANKS, NON_CONNECTING, CONNECTING, OAK_PLANKS),
    OAK_PLANKS_PATTERN("Oak Plank Pattern", () -> Blocks.OAK_PLANKS, NON_CONNECTING, CONNECTING, OAK_PLANKS),
    OAK_PLANKS_SMALL_BRICKS("Small Oak Plank Bricks", () -> Blocks.OAK_PLANKS, NON_CONNECTING, CONNECTING, OAK_PLANKS),
    OAK_PLANKS_SMALL_TILES("Small Oak Plank Tiles", () -> Blocks.OAK_PLANKS, NON_CONNECTING, CONNECTING, OAK_PLANKS),
    OAK_PLANKS_SQUARES("Oak Plank Squares", () -> Blocks.OAK_PLANKS, NON_CONNECTING, CONNECTING, OAK_PLANKS),
    OAK_PLANKS_TILES("Oak Plank Tiles", () -> Blocks.OAK_PLANKS, NON_CONNECTING, CONNECTING, OAK_PLANKS),
    OAK_PLANKS_WAVY("Wavy Oak Planks", () -> Blocks.OAK_PLANKS, NON_CONNECTING, CONNECTING, OAK_PLANKS),
    OAK_PLANKS_WOVEN("Woven Oak Planks", () -> Blocks.OAK_PLANKS, NON_CONNECTING, CONNECTING, OAK_PLANKS),
    OBSIDIAN_SQUARES("Obsidian Squares", () -> Blocks.OBSIDIAN, NON_CONNECTING, CONNECTING, OBSIDIAN),
    OBSIDIAN_BRICKS("Obsidian Bricks", () -> Blocks.OBSIDIAN, NON_CONNECTING, CONNECTING, OBSIDIAN),
    OBSIDIAN_TILES("Obsidian Tiles", () -> Blocks.OBSIDIAN, NON_CONNECTING, CONNECTING, OBSIDIAN),
    OBSIDIAN_PILLARS("Obsidian Pillars", () -> Blocks.OBSIDIAN, NON_CONNECTING, CONNECTING, OBSIDIAN),
    OBSIDIAN_SPOTS("Spotted Obsidian", () -> Blocks.OBSIDIAN, NON_CONNECTING, CONNECTING, OBSIDIAN),
    OBSIDIAN_LARGE_TILES("Large Obsidian Tiles", () -> Blocks.OBSIDIAN, NORMAL, NONE, OBSIDIAN),
    OBSIDIAN_BORDERED("Bordered Obsidian", () -> Blocks.OBSIDIAN, NON_CONNECTING, CONNECTING, OBSIDIAN),
    OBSIDIAN_CHISELED("Chiseled Obsidian", () -> Blocks.OBSIDIAN, NON_CONNECTING, CONNECTING, OBSIDIAN),
    OBSIDIAN_CHISELED_CIRCLES("Chiseled Obsidian Circles", () -> Blocks.OBSIDIAN, NON_CONNECTING, CONNECTING, OBSIDIAN),
    OBSIDIAN_STRIPES("Obsidian Stripes", () -> Blocks.OBSIDIAN, NON_CONNECTING, CONNECTING, OBSIDIAN),
    OBSIDIAN_DARK("Dark Obsidian", () -> Blocks.OBSIDIAN, NON_CONNECTING, CONNECTING, OBSIDIAN),
    OBSIDIAN_CHISELED_CREEPER("Chiseled Obsidian Creeper Face", () -> Blocks.OBSIDIAN, NORMAL, NONE, OBSIDIAN),
    OBSIDIAN_CHISELED_SKELETON("Chiseled Obsidian Skeleton Face", () -> Blocks.OBSIDIAN, NORMAL, NONE, OBSIDIAN),
    PRISMARINE_BRICKS_BEAMS("Prismarine Brick Beams", () -> Blocks.PRISMARINE_BRICKS, NON_CONNECTING, CONNECTING, PRISMARINE_BRICKS),
    PRISMARINE_BRICKS_BRICKS("Prismarine Bricks", () -> Blocks.PRISMARINE_BRICKS, NON_CONNECTING, CONNECTING, PRISMARINE_BRICKS),
    PRISMARINE_BRICKS_CHISELED_CIRCLES("Chiseled Prismarine Brick Circles", () -> Blocks.PRISMARINE_BRICKS, NON_CONNECTING, CONNECTING, PRISMARINE_BRICKS),
    PRISMARINE_BRICKS_CHISELED_SQUARES("Chiseled Prismarine Brick Squares", () -> Blocks.PRISMARINE_BRICKS, NON_CONNECTING, CONNECTING, PRISMARINE_BRICKS),
    PRISMARINE_BRICKS_DIAGONAL_BRICKS("Diagonal Prismarine Bricks", () -> Blocks.PRISMARINE_BRICKS, NON_CONNECTING, CONNECTING, PRISMARINE_BRICKS),
    PRISMARINE_BRICKS_DIAGONAL_TILES("Diagonal Prismarine Brick Tiles", () -> Blocks.PRISMARINE_BRICKS, NON_CONNECTING, CONNECTING, PRISMARINE_BRICKS),
    PRISMARINE_BRICKS_DOTTED("Dotted Prismarine Bricks", () -> Blocks.PRISMARINE_BRICKS, NON_CONNECTING, CONNECTING, PRISMARINE_BRICKS),
    PRISMARINE_BRICKS_PILLARS("Prismarine Brick Pillars", () -> Blocks.PRISMARINE_BRICKS, NON_CONNECTING, CONNECTING, PRISMARINE_BRICKS),
    PRISMARINE_BRICKS_POLISHED("Polished Prismarine Bricks", () -> Blocks.PRISMARINE_BRICKS, NON_CONNECTING, CONNECTING, PRISMARINE_BRICKS),
    PRISMARINE_BRICKS_ROWS("Prismarine Brick Rows", () -> Blocks.PRISMARINE_BRICKS, NON_CONNECTING, CONNECTING, PRISMARINE_BRICKS),
    PRISMARINE_BRICKS_SMALL_TILES("Small Prismarine Brick Tiles", () -> Blocks.PRISMARINE_BRICKS, NON_CONNECTING, CONNECTING, PRISMARINE_BRICKS),
    PRISMARINE_BRICKS_SQUARES("Prismarine Brick Squares", () -> Blocks.PRISMARINE_BRICKS, NON_CONNECTING, CONNECTING, PRISMARINE_BRICKS),
    PRISMARINE_BRICKS_TILES("Prismarine Brick Tiles", () -> Blocks.PRISMARINE_BRICKS, NON_CONNECTING, CONNECTING, PRISMARINE_BRICKS),
    PRISMARINE_BRICKS_WAVY("Wavy Prismarine Bricks", () -> Blocks.PRISMARINE_BRICKS, NON_CONNECTING, CONNECTING, PRISMARINE_BRICKS),
    PRISMARINE_BRICKS_WOVEN("Woven Prismarine Bricks", () -> Blocks.PRISMARINE_BRICKS, NON_CONNECTING, CONNECTING, PRISMARINE_BRICKS),
    PURPUR_BRICKS("Purpur Bricks", () -> Blocks.PURPUR_BLOCK, NON_CONNECTING, CONNECTING, PURPUR_BLOCK),
    PURPUR_DIAGONAL_BRICKS("Diagonal Purpur Bricks", () -> Blocks.PURPUR_BLOCK, NON_CONNECTING, CONNECTING, PURPUR_BLOCK),
    PURPUR_DIAGONAL_TILES("Diagonal Purpur Tiles", () -> Blocks.PURPUR_BLOCK, NON_CONNECTING, CONNECTING, PURPUR_BLOCK),
    PURPUR_DOTTED("Dotted Purpur Block", () -> Blocks.PURPUR_BLOCK, NON_CONNECTING, CONNECTING, PURPUR_BLOCK),
    PURPUR_FABRIC("Purpur Fabric", () -> Blocks.PURPUR_BLOCK, NON_CONNECTING, CONNECTING, PURPUR_BLOCK),
    PURPUR_JAGGED_PATTERN("Jagged Purpur Pattern", () -> Blocks.PURPUR_BLOCK, NON_CONNECTING, CONNECTING, PURPUR_BLOCK),
    PURPUR_LARGE_TILES("Large Purpur Tiles", () -> Blocks.PURPUR_BLOCK, NON_CONNECTING, CONNECTING, PURPUR_BLOCK),
    PURPUR_ORGANIC_PATTERN("Organic Purpur Pattern", () -> Blocks.PURPUR_BLOCK, NON_CONNECTING, CONNECTING, PURPUR_BLOCK),
    PURPUR_PILLAR("Sided Purpur Pillar", () -> Blocks.PURPUR_BLOCK, NON_CONNECTING, CONNECTING, PURPUR_BLOCK),
    PURPUR_ROTATED_BRICKS("Rotated Purpur Bricks", () -> Blocks.PURPUR_BLOCK, NON_CONNECTING, CONNECTING, PURPUR_BLOCK),
    PURPUR_SLANTED_TILES("Slanted Purpur Tiles", () -> Blocks.PURPUR_BLOCK, NON_CONNECTING, CONNECTING, PURPUR_BLOCK),
    PURPUR_SMALL_TILES("Small Purpur Tiles", () -> Blocks.PURPUR_BLOCK, NON_CONNECTING, CONNECTING, PURPUR_BLOCK),
    PURPUR_SPIRAL_PATTERN("Spiral Purpur Pattern", () -> Blocks.PURPUR_BLOCK, NON_CONNECTING, CONNECTING, PURPUR_BLOCK),
    PURPUR_SQUARES("Purpur Squares", () -> Blocks.PURPUR_BLOCK, NON_CONNECTING, CONNECTING, PURPUR_BLOCK),
    PURPUR_TILES("Purpur Block", () -> Blocks.PURPUR_BLOCK, USE_PARENT, CONNECTING, PURPUR_BLOCK),
    PURPUR_WOVEN("Woven Purpur Block", () -> Blocks.PURPUR_BLOCK, NON_CONNECTING, CONNECTING, PURPUR_BLOCK),
    QUARTZ_BLOCK_BORDERED("Bordered Quartz Block", () -> Blocks.QUARTZ_BLOCK, NON_CONNECTING, CONNECTING, QUARTZ_BLOCK),
    QUARTZ_BLOCK_CHISELED_PILLAR("Chiseled Quartz Pillar", () -> Blocks.QUARTZ_BLOCK, NON_CONNECTING, CONNECTING, QUARTZ_BLOCK),
    QUARTZ_BLOCK_CHISELED_SQUARES("Chiseled Quartz Block Squares", () -> Blocks.QUARTZ_BLOCK, NORMAL, NONE, QUARTZ_BLOCK),
    QUARTZ_BLOCK_CONNECTING("Quartz Block", () -> Blocks.QUARTZ_BLOCK, USE_PARENT, CONNECTING, QUARTZ_BLOCK),
    QUARTZ_BLOCK_CROSSES("Quartz Block Crosses", () -> Blocks.QUARTZ_BLOCK, NON_CONNECTING, CONNECTING, QUARTZ_BLOCK),
    QUARTZ_BLOCK_DIAGONAL_TILES("Quartz Block", () -> Blocks.QUARTZ_BLOCK, NON_CONNECTING, CONNECTING, QUARTZ_BLOCK),
    QUARTZ_BLOCK_PATTERN("Quartz Block Pattern", () -> Blocks.QUARTZ_BLOCK, NON_CONNECTING, CONNECTING, QUARTZ_BLOCK),
    QUARTZ_BLOCK_ROWS("Quartz Block Rows", () -> Blocks.QUARTZ_BLOCK, NON_CONNECTING, CONNECTING, QUARTZ_BLOCK),
    QUARTZ_BLOCK_SCALES("Quartz Block Scales", () -> Blocks.QUARTZ_BLOCK, NON_CONNECTING, CONNECTING, QUARTZ_BLOCK),
    QUARTZ_BLOCK_SMALL_TILES("Small Quartz Block Tiles", () -> Blocks.QUARTZ_BLOCK, NON_CONNECTING, CONNECTING, QUARTZ_BLOCK),
    QUARTZ_BLOCK_SQUARES("Quartz Block Squares", () -> Blocks.QUARTZ_BLOCK, NON_CONNECTING, CONNECTING, QUARTZ_BLOCK),
    QUARTZ_BLOCK_STRIPES("Quartz Block Stripes", () -> Blocks.QUARTZ_BLOCK, NON_CONNECTING, CONNECTING, QUARTZ_BLOCK),
    QUARTZ_BLOCK_TILES("Quartz Block Tiles", () -> Blocks.QUARTZ_BLOCK, NON_CONNECTING, CONNECTING, QUARTZ_BLOCK),
    RED_NETHER_BRICKS_BEAMS("Nether Brick Beams", () -> Blocks.RED_NETHER_BRICKS, NON_CONNECTING, CONNECTING, RED_NETHER_BRICKS),
    RED_NETHER_BRICKS_CHISELED_SQUARES("Chiseled Nether Brick Squares", () -> Blocks.RED_NETHER_BRICKS, NON_CONNECTING, CONNECTING, RED_NETHER_BRICKS),
    RED_NETHER_BRICKS_DIAGONAL_BRICKS("Diagonal Nether Bricks", () -> Blocks.RED_NETHER_BRICKS, NON_CONNECTING, CONNECTING, RED_NETHER_BRICKS),
    RED_NETHER_BRICKS_LARGE_BRICKS("Large Red Nether Bricks", () -> Blocks.RED_NETHER_BRICKS, NON_CONNECTING, CONNECTING, RED_NETHER_BRICKS),
    RED_NETHER_BRICKS_LARGE_TILES("Large Red Nether Brick Tiles", () -> Blocks.RED_NETHER_BRICKS, NON_CONNECTING, CONNECTING, RED_NETHER_BRICKS),
    RED_NETHER_BRICKS_ROTATED_BRICKS("Rotated Nether Bricks", () -> Blocks.RED_NETHER_BRICKS, NON_CONNECTING, CONNECTING, RED_NETHER_BRICKS),
    RED_NETHER_BRICKS_SMALL_TILES("Small Red Nether Brick Tiles", () -> Blocks.RED_NETHER_BRICKS, NON_CONNECTING, CONNECTING, RED_NETHER_BRICKS),
    RED_NETHER_BRICKS_SMOOTH("Nether Bricks Smooth", () -> Blocks.RED_NETHER_BRICKS, NON_CONNECTING, CONNECTING, RED_NETHER_BRICKS),
    RED_NETHER_BRICKS_SQUARES("Nether Brick Squares", () -> Blocks.RED_NETHER_BRICKS, NON_CONNECTING, CONNECTING, RED_NETHER_BRICKS),
    RED_NETHER_BRICKS_TILES("Red Nether Brick Tiles", () -> Blocks.RED_NETHER_BRICKS, NON_CONNECTING, CONNECTING, RED_NETHER_BRICKS),
    RED_SANDSTONE_BRICKS("Red Sandstone Bricks", () -> Blocks.RED_SANDSTONE, NON_CONNECTING, CONNECTING, RED_SANDSTONE),
    RED_SANDSTONE_DIAGONAL_BRICKS("Diagonal Red Sandstone Bricks", () -> Blocks.RED_SANDSTONE, NON_CONNECTING, CONNECTING, RED_SANDSTONE),
    RED_SANDSTONE_LARGE_TILES("Large Red Sandstone Tiles", () -> Blocks.RED_SANDSTONE, NON_CONNECTING, CONNECTING, RED_SANDSTONE),
    RED_SANDSTONE_POLISHED("Polished Red Sandstone", () -> Blocks.RED_SANDSTONE, NON_CONNECTING, CONNECTING, RED_SANDSTONE),
    RED_SANDSTONE_TILES("Red Sandstone Tiles", () -> Blocks.RED_SANDSTONE, NON_CONNECTING, CONNECTING, RED_SANDSTONE),
    SANDSTONE_BRICKS("Sandstone Bricks", () -> Blocks.SANDSTONE, NON_CONNECTING, CONNECTING, SANDSTONE),
    SANDSTONE_DIAGONAL_BRICKS("Diagonal Sandstone Bricks", () -> Blocks.SANDSTONE, NON_CONNECTING, CONNECTING, SANDSTONE),
    SANDSTONE_LARGE_TILES("Large Sandstone Tiles", () -> Blocks.SANDSTONE, NON_CONNECTING, CONNECTING, SANDSTONE),
    SANDSTONE_POLISHED("Polished Sandstone", () -> Blocks.SANDSTONE, NON_CONNECTING, CONNECTING, SANDSTONE),
    SANDSTONE_TILES("Sandstone Tiles", () -> Blocks.SANDSTONE, NON_CONNECTING, CONNECTING, SANDSTONE),
    SPRUCE_PLANKS_BEAMS("Spruce Plank Beams", () -> Blocks.SPRUCE_PLANKS, NON_CONNECTING, CONNECTING, SPRUCE_PLANKS),
    SPRUCE_PLANKS_BRICKS("Spruce Plank Bricks", () -> Blocks.SPRUCE_PLANKS, NON_CONNECTING, CONNECTING, SPRUCE_PLANKS),
    SPRUCE_PLANKS_CRATE("Spruce Planks Crate", () -> Blocks.SPRUCE_PLANKS, NON_CONNECTING, CONNECTING, SPRUCE_PLANKS),
    SPRUCE_PLANKS_DIAGONAL_STRIPES("Diagonal Spruce Plank Stripes", () -> Blocks.SPRUCE_PLANKS, NON_CONNECTING, CONNECTING, SPRUCE_PLANKS),
    SPRUCE_PLANKS_DIAGONAL_TILES("Diagonal Spruce Plank Tiles", () -> Blocks.SPRUCE_PLANKS, NON_CONNECTING, CONNECTING, SPRUCE_PLANKS),
    SPRUCE_PLANKS_DOTTED("Dotted Spruce Planks", () -> Blocks.SPRUCE_PLANKS, NON_CONNECTING, CONNECTING, SPRUCE_PLANKS),
    SPRUCE_PLANKS_FLOORING("Spruce Plank Flooring", () -> Blocks.SPRUCE_PLANKS, NON_CONNECTING, CONNECTING, SPRUCE_PLANKS),
    SPRUCE_PLANKS_LARGE_TILES("Large Spruce Plank Tiles", () -> Blocks.SPRUCE_PLANKS, NON_CONNECTING, CONNECTING, SPRUCE_PLANKS),
    SPRUCE_PLANKS_PATTERN("Spruce Plank Pattern", () -> Blocks.SPRUCE_PLANKS, NON_CONNECTING, CONNECTING, SPRUCE_PLANKS),
    SPRUCE_PLANKS_SMALL_BRICKS("Small Spruce Plank Bricks", () -> Blocks.SPRUCE_PLANKS, NON_CONNECTING, CONNECTING, SPRUCE_PLANKS),
    SPRUCE_PLANKS_SMALL_TILES("Small Spruce Plank Tiles", () -> Blocks.SPRUCE_PLANKS, NON_CONNECTING, CONNECTING, SPRUCE_PLANKS),
    SPRUCE_PLANKS_SQUARES("Spruce Plank Squares", () -> Blocks.SPRUCE_PLANKS, NON_CONNECTING, CONNECTING, SPRUCE_PLANKS),
    SPRUCE_PLANKS_TILES("Spruce Plank Tiles", () -> Blocks.SPRUCE_PLANKS, NON_CONNECTING, CONNECTING, SPRUCE_PLANKS),
    SPRUCE_PLANKS_WAVY("Wavy Spruce Planks", () -> Blocks.SPRUCE_PLANKS, NON_CONNECTING, CONNECTING, SPRUCE_PLANKS),
    SPRUCE_PLANKS_WOVEN("Woven Spruce Planks", () -> Blocks.SPRUCE_PLANKS, NON_CONNECTING, CONNECTING, SPRUCE_PLANKS),
    STONE_BIG_TILES("Large Stone Tiles", () -> Blocks.STONE, NON_CONNECTING, CONNECTING, STONE),
    STONE_BORDERED("Bordered Stone", () -> Blocks.STONE, NON_CONNECTING, CONNECTING, STONE),
    STONE_CHISELED_BRICKS("Chiseled Stone Bricks", () -> Blocks.CHISELED_STONE_BRICKS, USE_PARENT, CONNECTING, STONE),
    STONE_CRUSHED("Crushed Stone", () -> Blocks.STONE, NON_CONNECTING, CONNECTING, STONE),
    STONE_DIAGONAL_BRICKS("Diagonal Stone Bricks", () -> Blocks.STONE, NON_CONNECTING, CONNECTING, STONE),
    STONE_PATH("Stone Path", () -> Blocks.STONE, NON_CONNECTING, CONNECTING, STONE),
    STONE_ROTATED_BRICKS("Rotated Stone Bricks", () -> Blocks.STONE, NON_CONNECTING, CONNECTING, STONE),
    STONE_SMALL_BRICKS("Small Stone Bricks", () -> Blocks.STONE_BRICKS, NON_CONNECTING, CONNECTING, STONE),
    STONE_SMALL_TILES("Small Stone Tiles", () -> Blocks.STONE, NON_CONNECTING, CONNECTING, STONE),
    STONE_SMOOTH("Smooth Stone", () -> Blocks.SMOOTH_STONE, USE_PARENT, CONNECTING, STONE),
    STONE_SMOOTH_LARGE_TILES("Large Smooth Stone Tiles", () -> Blocks.SMOOTH_STONE, NON_CONNECTING, CONNECTING, STONE),
    STONE_SMOOTH_TILES("Smooth Stone Tiles", () -> Blocks.SMOOTH_STONE, NON_CONNECTING, CONNECTING, STONE),
    STONE_SQUARES("Stone Squares", () -> Blocks.STONE, NON_CONNECTING, CONNECTING, STONE),
    STONE_TILES("Stone Tiles", () -> Blocks.STONE, NON_CONNECTING, CONNECTING, STONE),
    STONE_WAVES("Stone Waves", () -> Blocks.STONE, NON_CONNECTING, CONNECTING, STONE);

    public final String regularRegistryName;
    public final String connectingRegistryName;
    public final String englishTranslation;
    public final Supplier<Block> parentBlock;
    public final BlockOption regularBlockMode;
    public final BlockOption connectingBlockMode;
    public final ResourceLocation[] recipes;

    private Block regularBlock;
    private Block connectingBlock;
    private BlockItem regularItem;
    private BlockItem connectingItem;

    RechiseledBlockType(String englishTranslation, Supplier<Block> parentBlock, BlockOption regularBlockMode, BlockOption connectingBlockMode, ResourceLocation... recipes){
        this.regularRegistryName = this.name().toLowerCase(Locale.ROOT);
        this.connectingRegistryName = this.name().toLowerCase(Locale.ROOT) + "_connecting";
        this.englishTranslation = englishTranslation;
        this.parentBlock = parentBlock;
        this.regularBlockMode = regularBlockMode;
        this.connectingBlockMode = connectingBlockMode;
        this.recipes = recipes;
    }

    public void createBlocks(){
        if(!this.regularBlockMode.createNewBlock && !this.connectingBlockMode.createNewBlock)
            throw new IllegalStateException("Block type '" + this.regularRegistryName + "' must create at least one new block!");
        if(this.regularBlock != null || this.connectingBlock != null)
            throw new IllegalStateException("Blocks for '" + this.regularRegistryName + "' have already been created!");

        if(this.regularBlockMode.createNewBlock)
            this.regularBlock = new InheritingRechiseledBlock(this.regularRegistryName, this.regularBlockMode == CONNECTING, this.parentBlock.get());
        else if(this.regularBlockMode == USE_PARENT)
            this.regularBlock = this.parentBlock.get();
        if(this.connectingBlockMode.createNewBlock)
            this.connectingBlock = new InheritingRechiseledBlock(this.connectingRegistryName, this.connectingBlockMode == CONNECTING, this.parentBlock.get());
        else if(this.connectingBlockMode == USE_PARENT)
            this.connectingBlock = this.parentBlock.get();
    }

    public void createItems(){
        if(this.connectingBlock == null && this.regularBlock == null)
            throw new IllegalStateException("Blocks for '" + this.regularRegistryName + "' must be created before the item!");
        if(this.regularItem != null || this.connectingItem != null)
            throw new IllegalStateException("Items for '" + this.regularRegistryName + "' have already been created!");

        if(this.regularBlockMode.createNewBlock){
            this.regularItem = new BlockItem(this.regularBlock, new Item.Properties().tab(Rechiseled.GROUP));
            this.regularItem.setRegistryName(this.regularRegistryName);
        }else if(this.regularBlockMode == USE_PARENT)
            this.regularItem = (BlockItem)this.regularBlock.asItem();
        if(this.connectingBlockMode.createNewBlock){
            this.connectingItem = new BlockItem(this.connectingBlock, new Item.Properties().tab(Rechiseled.GROUP));
            this.connectingItem.setRegistryName(this.connectingRegistryName);
        }else if(this.connectingBlockMode == USE_PARENT)
            this.connectingItem = (BlockItem)this.connectingBlock.asItem();
    }

    public boolean hasRegularBlock(){
        return this.regularBlock != null;
    }

    public boolean hasConnectingBlock(){
        return this.connectingBlock != null;
    }

    public Block getRegularBlock(){
        return this.regularBlock;
    }

    public Block getConnectingBlock(){
        return this.connectingBlock;
    }

    public BlockItem getRegularItem(){
        return this.regularItem;
    }

    public BlockItem getConnectingItem(){
        return this.connectingItem;
    }

    public boolean hasCreatedRegularBlock(){
        return this.regularBlockMode.createNewBlock;
    }

    public boolean hasCreatedConnectingBlock(){
        return this.connectingBlockMode.createNewBlock;
    }

    public enum BlockOption {
        /**
         * Create a new block with a vanilla block model
         */
        NORMAL(true),
        /**
         * Create a new block with a texture sheet, but without connecting textures
         */
        NON_CONNECTING(true),
        /**
         * Create a new block with a texture sheet and connecting textures
         */
        CONNECTING(true),
        /**
         * Use the parent block
         */
        USE_PARENT(false),
        /**
         * No entry
         */
        NONE(false);

        public final boolean createNewBlock;

        BlockOption(boolean createNewBlock){
            this.createNewBlock = createNewBlock;
        }
    }
}
