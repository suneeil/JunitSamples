package mokito.data.api;

import java.util.Arrays;
import java.util.List;

public class TodoServiceStub implements TodoService{

    /*
    Stubs are difficult to maintain
    If we want to add dynamic condition then we need to keep adding new code
    If a new Service is added to the implementation class we need to implement the new method added
 */

    @Override
    public List<String> retrieveTodos(String user) {
        return Arrays.asList("Ted", "Learn Spring Boot", "Learn to Rock", "Learn to Dance", "Learn Spring");
    }

    @Override
    public void deleteTodo(String todo) {

    }
}
