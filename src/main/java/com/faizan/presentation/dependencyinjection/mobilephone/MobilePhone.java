package com.faizan.presentation.dependencyinjection.mobilephone;

import com.faizan.presentation.dependencyinjection.mobilephone.type.Camera;
import com.faizan.presentation.dependencyinjection.mobilephone.type.Microphone;
import com.faizan.presentation.dependencyinjection.mobilephone.type.Processor;


public class MobilePhone {
    Processor processor;
    Camera camera;
    Microphone mic;


    /**
     * Does this resolves the problem???
     *
     * Not so much, as we do not use this way to Program in Java.
     *
     * We need to instantiate these objects
     *
     * We also need to find a way to make this instantiation, independent.
     *
     */
}
