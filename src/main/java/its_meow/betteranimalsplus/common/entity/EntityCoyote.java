package its_meow.betteranimalsplus.common.entity;

import com.google.common.base.Predicates;

import its_meow.betteranimalsplus.common.entity.util.EntityTypeContainerBAPTameable;
import its_meow.betteranimalsplus.init.ModEntities;
import net.minecraft.entity.AgeableEntity;
import net.minecraft.entity.ILivingEntityData;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.SpawnReason;
import net.minecraft.entity.ai.goal.BreedGoal;
import net.minecraft.entity.ai.goal.FollowOwnerGoal;
import net.minecraft.entity.ai.goal.HurtByTargetGoal;
import net.minecraft.entity.ai.goal.LeapAtTargetGoal;
import net.minecraft.entity.ai.goal.LookAtGoal;
import net.minecraft.entity.ai.goal.MeleeAttackGoal;
import net.minecraft.entity.ai.goal.NearestAttackableTargetGoal;
import net.minecraft.entity.ai.goal.NonTamedTargetGoal;
import net.minecraft.entity.ai.goal.OwnerHurtByTargetGoal;
import net.minecraft.entity.ai.goal.OwnerHurtTargetGoal;
import net.minecraft.entity.ai.goal.SitGoal;
import net.minecraft.entity.ai.goal.SwimGoal;
import net.minecraft.entity.ai.goal.WaterAvoidingRandomWalkingGoal;
import net.minecraft.entity.merchant.villager.VillagerEntity;
import net.minecraft.entity.monster.AbstractIllagerEntity;
import net.minecraft.entity.monster.AbstractSkeletonEntity;
import net.minecraft.entity.monster.CreeperEntity;
import net.minecraft.entity.monster.GhastEntity;
import net.minecraft.entity.passive.AnimalEntity;
import net.minecraft.entity.passive.ChickenEntity;
import net.minecraft.entity.passive.RabbitEntity;
import net.minecraft.entity.passive.SheepEntity;
import net.minecraft.entity.passive.horse.AbstractHorseEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Food;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.SpawnEggItem;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.util.Hand;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.SoundEvents;
import net.minecraft.util.text.TranslationTextComponent;
import net.minecraft.world.Difficulty;
import net.minecraft.world.IWorld;
import net.minecraft.world.World;

public class EntityCoyote extends EntityFeralWolf {

    public static boolean HOSTILE_DAYTIME = false;

    public EntityCoyote(World worldIn) {
        super(ModEntities.COYOTE.entityType, worldIn);
        this.setTamed(false);
    }

    @Override
    protected void registerGoals() {
        this.sitGoal = new SitGoal(this);
        this.goalSelector.addGoal(1, new SwimGoal(this));
        this.goalSelector.addGoal(2, this.sitGoal);
        this.goalSelector.addGoal(3, new BreedGoal(this, 1D));
        this.goalSelector.addGoal(4, new LeapAtTargetGoal(this, 0.4F));
        this.goalSelector.addGoal(5, new MeleeAttackGoal(this, 1.0D, true));
        this.goalSelector.addGoal(6, new FollowOwnerGoal(this, 1.0D, 10.0F, 2.0F, false));
        this.goalSelector.addGoal(8, new WaterAvoidingRandomWalkingGoal(this, 1.0D));
        this.goalSelector.addGoal(10, new LookAtGoal(this, PlayerEntity.class, 8.0F));
        this.targetSelector.addGoal(1, new OwnerHurtByTargetGoal(this));
        this.targetSelector.addGoal(2, new OwnerHurtTargetGoal(this));
        this.targetSelector.addGoal(3, new HurtByTargetGoal(this, new Class[0]));
        this.targetSelector.addGoal(4, new NonTamedTargetGoal<PlayerEntity>(this, PlayerEntity.class, false, e -> e.world.getDifficulty() != Difficulty.PEACEFUL));
        this.targetSelector.addGoal(4, new NonTamedTargetGoal<AnimalEntity>(this, AnimalEntity.class, false, e -> e instanceof SheepEntity || e instanceof RabbitEntity));
        this.targetSelector.addGoal(4, new NonTamedTargetGoal<VillagerEntity>(this, VillagerEntity.class, false, Predicates.alwaysTrue()));
        this.targetSelector.addGoal(4, new NonTamedTargetGoal<AbstractIllagerEntity>(this, AbstractIllagerEntity.class, false, Predicates.alwaysTrue()));
        this.targetSelector.addGoal(4, new NonTamedTargetGoal<ChickenEntity>(this, ChickenEntity.class, false, Predicates.alwaysTrue()));
        this.targetSelector.addGoal(5, new NearestAttackableTargetGoal<AbstractSkeletonEntity>(this, AbstractSkeletonEntity.class, false));
    }

    @Override
    public ILivingEntityData initAgeableData(IWorld world, SpawnReason reason, ILivingEntityData livingdata) {
        return livingdata;
    }

    @Override
    public void writeType(CompoundNBT nbt) {
    }

    @Override
    public void readType(CompoundNBT nbt) {
    }

    public boolean isDaytime() {
        long time = this.world.getDayTime() % 24000L; // Time can go over values of 24000, so divide and take the remainder
        return !(time >= 13000L && time <= 23000L);
    }

    @Override
    public void setAttackTarget(LivingEntity entitylivingbaseIn) {
        if(!this.isDaytime() || HOSTILE_DAYTIME) {
            super.setAttackTarget(entitylivingbaseIn);
        } else if(!this.isTamed()) {
            super.setAttackTarget(null);
        } else {
            super.setAttackTarget(entitylivingbaseIn);
        }
        if(this.world.getDifficulty() == Difficulty.PEACEFUL) {
            super.setAttackTarget(null);
        }
    }

