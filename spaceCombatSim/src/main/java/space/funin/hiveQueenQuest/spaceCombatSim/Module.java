package space.funin.hiveQueenQuest.spaceCombatSim;

import net.karneim.pojobuilder.GeneratePojoBuilder;
import javax.annotation.Generated;

public class Module {
	protected float hpBonusFlat;
	protected float hpBonusPercent;
	protected float hpRegenPerRoundFlat;
	protected float hpRegenPerRoundPercent;
	protected float hpRegenMaxFlat;
	protected float hpRegenMaxPercent;
	protected float hpDeathAvoidanceChance;

	protected float shieldBonusFlat;
	protected float shieldBonusPercent;
	protected float shieldThermalBleedBonusFlat;
	protected float shieldThermalBleedBonusPercent;
	protected float shieldOverloadAmount;

	protected float armorThermalBonusFlat;
	protected float armorThermalBonusPercent;
	protected float armorEnergyBonusFlat;
	protected float armorEnergyBonusPercent;
	protected float armorKineticBonusFlat;
	protected float armorKineticBonusPercent;
	protected float armorMissileBonusFlat;
	protected float armorMissileBonusPercent;

	protected float turretDamageBonusFlat;
	protected float turretDamageBonusPercent;
	protected float turretRateOfFireBonusFlat;
	protected float turretRateOfFireBonusPercent;
	protected float turretAccuracyBonusFlat;
	protected float turretAccuracyBonusPercent;
	protected float turretRangeBonusFlat;
	protected float turretRangeBonusPercent;

	protected float fighterAmountBonusFlat;
	protected float fighterAmountBonusPercent;
	protected float fighterRebuildPerRoundFlat;
	protected float fighterRebuildPerRoundPercent;
	protected float fighterDamageBonusFlat;
	protected float fighterDamageBonusPercent;
	protected float fighterEvasionBonusFlat;
	protected float fighterEvasionBonusPercent;
	
	protected float engineAccelerationBonusFlat;
	protected float engineAccelerationBonusPercent;
	@Generated("SparkTools")
	private Module(Builder builder) {
		this.hpBonusFlat = builder.hpBonusFlat;
		this.hpBonusPercent = builder.hpBonusPercent;
		this.hpRegenPerRoundFlat = builder.hpRegenPerRoundFlat;
		this.hpRegenPerRoundPercent = builder.hpRegenPerRoundPercent;
		this.hpRegenMaxFlat = builder.hpRegenMaxFlat;
		this.hpRegenMaxPercent = builder.hpRegenMaxPercent;
		this.hpDeathAvoidanceChance = builder.hpDeathAvoidanceChance;
		this.shieldBonusFlat = builder.shieldBonusFlat;
		this.shieldBonusPercent = builder.shieldBonusPercent;
		this.shieldThermalBleedBonusFlat = builder.shieldThermalBleedBonusFlat;
		this.shieldThermalBleedBonusPercent = builder.shieldThermalBleedBonusPercent;
		this.shieldOverloadAmount = builder.shieldOverloadAmount;
		this.armorThermalBonusFlat = builder.armorThermalBonusFlat;
		this.armorThermalBonusPercent = builder.armorThermalBonusPercent;
		this.armorEnergyBonusFlat = builder.armorEnergyBonusFlat;
		this.armorEnergyBonusPercent = builder.armorEnergyBonusPercent;
		this.armorKineticBonusFlat = builder.armorKineticBonusFlat;
		this.armorKineticBonusPercent = builder.armorKineticBonusPercent;
		this.armorMissileBonusFlat = builder.armorMissileBonusFlat;
		this.armorMissileBonusPercent = builder.armorMissileBonusPercent;
		this.turretDamageBonusFlat = builder.turretDamageBonusFlat;
		this.turretDamageBonusPercent = builder.turretDamageBonusPercent;
		this.turretRateOfFireBonusFlat = builder.turretRateOfFireBonusFlat;
		this.turretRateOfFireBonusPercent = builder.turretRateOfFireBonusPercent;
		this.turretAccuracyBonusFlat = builder.turretAccuracyBonusFlat;
		this.turretAccuracyBonusPercent = builder.turretAccuracyBonusPercent;
		this.turretRangeBonusFlat = builder.turretRangeBonusFlat;
		this.turretRangeBonusPercent = builder.turretRangeBonusPercent;
		this.fighterAmountBonusFlat = builder.fighterAmountBonusFlat;
		this.fighterAmountBonusPercent = builder.fighterAmountBonusPercent;
		this.fighterRebuildPerRoundFlat = builder.fighterRebuildPerRoundFlat;
		this.fighterRebuildPerRoundPercent = builder.fighterRebuildPerRoundPercent;
		this.fighterDamageBonusFlat = builder.fighterDamageBonusFlat;
		this.fighterDamageBonusPercent = builder.fighterDamageBonusPercent;
		this.fighterEvasionBonusFlat = builder.fighterEvasionBonusFlat;
		this.fighterEvasionBonusPercent = builder.fighterEvasionBonusPercent;
		this.engineAccelerationBonusFlat = builder.engineAccelerationBonusFlat;
		this.engineAccelerationBonusPercent = builder.engineAccelerationBonusPercent;
	}
	/**
	 * Creates builder to build {@link Module}.
	 * @return created builder
	 */
	@Generated("SparkTools")
	public static Builder builder() {
		return new Builder();
	}
	/**
	 * Builder to build {@link Module}.
	 */
	@Generated("SparkTools")
	public static final class Builder {
		private float hpBonusFlat;
		private float hpBonusPercent;
		private float hpRegenPerRoundFlat;
		private float hpRegenPerRoundPercent;
		private float hpRegenMaxFlat;
		private float hpRegenMaxPercent;
		private float hpDeathAvoidanceChance;
		private float shieldBonusFlat;
		private float shieldBonusPercent;
		private float shieldThermalBleedBonusFlat;
		private float shieldThermalBleedBonusPercent;
		private float shieldOverloadAmount;
		private float armorThermalBonusFlat;
		private float armorThermalBonusPercent;
		private float armorEnergyBonusFlat;
		private float armorEnergyBonusPercent;
		private float armorKineticBonusFlat;
		private float armorKineticBonusPercent;
		private float armorMissileBonusFlat;
		private float armorMissileBonusPercent;
		private float turretDamageBonusFlat;
		private float turretDamageBonusPercent;
		private float turretRateOfFireBonusFlat;
		private float turretRateOfFireBonusPercent;
		private float turretAccuracyBonusFlat;
		private float turretAccuracyBonusPercent;
		private float turretRangeBonusFlat;
		private float turretRangeBonusPercent;
		private float fighterAmountBonusFlat;
		private float fighterAmountBonusPercent;
		private float fighterRebuildPerRoundFlat;
		private float fighterRebuildPerRoundPercent;
		private float fighterDamageBonusFlat;
		private float fighterDamageBonusPercent;
		private float fighterEvasionBonusFlat;
		private float fighterEvasionBonusPercent;
		private float engineAccelerationBonusFlat;
		private float engineAccelerationBonusPercent;

