package fr.lernejo.guessgame;

import fr.lernejo.guessgame.ComputerPlayer;
import fr.lernejo.guessgame.HumanPlayer;
import fr.lernejo.guessgame.Simulation;

import java.security.SecureRandom;

public class Launcher {

    public static void main(String[] args) {
        SecureRandom random = new SecureRandom();
        if(args[0].equals("-interactive")){
            HumanPlayer humain = new HumanPlayer();
            long randomNumber = random.nextLong(100);
            Simulation simu = new Simulation(humain);
            System.out.println(randomNumber);
            simu.initialize(randomNumber);
            simu.loopUntilPlayerSucceed();
        }else if(args[0].equals("-auto") && args[1].matches("[+-]?\\d*(\\.\\d+)?")){
            ComputerPlayer ordi = new ComputerPlayer();
            Simulation simu = new Simulation(ordi);
            simu.initialize(Long.parseLong(args[1]));
            simu.loopUntilPlayerSucceed();
        }
        else{
            System.out.println("Usage:");
            System.out.println("-interactive");
            System.out.println("-auto <Secret number>");
        }
    }
}
