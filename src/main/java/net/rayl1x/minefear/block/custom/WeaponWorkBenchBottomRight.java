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

public class WeaponWorkBenchBottomRight extends Block {
    public WeaponWorkBenchBottomRight(Properties properties) {
        super(properties);
    }

    @Override
    public VoxelShape getShape(BlockState pState, BlockGetter pLevel, BlockPos pPos, CollisionContext pContext) {
        return Stream.of(
                Block.box(1, 0, 0, 2, 14, 1),
                Block.box(2, 0, 0, 3, 14, 1),
                Block.box(1, 0, 13, 2, 16, 14),
                Block.box(1, 14, 12, 2, 16, 13),
                Block.box(2, 14, 13, 3, 16, 14),
                Block.box(1, 0, 14, 2, 16, 15),
                Block.box(1, 10, 1, 2, 14, 13),
                Block.box(2, 11, 1, 16, 12, 13),
                Block.box(2, 2, 13, 16, 14, 15),
                Block.box(2, 14, 14, 16, 16, 15),
                Block.box(2, 3, 15, 16, 16, 16),
                Block.box(1, 2, 1, 2, 10, 13),
                Block.box(0, 3, 1, 1, 13, 13),
                Block.box(2, 2, 1, 16, 3, 13)
        ).reduce((v1, v2) -> Shapes.join(v1, v2, BooleanOp.OR)).get();
    }
}
