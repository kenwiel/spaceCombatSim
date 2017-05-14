package space.funin.hiveQueenQuest.spaceCombatSim.enums;

public enum FireRate {
	Slow(1), 
	Medium(2), 
	High(3), 
	SpinalTwoTurn(1, 2, true), 
	SpinalThreeTurn(1, 3, true), 
	SpinalFourTurn(1, 4,true), 
	SpinalFiveTurn(1, 5, true);

	private int RoF;
	private int cooldownTime;
	private int cooldownRemaining;
	private boolean cooldown;

	private FireRate(int shotsPerRound) {
		this(shotsPerRound, 0, false);
	}

	private FireRate(int shotsPerRound, int cooldownTime, boolean cooldown) {
		this.RoF = shotsPerRound;
		this.cooldownTime = cooldownTime;
		this.cooldown = cooldown;
	}

	/**
	 * Takes the RoF and checks whether it can fire this round (Spinal Mount)
	 * and how often (Other)
	 * 
	 * @return the amount of shots fired this round
	 */
	public int shots() {
		// If there is no cooldown round between shots, return the RoF
		if (!cooldown) {
			return RoF;
		}
		// Else, subtract one from the cooldown
		// If the cooldown is then 0, reset the cooldown and return the RoF
		cooldownRemaining -= 1;
		if (cooldownRemaining == 0) {
			cooldownRemaining = cooldownTime;
			return RoF;
		}
		return 0;
	}
}
