/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package za.ac.cput.finalproject;

/**
 *
 * @author BURGERR
 */
public class Product {
    private int prodId;
    private String prodDescription;

    public Product(int prodId, String prodDescription) {
        this.prodId = prodId;
        this.prodDescription = prodDescription;
    }

    public int getProdId() {
        return prodId;
    }

    public void setProdId(int prodId) {
        this.prodId = prodId;
    }

    public String getProdDescription() {
        return prodDescription;
    }

    public void setProdDescription(String prodDescription) {
        this.prodDescription = prodDescription;
    }

    @Override
    public String toString() {
        return "Product{" + "prodId=" + prodId + ", prodDescription=" + prodDescription + '}';
    }
    
    
}
