package com.bielpina.services;

import com.bielpina.entities.Order;
import org.springframework.stereotype.Service;

@Service
public class ShippingService {

    public double shipment(Order order){

        double shipping;
        if (order.getBasic() < 100) {
            return shipping = 20;
        } else if (order.getBasic() < 200) {
            return shipping = 12;
        }
        else {
            return shipping = 0;
        }

    }

}
