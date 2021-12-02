package fr.lernejo.guessgame;

import fr.lernejo.logger.Logger;
import fr.lernejo.logger.LoggerFactory;

import java.text.SimpleDateFormat;
import java.util.Scanner;

public class Simulation {
    private final Logger logger = LoggerFactory.getLogger("simulation");
    private final Player player;  //TODO add variable type
    private long numberToGuess; //TODO add variable type

    public Simulation(Player player) {
        this.player = player;
    }

    public void initialize(long numberToGuess) {
        logger.log("Le nombre à trouver est "+numberToGuess);
        this.numberToGuess=numberToGuess;
    }

    /**
     * @return true if the player have guessed the right number
     */
    private boolean nextRound() {
        long nombre = player.askNextGuess();
        if (nombre==numberToGuess){
            logger.log("win");
            return true;
        }else if(nombre > numberToGuess){
            player.respond(true);
        }else{
            player.respond(false);
        }
        logger.log("Le nombre entrée est "+nombre);
        return false;
    }

    public void loopUntilPlayerSucceed() {
        long time = System.currentTimeMillis();
        SimpleDateFormat sd = new SimpleDateFormat("mm:ss.SSS");
        int number=0;
        while(number<1000&&!nextRound())number++;
        System.out.println(sd.format(System.currentTimeMillis()-time));
    }

}
