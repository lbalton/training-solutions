package exam03retake02;


import exam03retake02.State;
import week7.week07d04.Lab;

public class Todo {

    private String text;
    private State state = State.NON_COMPLETED;
    private int priority;

    public Todo(String text, int priority) {
        this.text = text;
        this.priority = priority;

        if (priority < 1 || priority > 5){
            throw new IllegalArgumentException("Priority is incorrect." + priority);
        }
    }

    public String getText() {
        return text;
    }

    public State getState() {
        return state;
    }

    public int getPriority() {
        return priority;
    }

    public void complete() {
        state = State.COMPLETED;
    }

    public void Complete() {
        state = State.COMPLETED;
    }
}
