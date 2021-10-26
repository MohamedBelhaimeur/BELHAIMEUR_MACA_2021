package TD3.visitable;

import TD3.Visitor.PrePostVisitor;

public interface PrePostVisitable {
   void accept(PrePostVisitor prePostVisitor);
}
