package fr.lernejo.guessgame;

import fr.lernejo.logger.Logger;
import fr.lernejo.logger.LoggerFactory;

import java.util.Scanner;

public class Simulation {
    private final Logger logger = LoggerFactory.getLogger("simulation");
    private final Player player;  //TODO add variable type
    private long numberToGuess; //TODO add variable type

    public Simulation(Player player) {
        this.player = player;
    }

    public void initialize(long numberToGuess) {
        this.numberToGuess=numberToGuess;
    }

    /**
     * @return true if the player have guessed the right number
     */
    private boolean nextRound() {
        System.out.println("Entrez un nombre");
        long nombre = player.askNextGuess();
        if (nombre==numberToGuess){
            return true;
        }else if(nombre > numberToGuess){
           player.respond(true);
        }else{
            player.respond(false);
        }
        return false;
    }

    public void loopUntilPlayerSucceed() {
        while(!nextRound());
    }

}
