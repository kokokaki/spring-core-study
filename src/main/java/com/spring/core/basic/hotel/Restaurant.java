package com.spring.core.basic.hotel;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class Restaurant {

    //@Autowired
    private final Chef chef;

    //@Autowired
    /*public Restaurant(Chef chef) {
        this.chef = chef;
    }*/

    /*@Autowired
    public void setChef(Chef chef) {
        this.chef = chef;
    }*/

    //저녁 식사 주문 기능
    public void orderDinner() {
        System.out.println("저녁 식사를 주문합니다.");
        chef.cook();
    }
}
