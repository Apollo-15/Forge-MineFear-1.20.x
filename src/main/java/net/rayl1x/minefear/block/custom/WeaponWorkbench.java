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
                Block.box(0, 11, 1, 29, 12, 13),
                Block.box(-1, 2, 1, 0, 10, 13),
                Block.box(0, 2, 1, 20, 3, 13),
                Block.box(-1, 0, 1, 0, 2, 2),
                Block.box(30, 0, 1, 31, 27, 14),
                Block.box(31, 1, 2, 32, 26, 13),
                Block.box(20, 0, 1, 21, 11, 13),
                Block.box(21, 8, 2, 29, 11, 3),
                Block.box(21, 0, 2, 29, 5, 3),
                Block.box(21, 5, 1, 29, 8, 2),
                Block.box(21, 6, 2, 22, 8, 12),
                Block.box(0, 3, 15, 29, 26, 16),
                Block.box(21, 0, 3, 29, 1, 13)
        ).reduce((v1, v2) -> Shapes.join(v1, v2, BooleanOp.OR)).get();
    }
}
