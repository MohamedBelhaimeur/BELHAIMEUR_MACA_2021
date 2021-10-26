package TD3.visitable;

import TD3.Visitor.Visitor;

public interface Visitable {
    void accept (Visitor visitor);
}
