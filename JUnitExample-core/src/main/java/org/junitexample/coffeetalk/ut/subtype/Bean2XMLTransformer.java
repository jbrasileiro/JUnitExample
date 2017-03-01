package org.junitexample.coffeetalk.ut.subtype;

public class Bean2XMLTransformer
    extends
    AbstractTransformerCollectionTo<Object, String> {

    @Override
    public String transform(
        final Object in) {
        return toXML(in);
    }

    private String toXML(
        final Object in) {
        String value = ObjectsUtils.toString(in);
        return "<xml>".concat(value).concat("</xml>");
    }
}
