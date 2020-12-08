package com.faizan.presentation.dependencyinjection.mobilephone;

import com.faizan.presentation.dependencyinjection.mobilephone.type.Camera;
import com.faizan.presentation.dependencyinjection.mobilephone.type.Microphone;
import com.faizan.presentation.dependencyinjection.mobilephone.type.Processor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Objects;


@Component
public class MobilePhone {
    @Autowired
    Processor processor;

    @Autowired
    Camera camera;

    @Autowired
    Microphone mic;

    public void start() {
        if(Objects.nonNull(processor)) {
            System.out.println("Processor has started with clock speed -> "+ processor.returnSpeed());
        } else {
            System.out.println("Processor not found");
        }

        if(Objects.nonNull(camera)) {
            System.out.println("Camera has started");
        } else {
            System.out.println("Camera not found");
        }

        if(Objects.nonNull(mic)) {
            System.out.println("Mic is detected");
        } else {
            System.out.println("Mic not found");
        }
    }

}
