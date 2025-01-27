package net.rayl1x.minefear.entity.custom;

import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.ai.goal.*;
import net.minecraft.world.entity.monster.Monster;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;

import javax.annotation.Nullable;

public class KnightEntity extends Monster {

    public KnightEntity(EntityType<? extends Monster> pEntityType, Level pLevel) {
        super(pEntityType, pLevel);
    }

    @Override
    protected void registerGoals() {
        // The mob will not move by default
        this.goalSelector.addGoal(0, new FloatGoal(this));
        this.goalSelector.addGoal(1, new RandomLookAroundGoal(this));

        // Watch the player and start moving if the player is staring at the mob
        this.goalSelector.addGoal(2, new LookAtPlayerGoal(this, Player.class, 5f));
        this.goalSelector.addGoal(3, new MoveTowardsTargetGoal(this, 1.0D, 1.0f));

        // Hostile goals, such as attacking the player
        this.goalSelector.addGoal(4, new MeleeAttackGoal(this, 1.0D, true));
    }

    @Override
    public void tick() {
        super.tick();
        // If the player is looking at the mob, it starts moving towards the player
        if (this.isLookingAtPlayer()) {
            this.setAggressive(true);  // The mob becomes aggressive
        } else {
            this.setAggressive(false);  // The mob is not aggressive if not being watched
        }
    }

    // Проверка, смотрит ли игрок на моба
    private boolean isLookingAtPlayer() {
        Player player = this.level().getNearestPlayer(this, 2); // Check within a radius of 2 blocks
        return player != null && player.hasLineOfSight(this); // If the player is within sight and looking at the mob
    }

    public static AttributeSupplier.Builder createAttributes() {
        return Monster.createMonsterAttributes()
                .add(Attributes.MAX_HEALTH, 50D)
                .add(Attributes.MOVEMENT_SPEED, 0.25D)
                .add(Attributes.ARMOR_TOUGHNESS, 0.2f)
                .add(Attributes.ATTACK_DAMAGE, 9f);
    }

    @Nullable
    public Monster getBreedOffspring(ServerLevel serverLevel, Monster ageableMob) {
        return null;
    }
}