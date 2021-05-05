package santa.david.g1087.singleton;

public enum SingletonLogger {
    LOGGER;

    final static String path="10.0.0.2:445/logs/log.txt";

    public String getPath(){
        return path;
    }

    public void log(String message){
        System.out.println("' " + message+" ' " + " logged to " + path);
    }
}
