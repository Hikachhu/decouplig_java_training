package fr.lernejo.guessgame;

public class ComputerPlayer implements Player{

    long borneDroite= Long.MAX_VALUE;
    long borneGauche=Long.MIN_VALUE;

    @Override
    public long askNextGuess() {
        return (Long)((borneDroite+borneGauche)/2);
    }

    @Override
    public void respond(boolean lowerOrGreater) {
        if(lowerOrGreater)borneDroite=(Long)((borneDroite+borneGauche)/2);
        else borneGauche=(Long)((borneDroite+borneGauche)/2);
    }
}
