package org.junitexample.coffeetalk.ut.subtype;

public interface TransformerTo<I, O> {

    O transform(
        I in);
}
