package com.faizan.presentation.dependencyinjection.mobilephone.impl.camera;

import com.faizan.presentation.dependencyinjection.mobilephone.type.Camera;
import org.springframework.stereotype.Component;

@Component
public class SamsungCamera implements Camera {
    @Override
    public void snapshot() {
        System.out.println("Taking picture with Samsung Camera....");
    }
}
