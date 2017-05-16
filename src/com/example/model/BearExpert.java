package com.example.model;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by richard on 2017/2/25.
 */
public class BearExpert {
    public List getBrands(String color){
        List brands = new ArrayList();
        if(color.equals("amber")){
            brands.add("Jack Amber");
            brands.add("Red Moose");
        }else {
            brands.add("Jail Pale Ale");
            brands.add("Gout Stout");
        }
        return brands;
    }
}
