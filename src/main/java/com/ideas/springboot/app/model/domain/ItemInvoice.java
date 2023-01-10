package com.ideas.springboot.app.model.domain;

public class ItemInvoice {
    private Product product;
    private Integer quantity;

    public ItemInvoice(Product product, Integer quantity) {
        this.product = product;
        this.quantity = quantity;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Integer calculateAmount(){
        return quantity * product.getPrice();
    }

}
