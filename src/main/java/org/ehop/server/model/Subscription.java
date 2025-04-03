package org.ehop.server.model;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@Data
@AllArgsConstructor
public class Subscription {
    private String id;
    private String name;
    private String description;
    private List<Benefit> benefits;
    private double charge;
    private Validity validity;
}
