package space.funin.hiveQueenQuest.spaceCombatSim;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.math3.geometry.euclidean.threed.Vector3D;

import net.karneim.pojobuilder.GeneratePojoBuilder;
import javax.annotation.Generated;

public class SpaceShip {

	protected String hullName;
	protected int crewMin;
	protected int crewMax;
	protected int size; //in meters
	protected int turretMountsSpinal;
	protected int turretMountsFixed;
	protected int turretMountsTurret;
	protected int turretMountsAuxiliary;

	protected float hpMaxBaseAmount;
	protected float hpRegenFlatBaseAmount;
	protected float hpRegenPercentBaseAmount;
	
	protected float shieldHPMaxBaseAmount;
	protected float shieldOverloadDamageBaseAmount;
	protected float shieldThermalBleedPercentBaseAmount;
	
	protected float armorThermalBaseAmount;
	protected float armorEnergyBaseAmount;
	protected float armorKineticBaseAmount;
	protected float armorMissileBaseAmount;
	protected float evasionBaseAmount;
	protected float engineAccelerationBaseAmount;
	
	protected List<Module> modules = new ArrayList<Module>();
	protected List<Weapon> weapons = new ArrayList<Weapon>();
	
	protected Vector3D movementPositionCurrent;	//current position in 3d space
	protected Vector3D movementSpeedCurrent;	//current speed vector
	protected int currentCrew;
	protected float hpCurrent;
	protected float shieldHPCurrent;

	protected float hpMaxModified;
	protected float hpRegenFlatModified;
	protected float hpRegenPercentModified;
	
	protected float shieldHPMaxModified;
	protected float shieldOverloadDamageModified;
	protected float shieldThermalBleedPercentModified;
	
	protected float armorThermalModified;
	protected float armorEnergyModified;
	protected float armorKineticModified;
	protected float armorMissileModified;
	protected float hitPointsModified;
	protected float evasionModified;
	protected float engineAccelerationModified;

	@Generated("SparkTools")
	private SpaceShip(Builder builder) {
		this.hullName = builder.hullName;
		this.crewMin = builder.crewMin;
		this.crewMax = builder.crewMax;
		this.size = builder.size;
		this.turretMountsSpinal = builder.turretMountsSpinal;
		this.turretMountsFixed = builder.turretMountsFixed;
		this.turretMountsTurret = builder.turretMountsTurret;
		this.turretMountsAuxiliary = builder.turretMountsAuxiliary;
		this.hpMaxBaseAmount = builder.hpMaxBaseAmount;
		this.hpRegenFlatBaseAmount = builder.hpRegenFlatBaseAmount;
		this.hpRegenPercentBaseAmount = builder.hpRegenPercentBaseAmount;
		this.shieldHPMaxBaseAmount = builder.shieldHPMaxBaseAmount;
		this.shieldOverloadDamageBaseAmount = builder.shieldOverloadDamageBaseAmount;
		this.shieldThermalBleedPercentBaseAmount = builder.shieldThermalBleedPercentBaseAmount;
		this.armorThermalBaseAmount = builder.armorThermalBaseAmount;
		this.armorEnergyBaseAmount = builder.armorEnergyBaseAmount;
		this.armorKineticBaseAmount = builder.armorKineticBaseAmount;
		this.armorMissileBaseAmount = builder.armorMissileBaseAmount;
		this.evasionBaseAmount = builder.evasionBaseAmount;
		this.engineAccelerationBaseAmount = builder.engineAccelerationBaseAmount;
		this.modules = builder.modules;
		this.weapons = builder.weapons;
		this.movementPositionCurrent = builder.movementPositionCurrent;
		this.movementSpeedCurrent = builder.movementSpeedCurrent;
		this.currentCrew = builder.currentCrew;
		this.hpCurrent = builder.hpCurrent;
		this.shieldHPCurrent = builder.shieldHPCurrent;
		this.hpMaxModified = builder.hpMaxModified;
		this.hpRegenFlatModified = builder.hpRegenFlatModified;
		this.hpRegenPercentModified = builder.hpRegenPercentModified;
		this.shieldHPMaxModified = builder.shieldHPMaxModified;
		this.shieldOverloadDamageModified = builder.shieldOverloadDamageModified;
		this.shieldThermalBleedPercentModified = builder.shieldThermalBleedPercentModified;
		this.armorThermalModified = builder.armorThermalModified;
		this.armorEnergyModified = builder.armorEnergyModified;
		this.armorKineticModified = builder.armorKineticModified;
		this.armorMissileModified = builder.armorMissileModified;
		this.hitPointsModified = builder.hitPointsModified;
		this.evasionModified = builder.evasionModified;
		this.engineAccelerationModified = builder.engineAccelerationModified;
	}
	
