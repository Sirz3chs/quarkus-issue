package foo.bar.quarkusissue.service;

import foo.bar.quarkusissue.annotation.Parent;
import io.quarkus.test.junit.QuarkusTest;
import javax.inject.Inject;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

@QuarkusTest
class FooServiceTest {

    @Inject
    @Parent
    protected FooService fooService;

    @Test
    void testGet() {
        assertEquals("bar", fooService.get());
    }
}
