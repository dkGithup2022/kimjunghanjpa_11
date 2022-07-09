package com.dk.domain;

import com.dk.domain.item.Item;
import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "ORDER_TABLE")
@Data
public class OrderItem {
    @Id
    @GeneratedValue
    @Column(name= "ORDER_ITEM_ID")
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="ORDER_ID")
    private Item item;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ORDER_ID")
    private Order order;

    private int orderPrice;
    private int count;
}
