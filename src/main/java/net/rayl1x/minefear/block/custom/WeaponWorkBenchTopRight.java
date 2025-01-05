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

public class WeaponWorkBenchTopRight extends Block {
    public WeaponWorkBenchTopRight(Properties properties) {
        super(properties);
    }

    @Override
    public VoxelShape getShape(BlockState pState, BlockGetter pLevel, BlockPos pPos, CollisionContext pContext) {
        return Stream.of(
                Block.box(0, 0, 13, 1, 11, 14),
                Block.box(0, 0, 12, 1, 11, 13),
                Block.box(1, 0, 14, 2, 11, 15),
                Block.box(0, 0, 14, 1, 10, 15),
                Block.box(2, 10, 14, 15, 11, 15),
                Block.box(1, 10, 13, 15, 12, 14),
                Block.box(1, 11, 12, 15, 12, 13),
                Block.box(2, 0, 14, 15, 10, 15),
                Block.box(1, 0, 15, 15, 10, 16),
                Block.box(1, 0, 13, 2, 10, 14)
        ).reduce((v1, v2) -> Shapes.join(v1, v2, BooleanOp.OR)).get();
    }
}
