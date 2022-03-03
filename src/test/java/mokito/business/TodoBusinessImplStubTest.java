package mokito.business;

import mokito.data.api.TodoService;
import mokito.data.api.TodoServiceStub;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

public class TodoBusinessImplStubTest {
/*
    Stubs are difficult to maintain
    If we want to add dynamic condition then we need to keep adding new code
    If a new Service is added to the implementation class we need to implement the new method added
 */

    @Test
    void testRetrieveTodosRelatedToSpring_usingStub() {
        TodoServiceStub todoServiceStub = new TodoServiceStub();
        todoServiceStub.retrieveTodos("Dummy");
        TodoBusinessImpl todoBusiness = new TodoBusinessImpl(todoServiceStub);
        List<String> filteredTodos = todoBusiness.retrieveTodosRelatedToSpring("Dummy");
        Assertions.assertEquals(2, filteredTodos.size());
    }
}
