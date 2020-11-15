package intromethod;

public class Todo {
    private String caption;
    private boolean finished;


    public Todo(String caption){
        this.caption = caption;
    }

    public String getCaption(){
        return caption;
    }

    public boolean isFinished(){
        return finished;
    }

    public void finish(){
    }

}
