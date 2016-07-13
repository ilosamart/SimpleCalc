package com.tramasoli.rest;
import javax.ws.rs.core.Application;
import org.eclipse.persistence.jaxb.rs.MOXyJsonProvider;
import java.util.HashSet;
import java.util.Set;

import javax.ws.rs.ApplicationPath;

@ApplicationPath("v1")
public class RestApp extends Application {
    public Set<Class<?>> getClasses() {
        Set<Class<?>> s = new HashSet<Class<?>>();
        s.add(MOXyJsonProvider.class);
        s.add(com.tramasoli.service.Calculator.class);
        return s;
    }
}
