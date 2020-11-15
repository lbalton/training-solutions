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
    }



}




    /*
    Todo todo;

    private List<String> todos = new ArrayList<String>();

    public String addTodo(String caption){
        todos.add(caption)
    }

    public void finishTodo(String caption){
        if (todo.getCaption().equals(caption)){

        }
    }

    public String finishAllTodos(List<String> todosToFinish){

    }

    public int numberOfFinishedTodos(){

    }



}
*/