    @Override
    protected SoundEvent getAmbientSound() {
        if((!this.isDaytime() || HOSTILE_DAYTIME) && !this.isTamed()) {
            return SoundEvents.ENTITY_WOLF_GROWL;
        } else if(this.rand.nextInt(3) == 0) {
            return this.isTamed() && this.dataManager.get(EntityFeralWolf.DATA_HEALTH_ID).floatValue() < 10.0F ? SoundEvents.ENTITY_WOLF_WHINE : SoundEvents.ENTITY_WOLF_PANT;
        } else if(this.getAttackTarget() != null) {
            return SoundEvents.ENTITY_WOLF_GROWL;
        }
        return null;
    }

    @Override
    public boolean processInteract(PlayerEntity player, Hand hand) {
        ItemStack itemstack = player.getHeldItem(hand);

        if(this.isTamed()) {
            if(!itemstack.isEmpty()) {
                if(itemstack.getItem().isFood()) {
                    Food food = itemstack.getItem().getFood();

                    if(food.isMeat()
                    && this.dataManager.get(EntityFeralWolf.DATA_HEALTH_ID).floatValue() < 20.0F) {
                        if(!player.isCreative()) {
                            itemstack.shrink(1);
                        }

                        this.heal(food.getHealing());
                        return true;
                    }
                }
            }

            if(this.isOwner(player) && !this.world.isRemote && !this.isBreedingItem(itemstack) && (!(itemstack.getItem().isFood()) || !itemstack.getItem().getFood().isMeat())) {
                this.sitGoal.setSitting(!this.isSitting());
                this.isJumping = false;
                this.navigator.clearPath();
                this.setAttackTarget((LivingEntity) null);
            }
        } else if(this.isTamingItem(itemstack.getItem())) {
            if(HOSTILE_DAYTIME) {
                if(!this.world.isRemote) {
                    player.sendMessage(new TranslationTextComponent("entity.betteranimalsplus.coyote.message.always_hostile"));
                }
            } else if(this.isDaytime()) {

                if(!player.isCreative()) {
                    itemstack.shrink(1);
                }

                if(!this.world.isRemote) {
                    if(this.rand.nextInt(100) <= 14 && !net.minecraftforge.event.ForgeEventFactory.onAnimalTame(this, player)) {
                        this.setTamedBy(player);
                        this.navigator.clearPath();
                        this.setAttackTarget((LivingEntity) null);
                        this.sitGoal.setSitting(true);
                        this.setHealth(20.0F);
                        this.world.setEntityState(this, (byte) 7);
                    } else {
                        this.world.setEntityState(this, (byte) 6);
                    }
                }

                return true;
            } else {
                if(!this.world.isRemote) {
                    player.sendMessage(new TranslationTextComponent("entity.betteranimalsplus.coyote.message.currently_hostile"));
                }
                return true;
            }
        }
        if(this.isBreedingItem(itemstack)) {
            if(this.getGrowingAge() == 0 && this.canBreed()) {
                this.consumeItemFromStack(player, itemstack);
                this.setInLove(player);
                return true;
            }

            if(this.isChild()) {
                this.consumeItemFromStack(player, itemstack);
                this.ageUp((int) ((float) (-this.getGrowingAge() / 20) * 0.1F), true);
                return true;
            }
        }

        Item item = itemstack.getItem();
        if(item instanceof SpawnEggItem && ((SpawnEggItem) item).hasType(itemstack.getTag(), this.getType())) {
            if(!this.world.isRemote) {
                AgeableEntity ageableentity = this.createChild(this);
                if(ageableentity != null) {
                    ageableentity.setGrowingAge(-24000);
                    ageableentity.setLocationAndAngles(this.getPosX(), this.getPosY(), this.getPosZ(), 0.0F, 0.0F);
                    this.world.addEntity(ageableentity);
                    if(itemstack.hasDisplayName()) {
                        ageableentity.setCustomName(itemstack.getDisplayName());
                    }

                    this.onChildSpawnFromEgg(player, ageableentity);
                    if(!player.abilities.isCreativeMode) {
                        itemstack.shrink(1);
                    }
                }
            }

            return true;
        } else {
            return false;
        }
    }

    @Override
    public EntityTypeContainerBAPTameable<EntityCoyote> getContainer() {
        return ModEntities.COYOTE;
    }

    @Override
    public boolean shouldAttackEntity(LivingEntity target, LivingEntity owner) {
        if(!(target instanceof CreeperEntity) && !(target instanceof GhastEntity) && (this.isTamed() || !this.isDaytime() || HOSTILE_DAYTIME)) {
            if(target instanceof EntityCoyote) {
                EntityCoyote entityferalwolf = (EntityCoyote) target;

                if(entityferalwolf.isTamed() && entityferalwolf.getOwner() == owner) {
                    return false;
                }
            }

            if(target instanceof PlayerEntity && owner instanceof PlayerEntity && !((PlayerEntity) owner).canAttackPlayer((PlayerEntity) target)) {
                return false;
            } else {
                return !(target instanceof AbstractHorseEntity) || !((AbstractHorseEntity) target).isTame();
            }
        } else {
            return false;
        }
    }

    @Override
    protected ResourceLocation getLootTable() {
        return null;
    }

    @Override
    public AgeableEntity createChild(AgeableEntity ageable) {
        EntityCoyote coyote = this.getBaseChild();
        if(this.isTamed()) {
            coyote.setTamed(true);
            coyote.setOwnerId(this.getOwnerId());
        }
        return coyote;
    }

    @Override
    protected EntityCoyote getBaseChild() {
        return new EntityCoyote(this.world);
    }
}
