package org.junitexample.coffeetalk.ut.subtype;

import java.util.Collection;

public interface TransformerCollectionTo<I, O>
    extends
    TransformerTo<I, O> {

    Collection<O> transform(
        Collection<I> in);
}
