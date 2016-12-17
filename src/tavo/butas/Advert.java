/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tavo.butas;

/**
 *
 * @author Linas
 */
public class Advert implements Comparable<Advert> {

    private String name;
    private String district;
    private String rooms;
    private String price;
    private String area;
    private String imageUrl;

    public Advert(String name, String district, String rooms, String price, String area, String imageUrl) {
        this.name = name;
        this.district = district;
        this.rooms = rooms;
        this.price = price;
        this.area = area;
        this.imageUrl = "/tavo/butas/images/" + imageUrl;
    }

    public String getName() {
        return name;
    }

    public String getDistrict() {
        return district;
    }

    public String getRooms() {
        return rooms;
    }

    public String getPrice() {
        return price;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public String getArea() {
        return area;
    }

    public String getElectricityTaxes() {
        Settings settings = new Settings();

        float taxes = settings.getElectricityPrice() * settings.getElectricityConsumption();

        return String.format("%.2f", taxes);
    }

    public String getWaterTaxes() {
        Settings settings = new Settings();

        float taxes = settings.getWaterPrice() * settings.getWaterConsumption()
                + settings.getHeatingPrice() * settings.getHotWaterConsumption();

        return String.format("%.2f", taxes);
    }

    public String getHeatingTaxes() {
        Settings settings = new Settings();

        float taxes = settings.getHeatingPrice() * settings.getHeatingConsumption() * Float.parseFloat(this.area);

        return String.format("%.2f", taxes);
    }

    public String getCombinedTaxes() {
        float taxes = Float.parseFloat(this.getElectricityTaxes()) + Float.parseFloat(this.getWaterTaxes())
                + Float.parseFloat(this.getHeatingTaxes());

        return String.format("%.2f", taxes);
    }

    public String getFullPrice() {
        float taxes = Float.parseFloat(this.getCombinedTaxes()) + Float.parseFloat(this.getPrice());

        return String.format("%.2f", taxes);
    }

    @Override
    public int compareTo(Advert o) {
        return Integer.parseInt(this.getPrice()) - Integer.parseInt(o.getPrice());
    }

}
