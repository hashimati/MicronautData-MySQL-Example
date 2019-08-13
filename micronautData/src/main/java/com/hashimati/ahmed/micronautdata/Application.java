package com.hashimati.ahmed.micronautdata;

import io.micronaut.context.event.StartupEvent;
import io.micronaut.core.annotation.TypeHint;
import io.micronaut.runtime.Micronaut;
import io.micronaut.runtime.event.annotation.EventListener;


import javax.inject.Singleton;
import java.util.Arrays;


public class Application {



    public static void main(String[] args) {
        Micronaut.run(Application.class);
    }



}
