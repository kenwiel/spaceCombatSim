package space.funin.hiveQueenQuest.spaceCombatSim;

import net.karneim.pojobuilder.GeneratePojoBuilder;
import space.funin.hiveQueenQuest.spaceCombatSim.enums.DamageType;
import space.funin.hiveQueenQuest.spaceCombatSim.enums.FireRate;
import space.funin.hiveQueenQuest.spaceCombatSim.enums.WeaponMount;
import javax.annotation.Generated;

public class Weapon {
	protected String weaponName;
	protected DamageType[] damageTypes;
	protected WeaponMount[] weaponMounts;
	protected WeaponMount weaponMount;

	protected float damageAmountBase;
	protected FireRate fireRateBase;
	protected float rangeBase;
	protected float accuracyBase;

	protected float shieldPenetrationFlatBase;
	protected float shieldPenetrationPercentageBase;
	protected float armorPenetrationFlatBase;
	protected float armorPenetrationPercentageBase;

	protected float onHitArmorThermalPenaltyBase;
	protected float onHitArmorEnergyPenaltyBase;
	protected float onHitArmorKineticPenaltyBase;
	protected float onHitArmorMissilePenaltyBase;
	protected float onHitShieldOverloadPercentageBonusBase;
	protected float onHitAccuracyPenaltyBase;
	protected float onHitDamageTakenBonusBase;
	protected int onHitStunDurationBase;

	protected float accuracyBonusSmallerTargetBase;
	protected float accuracyBonusBiggerTargetBase;
	protected boolean disableRandomSystemBase;

	protected float damageAmountModified;
	protected FireRate fireRateModified;
	protected float rangeModified;
	protected float accuracyModified;

	protected float shieldPenetrationFlatModified;
	protected float shieldPenetrationPercentageModified;
	protected float armorPenetrationFlatModified;
	protected float armorPenetrationPercentageModified;

	protected float onHitArmorThermalPenaltyModified;
	protected float onHitArmorEnergyPenaltyModified;
	protected float onHitArmorKineticPenaltyModified;
	protected float onHitArmorMissilePenaltyModified;
	protected float onHitShieldOverloadPercentageBonusModified;
	protected float onHitAccuracyPenaltyModified;
	protected float onHitDamageTakenBonusModified;
	protected int onHitStunDurationModified;

