package fr.lernejo;

import fr.lernejo.guessgame.HumanPlayer;
import fr.lernejo.guessgame.Simulation;

import java.security.SecureRandom;

public class Launcher {

    public static void main(String[] args) {
        HumanPlayer humain = new HumanPlayer();
        SecureRandom random = new SecureRandom();
        long randomNumber = random.nextLong(100); // génère un nombre entre Long.MIN_VALUE et Long.MAX_VALUE
        Simulation simu = new Simulation(humain);
        System.out.println(randomNumber);
        simu.initialize(randomNumber);
        simu.loopUntilPlayerSucceed();
    }
}