	final public void takeDamage(SpaceShip enemyShip) {
		
	}

	/**
	 * Creates builder to build {@link SpaceShip}.
	 * @return created builder
	 */
	@Generated("SparkTools")
	public static Builder builder() {
		return new Builder();
	}

	/**
	 * Builder to build {@link SpaceShip}.
	 */
	@Generated("SparkTools")
	public static final class Builder {
		private String hullName;
		private int crewMin;
		private int crewMax;
		private int size;
		private int turretMountsSpinal;
		private int turretMountsFixed;
		private int turretMountsTurret;
		private int turretMountsAuxiliary;
		private float hpMaxBaseAmount;
		private float hpRegenFlatBaseAmount;
		private float hpRegenPercentBaseAmount;
		private float shieldHPMaxBaseAmount;
		private float shieldOverloadDamageBaseAmount;
		private float shieldThermalBleedPercentBaseAmount;
		private float armorThermalBaseAmount;
		private float armorEnergyBaseAmount;
		private float armorKineticBaseAmount;
		private float armorMissileBaseAmount;
		private float evasionBaseAmount;
		private float engineAccelerationBaseAmount;
		private List<Module> modules;
		private List<Weapon> weapons;
		private Vector3D movementPositionCurrent;
		private Vector3D movementSpeedCurrent;
		private int currentCrew;
		private float hpCurrent;
		private float shieldHPCurrent;
		private float hpMaxModified;
		private float hpRegenFlatModified;
		private float hpRegenPercentModified;
		private float shieldHPMaxModified;
		private float shieldOverloadDamageModified;
		private float shieldThermalBleedPercentModified;
		private float armorThermalModified;
		private float armorEnergyModified;
		private float armorKineticModified;
		private float armorMissileModified;
		private float hitPointsModified;
		private float evasionModified;
		private float engineAccelerationModified;

		private Builder() {
		}

		public Builder withHullName(String hullName) {
			this.hullName = hullName;
			return this;
		}

		public Builder withCrewMin(int crewMin) {
			this.crewMin = crewMin;
			return this;
		}

		public Builder withCrewMax(int crewMax) {
			this.crewMax = crewMax;
			return this;
		}

		public Builder withSize(int size) {
			this.size = size;
			return this;
		}

		public Builder withTurretMountsSpinal(int turretMountsSpinal) {
			this.turretMountsSpinal = turretMountsSpinal;
			return this;
		}

		public Builder withTurretMountsFixed(int turretMountsFixed) {
			this.turretMountsFixed = turretMountsFixed;
			return this;
		}

		public Builder withTurretMountsTurret(int turretMountsTurret) {
			this.turretMountsTurret = turretMountsTurret;
			return this;
		}

		public Builder withTurretMountsAuxiliary(int turretMountsAuxiliary) {
			this.turretMountsAuxiliary = turretMountsAuxiliary;
			return this;
		}

		public Builder withHpMaxBaseAmount(float hpMaxBaseAmount) {
			this.hpMaxBaseAmount = hpMaxBaseAmount;
			return this;
		}

		public Builder withHpRegenFlatBaseAmount(float hpRegenFlatBaseAmount) {
			this.hpRegenFlatBaseAmount = hpRegenFlatBaseAmount;
			return this;
		}

		public Builder withHpRegenPercentBaseAmount(float hpRegenPercentBaseAmount) {
			this.hpRegenPercentBaseAmount = hpRegenPercentBaseAmount;
			return this;
		}

		public Builder withShieldHPMaxBaseAmount(float shieldHPMaxBaseAmount) {
			this.shieldHPMaxBaseAmount = shieldHPMaxBaseAmount;
			return this;
		}

		public Builder withShieldOverloadDamageBaseAmount(float shieldOverloadDamageBaseAmount) {
			this.shieldOverloadDamageBaseAmount = shieldOverloadDamageBaseAmount;
			return this;
		}