	protected float accuracyBonusSmallerTargetModified;
	protected float accuracyBonusBiggerTargetModified;
	protected boolean disableRandomSystemModified;
	@Generated("SparkTools")
	private Weapon(Builder builder) {
		this.weaponName = builder.weaponName;
		this.damageTypes = builder.damageTypes;
		this.weaponMounts = builder.weaponMounts;
		this.weaponMount = builder.weaponMount;
		this.damageAmountBase = builder.damageAmountBase;
		this.fireRateBase = builder.fireRateBase;
		this.rangeBase = builder.rangeBase;
		this.accuracyBase = builder.accuracyBase;
		this.shieldPenetrationFlatBase = builder.shieldPenetrationFlatBase;
		this.shieldPenetrationPercentageBase = builder.shieldPenetrationPercentageBase;
		this.armorPenetrationFlatBase = builder.armorPenetrationFlatBase;
		this.armorPenetrationPercentageBase = builder.armorPenetrationPercentageBase;
		this.onHitArmorThermalPenaltyBase = builder.onHitArmorThermalPenaltyBase;
		this.onHitArmorEnergyPenaltyBase = builder.onHitArmorEnergyPenaltyBase;
		this.onHitArmorKineticPenaltyBase = builder.onHitArmorKineticPenaltyBase;
		this.onHitArmorMissilePenaltyBase = builder.onHitArmorMissilePenaltyBase;
		this.onHitShieldOverloadPercentageBonusBase = builder.onHitShieldOverloadPercentageBonusBase;
		this.onHitAccuracyPenaltyBase = builder.onHitAccuracyPenaltyBase;
		this.onHitDamageTakenBonusBase = builder.onHitDamageTakenBonusBase;
		this.onHitStunDurationBase = builder.onHitStunDurationBase;
		this.accuracyBonusSmallerTargetBase = builder.accuracyBonusSmallerTargetBase;
		this.accuracyBonusBiggerTargetBase = builder.accuracyBonusBiggerTargetBase;
		this.disableRandomSystemBase = builder.disableRandomSystemBase;
		this.damageAmountModified = builder.damageAmountModified;
		this.fireRateModified = builder.fireRateModified;
		this.rangeModified = builder.rangeModified;
		this.accuracyModified = builder.accuracyModified;
		this.shieldPenetrationFlatModified = builder.shieldPenetrationFlatModified;
		this.shieldPenetrationPercentageModified = builder.shieldPenetrationPercentageModified;
		this.armorPenetrationFlatModified = builder.armorPenetrationFlatModified;
		this.armorPenetrationPercentageModified = builder.armorPenetrationPercentageModified;
		this.onHitArmorThermalPenaltyModified = builder.onHitArmorThermalPenaltyModified;
		this.onHitArmorEnergyPenaltyModified = builder.onHitArmorEnergyPenaltyModified;
		this.onHitArmorKineticPenaltyModified = builder.onHitArmorKineticPenaltyModified;
		this.onHitArmorMissilePenaltyModified = builder.onHitArmorMissilePenaltyModified;
		this.onHitShieldOverloadPercentageBonusModified = builder.onHitShieldOverloadPercentageBonusModified;
		this.onHitAccuracyPenaltyModified = builder.onHitAccuracyPenaltyModified;
		this.onHitDamageTakenBonusModified = builder.onHitDamageTakenBonusModified;
		this.onHitStunDurationModified = builder.onHitStunDurationModified;
		this.accuracyBonusSmallerTargetModified = builder.accuracyBonusSmallerTargetModified;
		this.accuracyBonusBiggerTargetModified = builder.accuracyBonusBiggerTargetModified;
		this.disableRandomSystemModified = builder.disableRandomSystemModified;
	}
	/**
	 * Creates builder to build {@link Weapon}.
	 * @return created builder
	 */
	@Generated("SparkTools")
	public static Builder builder() {
		return new Builder();
	}
	/**
	 * Builder to build {@link Weapon}.
	 */
	@Generated("SparkTools")
	public static final class Builder {
		private String weaponName;
		private DamageType[] damageTypes;
		private WeaponMount[] weaponMounts;
		private WeaponMount weaponMount;
		private float damageAmountBase;
		private FireRate fireRateBase;
		private float rangeBase;
		private float accuracyBase;
		private float shieldPenetrationFlatBase;
		private float shieldPenetrationPercentageBase;
		private float armorPenetrationFlatBase;
		private float armorPenetrationPercentageBase;
		private float onHitArmorThermalPenaltyBase;
		private float onHitArmorEnergyPenaltyBase;
		private float onHitArmorKineticPenaltyBase;
		private float onHitArmorMissilePenaltyBase;
		private float onHitShieldOverloadPercentageBonusBase;
		private float onHitAccuracyPenaltyBase;
		private float onHitDamageTakenBonusBase;
		private int onHitStunDurationBase;
		private float accuracyBonusSmallerTargetBase;
		private float accuracyBonusBiggerTargetBase;
		private boolean disableRandomSystemBase;
		private float damageAmountModified;
		private FireRate fireRateModified;
		private float rangeModified;
		private float accuracyModified;
		private float shieldPenetrationFlatModified;
		private float shieldPenetrationPercentageModified;
		private float armorPenetrationFlatModified;
		private float armorPenetrationPercentageModified;
		private float onHitArmorThermalPenaltyModified;
		private float onHitArmorEnergyPenaltyModified;
		private float onHitArmorKineticPenaltyModified;
		private float onHitArmorMissilePenaltyModified;
		private float onHitShieldOverloadPercentageBonusModified;
		private float onHitAccuracyPenaltyModified;
		private float onHitDamageTakenBonusModified;
		private int onHitStunDurationModified;
		private float accuracyBonusSmallerTargetModified;
		private float accuracyBonusBiggerTargetModified;
		private boolean disableRandomSystemModified;

