package mokito.business;

import mokito.data.api.TodoService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import java.util.Arrays;
import java.util.List;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class TodoBusinessImplMockTest {
/*
    What is Mocking?
        mocking is creating objects that simulates the behaviour of the real object
        Unlike stub, mocking can be dynimically created from code - at runtime
        Mocks offer more functionality than stubs
        You can verify method calls and a lot of other things
 */
TodoService todoServiceMock = mock(TodoService.class);

    @Test
    void testRetrieveTodosRelatedToSpring_usingMock() {

        when(todoServiceMock.retrieveTodos("Dummy"))
                .thenReturn(Arrays.asList("Ted", "Learn Spring Boot", "Learn to Rock", "Learn to Dance", "Learn Spring"));
        TodoBusinessImpl todoBusiness = new TodoBusinessImpl(todoServiceMock);
        List<String> filteredTodos = todoBusiness.retrieveTodosRelatedToSpring("Dummy");
        Assertions.assertEquals(2, filteredTodos.size());
    }

    @Test
    void testRetrieveTodosRelatedToSpring_usingMock_withEmptyLIst() {

       /* when(todoServiceMock.retrieveTodos("Dummy"))
                .thenReturn(Arrays.asList());
               If this step is not used then by default we get empty arrayList
       */
        TodoBusinessImpl todoBusiness = new TodoBusinessImpl(todoServiceMock);
        List<String> filteredTodos = todoBusiness.retrieveTodosRelatedToSpring("Dummy");
        Assertions.assertEquals(0, filteredTodos.size());
    }
}
