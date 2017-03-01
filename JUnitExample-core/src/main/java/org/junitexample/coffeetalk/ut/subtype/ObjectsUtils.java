package org.junitexample.coffeetalk.ut.subtype;

public final class ObjectsUtils {

    public static boolean isNull(
        final Object o) {
        return o == null;
    }

    public static boolean notNull(
        final Object o) {
        return !isNull(o);
    }

    public static boolean xor(
        final boolean one,
        final boolean two) {
        return one ^ two;
    }

    public static boolean xorNull(
        final Object one,
        final Object two) {
        return xor(ObjectsUtils.isNull(one), ObjectsUtils.isNull(two));
    }

    public static <T> T required(
        final T value) {
        if (ObjectsUtils.isNull(value)) {
            throw new IllegalStateException();
        } else {
            return value;
        }
    }

    public static boolean same(
        final Object one,
        final Object two) {
        return one == two;
    }

    public static String toString(
        final Object o) {
        if (ObjectsUtils.isNull(o)) {
            return "";
        } else {
            return o.toString();
        }
    }

    public static boolean sameClass(
        final Object one,
        final Object two) {
        return one.getClass() == two.getClass();
    }
}