		private Builder() {
		}

		public Builder withWeaponName(String weaponName) {
			this.weaponName = weaponName;
			return this;
		}

		public Builder withDamageTypes(DamageType[] damageTypes) {
			this.damageTypes = damageTypes;
			return this;
		}

		public Builder withWeaponMounts(WeaponMount[] weaponMounts) {
			this.weaponMounts = weaponMounts;
			return this;
		}

		public Builder withWeaponMount(WeaponMount weaponMount) {
			this.weaponMount = weaponMount;
			return this;
		}

		public Builder withDamageAmountBase(float damageAmountBase) {
			this.damageAmountBase = damageAmountBase;
			return this;
		}

		public Builder withFireRateBase(FireRate fireRateBase) {
			this.fireRateBase = fireRateBase;
			return this;
		}

		public Builder withRangeBase(float rangeBase) {
			this.rangeBase = rangeBase;
			return this;
		}

		public Builder withAccuracyBase(float accuracyBase) {
			this.accuracyBase = accuracyBase;
			return this;
		}

		public Builder withShieldPenetrationFlatBase(float shieldPenetrationFlatBase) {
			this.shieldPenetrationFlatBase = shieldPenetrationFlatBase;
			return this;
		}

		public Builder withShieldPenetrationPercentageBase(float shieldPenetrationPercentageBase) {
			this.shieldPenetrationPercentageBase = shieldPenetrationPercentageBase;
			return this;
		}

		public Builder withArmorPenetrationFlatBase(float armorPenetrationFlatBase) {
			this.armorPenetrationFlatBase = armorPenetrationFlatBase;
			return this;
		}

		public Builder withArmorPenetrationPercentageBase(float armorPenetrationPercentageBase) {
			this.armorPenetrationPercentageBase = armorPenetrationPercentageBase;
			return this;
		}

		public Builder withOnHitArmorThermalPenaltyBase(float onHitArmorThermalPenaltyBase) {
			this.onHitArmorThermalPenaltyBase = onHitArmorThermalPenaltyBase;
			return this;
		}

		public Builder withOnHitArmorEnergyPenaltyBase(float onHitArmorEnergyPenaltyBase) {
			this.onHitArmorEnergyPenaltyBase = onHitArmorEnergyPenaltyBase;
			return this;
		}

		public Builder withOnHitArmorKineticPenaltyBase(float onHitArmorKineticPenaltyBase) {
			this.onHitArmorKineticPenaltyBase = onHitArmorKineticPenaltyBase;
			return this;
		}

		public Builder withOnHitArmorMissilePenaltyBase(float onHitArmorMissilePenaltyBase) {
			this.onHitArmorMissilePenaltyBase = onHitArmorMissilePenaltyBase;
			return this;
		}

		public Builder withOnHitShieldOverloadPercentageBonusBase(float onHitShieldOverloadPercentageBonusBase) {
			this.onHitShieldOverloadPercentageBonusBase = onHitShieldOverloadPercentageBonusBase;
			return this;
		}

		public Builder withOnHitAccuracyPenaltyBase(float onHitAccuracyPenaltyBase) {
			this.onHitAccuracyPenaltyBase = onHitAccuracyPenaltyBase;
			return this;
		}

		public Builder withOnHitDamageTakenBonusBase(float onHitDamageTakenBonusBase) {
			this.onHitDamageTakenBonusBase = onHitDamageTakenBonusBase;
			return this;
		}

		public Builder withOnHitStunDurationBase(int onHitStunDurationBase) {
			this.onHitStunDurationBase = onHitStunDurationBase;
			return this;
		}

		public Builder withAccuracyBonusSmallerTargetBase(float accuracyBonusSmallerTargetBase) {
			this.accuracyBonusSmallerTargetBase = accuracyBonusSmallerTargetBase;
			return this;
		}

		public Builder withAccuracyBonusBiggerTargetBase(float accuracyBonusBiggerTargetBase) {
			this.accuracyBonusBiggerTargetBase = accuracyBonusBiggerTargetBase;
			return this;
		}

