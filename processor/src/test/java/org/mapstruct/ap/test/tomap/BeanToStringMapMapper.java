/*
 * Copyright MapStruct Authors.
 *
 * Licensed under the Apache License version 2.0, available at http://www.apache.org/licenses/LICENSE-2.0
 */

package org.mapstruct.ap.test.tomap;

import java.time.LocalDate;
import java.util.Date;
import java.util.Map;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

/**
 * @author Filip Hrisafov
 */
@Mapper
public interface BeanToStringMapMapper {
    BeanToStringMapMapper INSTANCE = Mappers.getMapper( BeanToStringMapMapper.class );

    Order fromMap(Map<String, String> map);

    // Map<String, String> toMap(Order order);

    class Order {
        private String name;
        private double price;
        private Date orderDate;
        private LocalDate shipmentDate;

        public Order() {
        }

        public String getName() {
            return this.name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public double getPrice() {
            return this.price;
        }

        public void setPrice(double price) {
            this.price = price;
        }

        public Date getOrderDate() {
            return this.orderDate;
        }

        public void setOrderDate(Date orderDate) {
            this.orderDate = orderDate;
        }

        public LocalDate getShipmentDate() {
            return this.shipmentDate;
        }

        public void setShipmentDate(LocalDate shipmentDate) {
            this.shipmentDate = shipmentDate;
        }
    }

}
