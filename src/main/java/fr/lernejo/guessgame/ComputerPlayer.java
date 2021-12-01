package fr.lernejo.guessgame;

import fr.lernejo.logger.Logger;
import fr.lernejo.logger.LoggerFactory;

public class ComputerPlayer implements Player{
    private final Logger logger = LoggerFactory.getLogger("player");
    long borneDroite= Long.MAX_VALUE;
    long borneGauche=Long.MIN_VALUE;

    @Override
    public long askNextGuess() {
        logger.log("Le bot envoi : "+(Long)((borneDroite+borneGauche)/2));
        return (Long)((borneDroite+borneGauche)/2);
    }

    @Override
    public void respond(boolean lowerOrGreater) {
        if(lowerOrGreater)borneDroite=(Long)((borneDroite+borneGauche)/2);
        else borneGauche=(Long)((borneDroite+borneGauche)/2);
    }
}
