/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tavo.butas;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

/**
 *
 * @author Linas
 */
public class Settings {

    private float electricityPrice;
    private float waterPrice;
    private float hotWaterPrice;
    private float heatingPrice;

    private float electricityConsumption;
    private float waterConsumption;
    private float hotWaterConsumption;
    private float heatingConsumption;

    public Settings() {
        Scanner in = null;

        try {
            in = new Scanner(new FileReader("prices.txt"));
        } catch (FileNotFoundException ex) {

        }

        this.electricityPrice = in.nextFloat();
        this.waterPrice = in.nextFloat();
        this.hotWaterPrice = in.nextFloat();
        this.heatingPrice = in.nextFloat();

        try {
            in = new Scanner(new FileReader("settings.txt"));
        } catch (FileNotFoundException ex) {

        }

        this.electricityConsumption = in.nextFloat();
        this.waterConsumption = in.nextFloat();
        this.hotWaterConsumption = in.nextFloat();
        this.heatingConsumption = in.nextFloat();
    }

    public float getElectricityPrice() {
        return electricityPrice;
    }

    public float getWaterPrice() {
        return waterPrice;
    }
    
    public float getHotWaterPrice() {
        return hotWaterPrice;
    }

    public float getHeatingPrice() {
        return heatingPrice;
    }

    public float getElectricityConsumption() {
        return electricityConsumption;
    }

    public float getWaterConsumption() {
        return waterConsumption;
    }
    
    public float getHotWaterConsumption() {
        return hotWaterConsumption;
    }

    public float getHeatingConsumption() {
        return heatingConsumption;
    }

}
