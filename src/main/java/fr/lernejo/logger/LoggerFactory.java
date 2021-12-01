package fr.lernejo.logger;



public class LoggerFactory{

    public static Logger getLogger(String name) {
        CompositeLogger a =new CompositeLogger(new ConsoleLogger(),new FileLogger("fichier.txt"));
        return a;
    }

}
