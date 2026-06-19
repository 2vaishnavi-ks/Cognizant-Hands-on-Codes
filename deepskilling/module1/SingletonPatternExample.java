class Logger{
    private static Logger instance = new Logger();
    
    private Logger(){}

    public static Logger getInstance(){
        return instance;
    } 

    public void log(String msg){
        System.out.println(msg);
    }
}
public class SingletonPatternExample {
    public static void main(String[] args) {
        Logger logger = Logger.getInstance();
        logger.log("Called the function !");
    }
}
