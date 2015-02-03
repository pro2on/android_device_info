package com.pro2on.lesson_1_1.model;

import android.content.Context;
import android.os.Build;
import android.view.Display;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;

import com.pro2on.lesson_1_1.pojo.DeviceInformation;

/**
 * Created by pro2on on 03.02.15.
 */
public class DeviceInformationModel {

    private DeviceInformation deviceInformation;


    public DeviceInformationModel() {

        deviceInformation = new DeviceInformation();

        deviceInformation.setApiLevel(Build.VERSION.SDK_INT);
        deviceInformation.setId(Build.ID);
        deviceInformation.setDisplay(Build.DISPLAY);
        deviceInformation.setDevice(Build.DEVICE);
        deviceInformation.setVersion(Build.VERSION.RELEASE);
        deviceInformation.setBrand(Build.BRAND);
        deviceInformation.setBoard(Build.BOARD);
        deviceInformation.setHadrware(Build.HARDWARE);
        deviceInformation.setRadioVersion(Build.getRadioVersion());
        deviceInformation.setBootloader(Build.BOOTLOADER);
        deviceInformation.setFingerprint(Build.FINGERPRINT);
        deviceInformation.setHost(Build.HOST);
        deviceInformation.setModel(Build.MODEL);
        deviceInformation.setSerial(Build.SERIAL);
        deviceInformation.setProduct(Build.PRODUCT);
        deviceInformation.setUser(Build.USER);

    }

    public TableLayout getInformationAsTableLayout(Context context) {

        TableLayout tableLayout = new TableLayout(context);
        tableLayout.setLayoutParams(new ViewGroup.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT,
                ViewGroup.LayoutParams.WRAP_CONTENT));


        tableLayout.addView(setNewRow(context, "API level: ", String.valueOf(deviceInformation.getApiLevel())));
        tableLayout.addView(setNewRow(context, "ID: ", deviceInformation.getId()));
        tableLayout.addView(setNewRow(context, "Display: ", deviceInformation.getDisplay()));
        tableLayout.addView(setNewRow(context, "Device: ", deviceInformation.getDevice()));
        tableLayout.addView(setNewRow(context, "Version: ", deviceInformation.getVersion()));
        tableLayout.addView(setNewRow(context, "Brand: ", deviceInformation.getBrand()));
        tableLayout.addView(setNewRow(context, "Model: ", deviceInformation.getModel()));
        tableLayout.addView(setNewRow(context, "Board: ", deviceInformation.getBoard()));
        tableLayout.addView(setNewRow(context, "Hardware: ", deviceInformation.getHadrware()));
        tableLayout.addView(setNewRow(context, "Radio version: ", deviceInformation.getRadioVersion()));
        tableLayout.addView(setNewRow(context, "Bootloader: ", deviceInformation.getBootloader()));
        tableLayout.addView(setNewRow(context, "Fingerprint: ", deviceInformation.getFingerprint()));
        tableLayout.addView(setNewRow(context, "Host: ", deviceInformation.getHost()));
        tableLayout.addView(setNewRow(context, "Serial: ", deviceInformation.getSerial()));
        tableLayout.addView(setNewRow(context, "Product: ", deviceInformation.getProduct()));
        tableLayout.addView(setNewRow(context, "User: ", deviceInformation.getUser()));

        return tableLayout;
    }

    public DeviceInformation getDeviceInformation() {
        return deviceInformation;
    }

    private TableRow setNewRow(Context context, String label, String value) {
        TableRow tableRow = new TableRow(context);
        tableRow.setLayoutParams(new ViewGroup.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT,
                ViewGroup.LayoutParams.WRAP_CONTENT));

        TextView textLable = new TextView(context);
        TextView textValue = new TextView(context);

        textLable.setText(label);
        textValue.setText(value);

        tableRow.addView(textLable);
        tableRow.addView(textValue);

        return tableRow;
    }

}
