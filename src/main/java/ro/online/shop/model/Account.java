package ro.online.shop.model;

import java.util.List;

public class Account {
    private String name;
    private List<Participant> participants;
    private List<Product> products;

    public Account(String name, List<Participant> participants, List<Product> products) {
        this.name = name;
        this.participants = participants;
        this.products = products;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Participant> getParticipants() {
        return participants;
    }

    public void setParticipants(List<Participant> participants) {
        this.participants = participants;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }
}




