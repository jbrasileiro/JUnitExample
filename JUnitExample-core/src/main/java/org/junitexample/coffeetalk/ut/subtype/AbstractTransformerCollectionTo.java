package org.junitexample.coffeetalk.ut.subtype;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public abstract class AbstractTransformerCollectionTo<I, O>
    implements
    TransformerCollectionTo<I, O> {

    @Override
    public Collection<O> transform(
        final Collection<I> in) {
        final Collection<O> result = new ArrayList<>();
        if (CollectionsUtils.hasElement(in)) { //#1  //#2
            final Iterator<I> iterator = in.iterator();
            while (iterator.hasNext()) {
                final O out = transform(iterator.next());
                if (ObjectsUtils.notNull(out)) { //#3
                    result.add(out); //#4
                }
            }
        }
        return result;
    }
}
