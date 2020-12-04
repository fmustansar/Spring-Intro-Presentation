package com.faizan.presentation.tightcoupling.mobilephone;

import com.faizan.presentation.tightcoupling.mobilephone.components.SnapDragonMicroProcessor;
import com.faizan.presentation.tightcoupling.mobilephone.components.SonyCamera;
import com.faizan.presentation.tightcoupling.mobilephone.components.XyzMicrophone;

public class MobilePhone {
    SnapDragonMicroProcessor processor = new SnapDragonMicroProcessor();
    SonyCamera camera = new SonyCamera();
    XyzMicrophone mic = new XyzMicrophone();


    /**
     * What will happen here is that when any of these modules will change,
     * I will have to change the Mobile phone class.
     * As they are tightly coupled with each other.
     */
}
