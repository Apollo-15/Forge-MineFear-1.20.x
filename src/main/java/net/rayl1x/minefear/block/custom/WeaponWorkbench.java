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
    public boolean isCollisionShapeFullBlock(BlockState state, BlockGetter level, BlockPos pos) {
        return true;
    }


}

