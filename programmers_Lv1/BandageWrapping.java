package programmers_Lv1;

public class BandageWrapping {

	public static void main(String[] args) {
		int[] bandage = {5, 1, 5};
		int health = 30;
		int[][] attacks = {{2, 10}, {9, 15}, {10, 5}, {11, 5}};
		int maxHealth = health;
		int maxHealCount = bandage[0];
		int healFps = bandage[1];
		int additionalHeal = bandage[2];
		int preAttackTime = 0;

		for(int[] attack : attacks) {
			int attackTime = attack[0];
			int damage = attack[1];
			int healTime = attackTime - preAttackTime - 1;
			
			health += Math.min(health, healTime * healFps + (healTime / maxHealCount) * additionalHeal);

			if(health>maxHealth) {
				health = maxHealth;
			}
			
			health -= damage;
			
			if(health<1) {
				health = -1;
				
				break;
			}
			
			preAttackTime = attackTime;
		}
		
		System.out.println(health);
	}

}
