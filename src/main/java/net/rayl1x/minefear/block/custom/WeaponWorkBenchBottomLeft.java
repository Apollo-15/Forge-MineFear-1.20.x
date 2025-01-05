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

public class WeaponWorkBenchBottomLeft extends Block {
    public WeaponWorkBenchBottomLeft(Properties properties) {
        super(properties);
    }

    @Override
    public VoxelShape getShape(BlockState pState, BlockGetter pLevel, BlockPos pPos, CollisionContext pContext) {
        return Stream.of(
                Block.box(15, 0, 14, 16, 16, 15),
                Block.box(16, 0, 0, 17, 16, 14),
                Block.box(0, 2, 13, 6, 14, 15),
                Block.box(6, 0, 13, 15, 14, 15),
                Block.box(7, 1, 15, 15, 3, 16),
                Block.box(0, 3, 15, 15, 16, 16),
                Block.box(6, 0, 1, 7, 11, 13),
                Block.box(0, 2, 1, 6, 3, 13),
                Block.box(7, 0, 3, 15, 1, 13),
                Block.box(7, 8, 2, 15, 11, 3),
                Block.box(7, 5, 1, 15, 8, 2),
                Block.box(7, 0, 2, 15, 5, 3),
                Block.box(15, 0, 0, 15, 16, 1),
                Block.box(15, 0, -1, 16, 16, 0),
                Block.box(0, 14, 14, 15, 16, 15),
                Block.box(0, 11, 1, 16, 12, 13)
        ).reduce((v1, v2) -> Shapes.join(v1, v2, BooleanOp.OR)).get();
    }
}