		private Builder() {
		}

		public Builder withHpBonusFlat(float hpBonusFlat) {
			this.hpBonusFlat = hpBonusFlat;
			return this;
		}

		public Builder withHpBonusPercent(float hpBonusPercent) {
			this.hpBonusPercent = hpBonusPercent;
			return this;
		}

		public Builder withHpRegenPerRoundFlat(float hpRegenPerRoundFlat) {
			this.hpRegenPerRoundFlat = hpRegenPerRoundFlat;
			return this;
		}

		public Builder withHpRegenPerRoundPercent(float hpRegenPerRoundPercent) {
			this.hpRegenPerRoundPercent = hpRegenPerRoundPercent;
			return this;
		}

		public Builder withHpRegenMaxFlat(float hpRegenMaxFlat) {
			this.hpRegenMaxFlat = hpRegenMaxFlat;
			return this;
		}

		public Builder withHpRegenMaxPercent(float hpRegenMaxPercent) {
			this.hpRegenMaxPercent = hpRegenMaxPercent;
			return this;
		}

		public Builder withHpDeathAvoidanceChance(float hpDeathAvoidanceChance) {
			this.hpDeathAvoidanceChance = hpDeathAvoidanceChance;
			return this;
		}

		public Builder withShieldBonusFlat(float shieldBonusFlat) {
			this.shieldBonusFlat = shieldBonusFlat;
			return this;
		}

		public Builder withShieldBonusPercent(float shieldBonusPercent) {
			this.shieldBonusPercent = shieldBonusPercent;
			return this;
		}

		public Builder withShieldThermalBleedBonusFlat(float shieldThermalBleedBonusFlat) {
			this.shieldThermalBleedBonusFlat = shieldThermalBleedBonusFlat;
			return this;
		}

		public Builder withShieldThermalBleedBonusPercent(float shieldThermalBleedBonusPercent) {
			this.shieldThermalBleedBonusPercent = shieldThermalBleedBonusPercent;
			return this;
		}

		public Builder withShieldOverloadAmount(float shieldOverloadAmount) {
			this.shieldOverloadAmount = shieldOverloadAmount;
			return this;
		}

		public Builder withArmorThermalBonusFlat(float armorThermalBonusFlat) {
			this.armorThermalBonusFlat = armorThermalBonusFlat;
			return this;
		}

