package exam03retake02;

import java.util.ArrayList;
import java.util.List;

public class TodoList {

    private List<Todo> todos = new ArrayList<>();

    public void addTodo(Todo todo){
        todos.add(todo);
    }

    public List<Todo> getTodos()  {
        return todos;
    }

    public int getNumberOfItemsLeft() {
        int sum = 0;
        for (Todo todo : todos) {
            if (todo.getState() == State.NON_COMPLETED){
                sum++;
            }
        }
        return sum;

    }

    public List<String> getMostImportantTodosText() {

        int maxPriority = 5;
        List<String> text = new ArrayList<>();

        for(Todo todo : todos){
            if (maxPriority> todo.getPriority()){
                maxPriority = todo.getPriority();
                text.clear();
                text.add((todo.getText()));
            }
            else if(maxPriority == todo.getPriority()){
                text.add(todo.getText());
            }
        }
        return text;
    }

    public void deleteCompleted() {
        for (int x = 0;x<todos.size() ;x++){
            if (todos.get(x).getState() == State.COMPLETED) {
                todos.remove(todos.get(x));
            }
        }
    }
}
