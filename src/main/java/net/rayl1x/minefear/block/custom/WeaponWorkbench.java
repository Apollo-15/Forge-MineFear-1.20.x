package net.rayl1x.minefear.block.custom;

import net.minecraft.core.BlockPos;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.phys.shapes.*;
import net.minecraft.world.phys.shapes.VoxelShape;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.BooleanOp;
import net.minecraft.world.level.BlockGetter;


import java.util.stream.Stream;

public class WeaponWorkbench extends Block {
    public WeaponWorkbench(Properties pProperties) {
        super(pProperties);
    }

    @Override
    public InteractionResult use(BlockState pState, Level pLevel, BlockPos pPos, Player pPlayer,
                                 InteractionHand pHand, BlockHitResult pHit) {
        pLevel.playSound(pPlayer, pPos, SoundEvents.NOTE_BLOCK_BANJO.get(), SoundSource.BLOCKS,
                1f, 1f);
        return InteractionResult.SUCCESS;
    }

    @Override
    public VoxelShape getShape(BlockState pState, BlockGetter pLevel, BlockPos pPos, CollisionContext pContext) {
        return Stream.of(
                Block.box(0, 15, 1, 29, 16, 13),
                Block.box(-1, 2, 1, 0, 14, 13),
                Block.box(0, 2, 1, 20, 3, 13),
                Block.box(30, 0, 1, 31, 31, 14),
                Block.box(31, 1, 2, 32, 30, 13),
                Block.box(20, 0, 1, 21, 15, 13),
                Block.box(21, 4, 2, 29, 9, 3),
                Block.box(21, 0, 1, 29, 5, 2),
                Block.box(21, 9, 1, 29, 12, 2),
                Block.box(0, 3, 15, 29, 30, 16),
                Block.box(21, 0, 2, 30, 1, 13)
        ).reduce((v1, v2) -> Shapes.join(v1, v2, BooleanOp.OR)).get();
    }

    @Override
    public boolean isCollisionShapeFullBlock(BlockState state, BlockGetter level, BlockPos pos) {
        return false;
    }


}

