package org.ehop.server.model;

import lombok.Data;

import java.util.Map;

@Data
public class Service {
    private String id;
    private String name;
    private String description;
    private String logoUrl;
    private Map<AccessMethod, AccessCredential> accessMethods;
    private Map<PaymentType, Double> charges;
}