package com.faizan.presentation.dependencyinjection.mobilephone.impl.processor;

import com.faizan.presentation.dependencyinjection.mobilephone.type.Processor;
import org.springframework.stereotype.Component;


@Component
public class MediaTechMicroProcessor implements Processor {

    @Override
    public String name() {
        return "MEDIATECH";
    }

    @Override
    public String returnSpeed() {
        return "2.7 GHZ";
    }
}
