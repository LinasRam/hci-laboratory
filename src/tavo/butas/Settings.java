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
    private float heatingPrice;

    private int electricityConsumption;
    private int waterConsumption;
    private int heatingConsumption;

    public Settings() {
        Scanner in = null;

        try {
            in = new Scanner(new FileReader("prices.txt"));
        } catch (FileNotFoundException ex) {

        }

        this.electricityPrice = in.nextFloat();
        this.waterPrice = in.nextFloat();
        this.heatingPrice = in.nextFloat();

        try {
            in = new Scanner(new FileReader("settings.txt"));
        } catch (FileNotFoundException ex) {

        }

        this.electricityConsumption = in.nextInt();
        this.waterConsumption = in.nextInt();
        this.heatingConsumption = in.nextInt();
    }

    public float getElectricityPrice() {
        return electricityPrice;
    }

    public float getWaterPrice() {
        return waterPrice;
    }

    public float getHeatingPrice() {
        return heatingPrice;
    }

    public int getElectricityConsumption() {
        return electricityConsumption;
    }

    public int getWaterConsumption() {
        return waterConsumption;
    }

    public int getHeatingConsumption() {
        return heatingConsumption;
    }

}
