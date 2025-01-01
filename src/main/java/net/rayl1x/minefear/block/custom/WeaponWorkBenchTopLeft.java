package net.rayl1x.minefear.block.custom;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.shapes.BooleanOp;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;

import java.util.stream.Stream;

public class WeaponWorkBenchTopLeft extends Block {
    public WeaponWorkBenchTopLeft(Properties properties) {
        super(properties);
    }

    @Override
    public VoxelShape getShape(BlockState pState, BlockGetter pLevel, BlockPos pPos, CollisionContext pContext) {
        return Stream.of(
                Block.box(16, 0, 0, 17, 11, 14),
                Block.box(0, 10, 14, 15, 11, 15),
                Block.box(0, 10, 13, 15, 12, 14),
                Block.box(0, 11, 12, 15, 12, 13),
                Block.box(15, 8, 0, 16, 12, 14),
                Block.box(0, 0, 14, 15, 10, 15),
                Block.box(0, 0, 15, 15, 10, 16),
                Block.box(15, 0, 0, 16, 8, 1),
                Block.box(15, 0, -1, 16, 11, 0)
        ).reduce((v1, v2) -> Shapes.join(v1, v2, BooleanOp.OR)).get();
    }
}
