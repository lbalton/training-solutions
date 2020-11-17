package intromethod;

import java.util.ArrayList;
import java.util.List;

public class TodoList {

    private List<String> todos = new ArrayList<String>();

    public void addTodo(String caption){
        todos.add(caption);

    }

    public void finishTodos(String caption){
        todos.remove(caption);
    }}