		public Builder withDisableRandomSystemBase(boolean disableRandomSystemBase) {
			this.disableRandomSystemBase = disableRandomSystemBase;
			return this;
		}

		public Builder withDamageAmountModified(float damageAmountModified) {
			this.damageAmountModified = damageAmountModified;
			return this;
		}

		public Builder withFireRateModified(FireRate fireRateModified) {
			this.fireRateModified = fireRateModified;
			return this;
		}

		public Builder withRangeModified(float rangeModified) {
			this.rangeModified = rangeModified;
			return this;
		}

		public Builder withAccuracyModified(float accuracyModified) {
			this.accuracyModified = accuracyModified;
			return this;
		}

		public Builder withShieldPenetrationFlatModified(float shieldPenetrationFlatModified) {
			this.shieldPenetrationFlatModified = shieldPenetrationFlatModified;
			return this;
		}

		public Builder withShieldPenetrationPercentageModified(float shieldPenetrationPercentageModified) {
			this.shieldPenetrationPercentageModified = shieldPenetrationPercentageModified;
			return this;
		}

		public Builder withArmorPenetrationFlatModified(float armorPenetrationFlatModified) {
			this.armorPenetrationFlatModified = armorPenetrationFlatModified;
			return this;
		}

		public Builder withArmorPenetrationPercentageModified(float armorPenetrationPercentageModified) {
			this.armorPenetrationPercentageModified = armorPenetrationPercentageModified;
			return this;
		}

		public Builder withOnHitArmorThermalPenaltyModified(float onHitArmorThermalPenaltyModified) {
			this.onHitArmorThermalPenaltyModified = onHitArmorThermalPenaltyModified;
			return this;
		}

		public Builder withOnHitArmorEnergyPenaltyModified(float onHitArmorEnergyPenaltyModified) {
			this.onHitArmorEnergyPenaltyModified = onHitArmorEnergyPenaltyModified;
			return this;
		}

		public Builder withOnHitArmorKineticPenaltyModified(float onHitArmorKineticPenaltyModified) {
			this.onHitArmorKineticPenaltyModified = onHitArmorKineticPenaltyModified;
			return this;
		}

		public Builder withOnHitArmorMissilePenaltyModified(float onHitArmorMissilePenaltyModified) {
			this.onHitArmorMissilePenaltyModified = onHitArmorMissilePenaltyModified;
			return this;
		}

		public Builder withOnHitShieldOverloadPercentageBonusModified(
				float onHitShieldOverloadPercentageBonusModified) {
			this.onHitShieldOverloadPercentageBonusModified = onHitShieldOverloadPercentageBonusModified;
			return this;
		}

		public Builder withOnHitAccuracyPenaltyModified(float onHitAccuracyPenaltyModified) {
			this.onHitAccuracyPenaltyModified = onHitAccuracyPenaltyModified;
			return this;
		}

		public Builder withOnHitDamageTakenBonusModified(float onHitDamageTakenBonusModified) {
			this.onHitDamageTakenBonusModified = onHitDamageTakenBonusModified;
			return this;
		}

		public Builder withOnHitStunDurationModified(int onHitStunDurationModified) {
			this.onHitStunDurationModified = onHitStunDurationModified;
			return this;
		}

		public Builder withAccuracyBonusSmallerTargetModified(float accuracyBonusSmallerTargetModified) {
			this.accuracyBonusSmallerTargetModified = accuracyBonusSmallerTargetModified;
			return this;
		}

		public Builder withAccuracyBonusBiggerTargetModified(float accuracyBonusBiggerTargetModified) {
			this.accuracyBonusBiggerTargetModified = accuracyBonusBiggerTargetModified;
			return this;
		}

		public Builder withDisableRandomSystemModified(boolean disableRandomSystemModified) {
			this.disableRandomSystemModified = disableRandomSystemModified;
			return this;
		}

		public Weapon build() {
			return new Weapon(this);
		}
	}

	
	
	
}