		public Builder withArmorThermalBonusPercent(float armorThermalBonusPercent) {
			this.armorThermalBonusPercent = armorThermalBonusPercent;
			return this;
		}

		public Builder withArmorEnergyBonusFlat(float armorEnergyBonusFlat) {
			this.armorEnergyBonusFlat = armorEnergyBonusFlat;
			return this;
		}

		public Builder withArmorEnergyBonusPercent(float armorEnergyBonusPercent) {
			this.armorEnergyBonusPercent = armorEnergyBonusPercent;
			return this;
		}

		public Builder withArmorKineticBonusFlat(float armorKineticBonusFlat) {
			this.armorKineticBonusFlat = armorKineticBonusFlat;
			return this;
		}

		public Builder withArmorKineticBonusPercent(float armorKineticBonusPercent) {
			this.armorKineticBonusPercent = armorKineticBonusPercent;
			return this;
		}

		public Builder withArmorMissileBonusFlat(float armorMissileBonusFlat) {
			this.armorMissileBonusFlat = armorMissileBonusFlat;
			return this;
		}

		public Builder withArmorMissileBonusPercent(float armorMissileBonusPercent) {
			this.armorMissileBonusPercent = armorMissileBonusPercent;
			return this;
		}

		public Builder withTurretDamageBonusFlat(float turretDamageBonusFlat) {
			this.turretDamageBonusFlat = turretDamageBonusFlat;
			return this;
		}

		public Builder withTurretDamageBonusPercent(float turretDamageBonusPercent) {
			this.turretDamageBonusPercent = turretDamageBonusPercent;
			return this;
		}

		public Builder withTurretRateOfFireBonusFlat(float turretRateOfFireBonusFlat) {
			this.turretRateOfFireBonusFlat = turretRateOfFireBonusFlat;
			return this;
		}

		public Builder withTurretRateOfFireBonusPercent(float turretRateOfFireBonusPercent) {
			this.turretRateOfFireBonusPercent = turretRateOfFireBonusPercent;
			return this;
		}

		public Builder withTurretAccuracyBonusFlat(float turretAccuracyBonusFlat) {
			this.turretAccuracyBonusFlat = turretAccuracyBonusFlat;
			return this;
		}

		public Builder withTurretAccuracyBonusPercent(float turretAccuracyBonusPercent) {
			this.turretAccuracyBonusPercent = turretAccuracyBonusPercent;
			return this;
		}

		public Builder withTurretRangeBonusFlat(float turretRangeBonusFlat) {
			this.turretRangeBonusFlat = turretRangeBonusFlat;
			return this;
		}

		public Builder withTurretRangeBonusPercent(float turretRangeBonusPercent) {
			this.turretRangeBonusPercent = turretRangeBonusPercent;
			return this;
		}

		public Builder withFighterAmountBonusFlat(float fighterAmountBonusFlat) {
			this.fighterAmountBonusFlat = fighterAmountBonusFlat;
			return this;
		}

		public Builder withFighterAmountBonusPercent(float fighterAmountBonusPercent) {
			this.fighterAmountBonusPercent = fighterAmountBonusPercent;
			return this;
		}

		public Builder withFighterRebuildPerRoundFlat(float fighterRebuildPerRoundFlat) {
			this.fighterRebuildPerRoundFlat = fighterRebuildPerRoundFlat;
			return this;
		}

		public Builder withFighterRebuildPerRoundPercent(float fighterRebuildPerRoundPercent) {
			this.fighterRebuildPerRoundPercent = fighterRebuildPerRoundPercent;
			return this;
		}

		public Builder withFighterDamageBonusFlat(float fighterDamageBonusFlat) {
			this.fighterDamageBonusFlat = fighterDamageBonusFlat;
			return this;
		}

		public Builder withFighterDamageBonusPercent(float fighterDamageBonusPercent) {
			this.fighterDamageBonusPercent = fighterDamageBonusPercent;
			return this;
		}

		public Builder withFighterEvasionBonusFlat(float fighterEvasionBonusFlat) {
			this.fighterEvasionBonusFlat = fighterEvasionBonusFlat;
			return this;
		}

		public Builder withFighterEvasionBonusPercent(float fighterEvasionBonusPercent) {
			this.fighterEvasionBonusPercent = fighterEvasionBonusPercent;
			return this;
		}

		public Builder withEngineAccelerationBonusFlat(float engineAccelerationBonusFlat) {
			this.engineAccelerationBonusFlat = engineAccelerationBonusFlat;
			return this;
		}

		public Builder withEngineAccelerationBonusPercent(float engineAccelerationBonusPercent) {
			this.engineAccelerationBonusPercent = engineAccelerationBonusPercent;
			return this;
		}

		public Module build() {
			return new Module(this);
		}
	}
	
	
	
	
	
	
	
}
