package org.junitexample.coffeetalk.ut.subtype;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Objects;

public final class CollectionsUtils {

    public static boolean hasElement(
        final Collection<?> value) {
        return !CollectionsUtils.hasNoElement(value);
    }

    public static boolean hasNoElement(
        final Collection<?> value) {
        if (value == null) {
            return true;
        } else {
            final List<?> ref = new ArrayList<>(value);
            ref.remove(null);
            return ref.isEmpty();
        }
    }

    public static <T> Collection<T> toCollection(
        final T value) {
        return toList(value);
    }

    public static <T> List<T> toList(
        final T value) {
        if (value == null) {
            return new ArrayList<>();
        } else {
            return Arrays.asList(value);
        }
    }

    public static <T> Collection<T> asCollection(
        final T[] array) {
        if (array == null) {
            return new ArrayList<>();
        } else {
            return Arrays.asList(array);
        }
    }

    public static <T> String toString(
        final Collection<T> collection) {
        if (ObjectsUtils.isNull(collection)) {
            return Objects.toString(collection);
        } else {
            StringBuilder builder = new StringBuilder();
            builder.append('[');
            for (Object o : collection) {
                builder.append(Objects.toString(o));
                builder.append(',');
            }
            builder.append(']');
            return builder.toString();
        }
    }

    @SafeVarargs
    public static <T> String toString(
        final T... objects) {
        List<T> args = Arrays.asList(objects);
        return toString(args);
    }
}
