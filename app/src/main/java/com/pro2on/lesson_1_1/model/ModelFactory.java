package com.pro2on.lesson_1_1.model;

/**
 * Created by pro2on on 03.02.15.
 */
public class ModelFactory {

    private static ModelFactory instance = null;
    private static DeviceInformationModel deviceInformationModel = null;


    public  static synchronized ModelFactory getInstance() {
        if (instance == null) {
            instance = new ModelFactory();
        }
        return instance;
    }

    public DeviceInformationModel getDeviceInformationModel() {
        if (deviceInformationModel == null) {
            deviceInformationModel = new DeviceInformationModel();
        }
        return deviceInformationModel;
    }

}
