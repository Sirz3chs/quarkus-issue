package foo.bar.quarkusissue.service;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class BarService {

    public String get() {
        return "bar";
    }
}
