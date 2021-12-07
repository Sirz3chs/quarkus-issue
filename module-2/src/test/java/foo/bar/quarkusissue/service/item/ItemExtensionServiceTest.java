package foo.bar.quarkusissue.service.item;

import foo.bar.quarkusissue.annotation.Child;
import foo.bar.quarkusissue.service.FooExtensionService;
import io.quarkus.test.junit.QuarkusTest;
import javax.inject.Inject;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

@QuarkusTest
public class ItemExtensionServiceTest {

    @Inject
    @Child
    protected FooExtensionService fooExtensionService;

    @Test
    public void testGet() {
        assertEquals("bar", fooExtensionService.get());
    }

    @Test
    public void testCount() {
        assertEquals(1, fooExtensionService.count());
    }
}
