package foo.bar.quarkusissue.service;

import foo.bar.quarkusissue.annotation.Parent;
import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

@ApplicationScoped
@Parent
public class FooService {

    @Inject
    protected BarService barService;

    public String get() {
        return barService.get();
    }
}
