package fr.lernejo.logger;



public class LoggerFactory{

    public static Logger getLogger(String name) {

        ContextualLogger a = new ContextualLogger( name,new CompositeLogger(
            new ConsoleLogger(),
            new FilteredLogger(
                new FileLogger("fichier.txt"),
                (message2) -> message2.contains("simulation")
            )
        ));

        return a;
    }

}
