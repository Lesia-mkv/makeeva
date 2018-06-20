package com.company;

import sun.net.www.content.text.Generic;

import java.util.Set;

/**
 * Created by Student on 20.06.2018.
 */
public class Katalog {
    private String name;
    private Set<Tovar> products;

    public Katalog(String name, Set<Tovar> products) {
        this.name = name;
        this.products = products;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<Tovar> getProducts() {
        return products;
    }

    public void setProducts(Set<Tovar> products) {
        this.products = products;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Katalog katalog = (Katalog) o;

        if (name != null ? !name.equals(katalog.name) : katalog.name != null) return false;
        return products != null ? products.equals(katalog.products) : katalog.products == null;

    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (products != null ? products.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Katalog{" +
                "name='" + name + '\'' +
                ", products=" + products +
                '}';
    }
}
