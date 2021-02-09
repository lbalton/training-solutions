package collectionsqueue;

public class NoJobException extends Exception {

    private final String exceptionMessenge;


    public NoJobException(String text) {
        this.exceptionMessenge = text;
    }

}