		public Builder withShieldThermalBleedPercentBaseAmount(float shieldThermalBleedPercentBaseAmount) {
			this.shieldThermalBleedPercentBaseAmount = shieldThermalBleedPercentBaseAmount;
			return this;
		}

		public Builder withArmorThermalBaseAmount(float armorThermalBaseAmount) {
			this.armorThermalBaseAmount = armorThermalBaseAmount;
			return this;
		}

		public Builder withArmorEnergyBaseAmount(float armorEnergyBaseAmount) {
			this.armorEnergyBaseAmount = armorEnergyBaseAmount;
			return this;
		}

		public Builder withArmorKineticBaseAmount(float armorKineticBaseAmount) {
			this.armorKineticBaseAmount = armorKineticBaseAmount;
			return this;
		}

		public Builder withArmorMissileBaseAmount(float armorMissileBaseAmount) {
			this.armorMissileBaseAmount = armorMissileBaseAmount;
			return this;
		}

		public Builder withEvasionBaseAmount(float evasionBaseAmount) {
			this.evasionBaseAmount = evasionBaseAmount;
			return this;
		}

		public Builder withEngineAccelerationBaseAmount(float engineAccelerationBaseAmount) {
			this.engineAccelerationBaseAmount = engineAccelerationBaseAmount;
			return this;
		}

		public Builder withModules(List<Module> modules) {
			this.modules = modules;
			return this;
		}

		public Builder withWeapons(List<Weapon> weapons) {
			this.weapons = weapons;
			return this;
		}

		public Builder withMovementPositionCurrent(Vector3D movementPositionCurrent) {
			this.movementPositionCurrent = movementPositionCurrent;
			return this;
		}

		public Builder withMovementSpeedCurrent(Vector3D movementSpeedCurrent) {
			this.movementSpeedCurrent = movementSpeedCurrent;
			return this;
		}

		public Builder withCurrentCrew(int currentCrew) {
			this.currentCrew = currentCrew;
			return this;
		}

		public Builder withHpCurrent(float hpCurrent) {
			this.hpCurrent = hpCurrent;
			return this;
		}

		public Builder withShieldHPCurrent(float shieldHPCurrent) {
			this.shieldHPCurrent = shieldHPCurrent;
			return this;
		}

		public Builder withHpMaxModified(float hpMaxModified) {
			this.hpMaxModified = hpMaxModified;
			return this;
		}

		public Builder withHpRegenFlatModified(float hpRegenFlatModified) {
			this.hpRegenFlatModified = hpRegenFlatModified;
			return this;
		}

		public Builder withHpRegenPercentModified(float hpRegenPercentModified) {
			this.hpRegenPercentModified = hpRegenPercentModified;
			return this;
		}

		public Builder withShieldHPMaxModified(float shieldHPMaxModified) {
			this.shieldHPMaxModified = shieldHPMaxModified;
			return this;
		}

		public Builder withShieldOverloadDamageModified(float shieldOverloadDamageModified) {
			this.shieldOverloadDamageModified = shieldOverloadDamageModified;
			return this;
		}

		public Builder withShieldThermalBleedPercentModified(float shieldThermalBleedPercentModified) {
			this.shieldThermalBleedPercentModified = shieldThermalBleedPercentModified;
			return this;
		}

		public Builder withArmorThermalModified(float armorThermalModified) {
			this.armorThermalModified = armorThermalModified;
			return this;
		}

		public Builder withArmorEnergyModified(float armorEnergyModified) {
			this.armorEnergyModified = armorEnergyModified;
			return this;
		}

		public Builder withArmorKineticModified(float armorKineticModified) {
			this.armorKineticModified = armorKineticModified;
			return this;
		}

		public Builder withArmorMissileModified(float armorMissileModified) {
			this.armorMissileModified = armorMissileModified;
			return this;
		}

		public Builder withHitPointsModified(float hitPointsModified) {
			this.hitPointsModified = hitPointsModified;
			return this;
		}

		public Builder withEvasionModified(float evasionModified) {
			this.evasionModified = evasionModified;
			return this;
		}

		public Builder withEngineAccelerationModified(float engineAccelerationModified) {
			this.engineAccelerationModified = engineAccelerationModified;
			return this;
		}

		public SpaceShip build() {
			return new SpaceShip(this);
		}
	}
	
	
	
}
