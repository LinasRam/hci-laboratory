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
public class Advert {

    private String name;
    private String district;
    private String rooms;
    private String price;

    public Advert(String name, String district, String rooms, String price) {
        this.name = name;
        this.district = district;
        this.rooms = rooms;
        this.price = price;
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

}
