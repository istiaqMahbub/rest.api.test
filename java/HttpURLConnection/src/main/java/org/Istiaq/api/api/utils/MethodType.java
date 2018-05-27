package org.istiaq.api.api.utils;


public enum MethodType {

    GET("GET"),
    POST("POST"),
    DELETE("DELETE"),
    PUT("PUT");

    private String methodType;

    private MethodType(String methodType) {
        this.methodType = methodType;
    }

    public String getMethodType() {
        return methodType;
    }

    @Override
    public String toString() {
        return this.getMethodType();
    }
}
