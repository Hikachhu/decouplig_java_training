package fr.lernejo.logger;



public class LoggerFactory{

    public static Logger getLogger(String name) {
        ContextualLogger a =new ContextualLogger(name,new FileLogger("fichier.txt"));
        return a;
    }

}
