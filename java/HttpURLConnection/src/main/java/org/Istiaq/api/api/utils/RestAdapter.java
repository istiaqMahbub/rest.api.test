package org.istiaq.api.api.utils;


@FunctionalInterface
public interface RestAdapter {

    <T> T execute(Class<T> responseClass);
}
