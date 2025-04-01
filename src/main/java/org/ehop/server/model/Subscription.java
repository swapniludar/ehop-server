package org.ehop.server.model;

import lombok.Data;

import java.util.List;

@Data
public class Subscription {
    private String id;
    private String name;
    private String description;
    private List<Service> services;
    private double charge;
    private Validity validity;
}
