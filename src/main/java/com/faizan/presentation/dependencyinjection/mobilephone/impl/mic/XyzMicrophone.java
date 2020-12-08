package com.faizan.presentation.dependencyinjection.mobilephone.impl.mic;

import com.faizan.presentation.dependencyinjection.mobilephone.type.Microphone;
import org.springframework.stereotype.Component;

@Component
public class XyzMicrophone implements Microphone {

    @Override
    public void recordAudio() {
        System.out.println("Recording Audio");
    }

}
