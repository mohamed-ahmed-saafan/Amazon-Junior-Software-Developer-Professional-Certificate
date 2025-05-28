import java.util.Scanner;
public class Main {
    public static int calculatePunchDamage(int strength){
        return strength*2;
    }
    public static int calculateSpecialAttackDamage(int strength , String attackType){
        int damage = strength*2;
        if(attackType.equalsIgnoreCase("ice blast"))
        {
            damage *= 2;
        }
        else if(attackType.equalsIgnoreCase("fire ball"))
        {
            damage *= 3;
        }
        else {
            System.out.println("invalid Special attack");
        }
        return damage;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int villanHealth = 100;
        int punchDamage = 20;
        String specialAttack;
        System.out.println("enter the special attack (ice blast, fire ball)");
        specialAttack=in.nextLine();
        if (specialAttack.equalsIgnoreCase("fire ball") || specialAttack.equalsIgnoreCase("ice blast")) {
            villanHealth = villanHealth - calculateSpecialAttackDamage(punchDamage, specialAttack);
            System.out.println("villain health after " + specialAttack + "= " + villanHealth);
        }
        else {
            int remainingHealth = villanHealth - calculatePunchDamage(punchDamage);
            System.out.println("villain original health = " + villanHealth + " villain health after punching = " + remainingHealth);
        }







    }
}