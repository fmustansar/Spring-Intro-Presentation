package com.faizan.presentation.dependencyinjection.mobilephone.impl.processor;

import com.faizan.presentation.dependencyinjection.mobilephone.type.Processor;
import org.springframework.stereotype.Component;

@Component
public class SamsungMicroProcessor implements Processor {

    @Override
    public String name() {
        return "Samsung";
    }

    @Override
    public String returnSpeed() {
        return "2.1 GHZ";
    }
}
