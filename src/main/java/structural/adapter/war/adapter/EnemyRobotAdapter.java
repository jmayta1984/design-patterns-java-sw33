package structural.adapter.war.adapter;

import structural.adapter.war.adaptee.EnemyRobot;
import structural.adapter.war.target.EnemyAttacker;

public class EnemyRobotAdapter implements EnemyAttacker {

    EnemyRobot enemyRobot;

    public EnemyRobotAdapter(EnemyRobot enemyRobot) {
        this.enemyRobot = enemyRobot;
    }

    @Override
    public void fireWeapon() {
        this.enemyRobot.smashWithHands();
    }

    @Override
    public void driveForward() {
        this.enemyRobot.walkForward();
    }

    @Override
    public void assignDriver(String drivenName) {
        this.enemyRobot.reactToHuman(drivenName);
    }
}
