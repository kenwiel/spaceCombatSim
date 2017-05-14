package space.funin.hiveQueenQuest.spaceCombatSim.enums;

public enum WeaponMount {
	SpinalCorvette(0, 0, 0, 0, 0, 0, 0, 0, 100), 
	SpinalFrigate(0, 0, 0, 0, 0, 0, 0, 0, 100), 
	SpinalCruiser(0, 0, 0, 0,0, 0, 0, 0, 100), 
	SpinalBattlecruiser(0, 0, 0, 0, 0, 0, 0, 0, 100), 
	SpinalHiveship(0, 0, 0, 0, 0, 0, 0, 0,100), 
	Turret(0, 0, 0, 0, 0, 0, 0, 0, 0), 
	Fixed(0, 0.25f, 0, 0, 0, 0, 0, -0.25f,0), 
	Auxiliary(0, -0.25f, 0, 0, 0, 0, 0, 0.25f, 0);

	private float damageBonusFlat;
	private float damageBonusPercent;
	private float rateOfFireBonusFlat;
	private float rateOfFireBonusPercent;
	private float rangeBonusFlat;
	private float rangeBonusPercent;
	private float accuracyBonusFlat;
	private float accuracyBonusPercent;
	private float spinalMountLength;

	private WeaponMount(float damageBonusFlat, float damageBonusPercent, float rateOfFireBonusFlat,
			float rateOfFireBonusPercent, float rangeBonusFlat, float rangeBonusPercent, float accuracyBonusFlat,
			float accuracyBonusPercent, float spinalMountLength) {

		this.damageBonusFlat = damageBonusFlat;
		this.damageBonusPercent = damageBonusPercent;
		this.rateOfFireBonusFlat = rateOfFireBonusFlat;
		this.rateOfFireBonusPercent = rateOfFireBonusPercent;
		this.rangeBonusFlat = rangeBonusFlat;
		this.rangeBonusPercent = rangeBonusPercent;
		this.accuracyBonusFlat = accuracyBonusFlat;
		this.accuracyBonusPercent = accuracyBonusPercent;
		this.spinalMountLength = spinalMountLength;
	}

	public float getDamageBonusFlat() {
		return damageBonusFlat;
	}

	public float getDamageBonusPercent() {
		return damageBonusPercent;
	}

	public float getRateOfFireBonusFlat() {
		return rateOfFireBonusFlat;
	}

	public float getRateOfFireBonusPercent() {
		return rateOfFireBonusPercent;
	}

	public float getRangeBonusFlat() {
		return rangeBonusFlat;
	}

	public float getRangeBonusPercent() {
		return rangeBonusPercent;
	}

	public float getAccuracyBonusFlat() {
		return accuracyBonusFlat;
	}

	public float getAccuracyBonusPercent() {
		return accuracyBonusPercent;
	}

	public float getSpinalMountLength() {
		return spinalMountLength;
	}
}
