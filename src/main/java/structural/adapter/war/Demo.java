package structural.adapter.war;

import structural.adapter.war.adaptee.EnemyRobot;
import structural.adapter.war.adapter.EnemyRobotAdapter;
import structural.adapter.war.target.EnemyAttacker;

public class Demo {

    public static void main(String[] args){

        EnemyRobot enemyRobot = new EnemyRobot();

        EnemyAttacker attacker = new EnemyRobotAdapter(enemyRobot);

        attacker.fireWeapon();
        attacker.driveForward();
        attacker.assignDriver("Paul");
    }
}
