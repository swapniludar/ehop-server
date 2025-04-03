package org.ehop.server.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Map;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Benefit {
    private String id;
    private String name;
    private String description;
    private String logo;
    private Map<AccessMethod, AccessCredential> accessMethods;
    private Map<PaymentType, Double> charges;
}