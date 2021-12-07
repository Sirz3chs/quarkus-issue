package foo.bar.quarkusissue.service;

import foo.bar.quarkusissue.annotation.Child;
import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
@Child
public class FooExtensionService extends FooService {

    public int count() {
        return 1;
    }
}
