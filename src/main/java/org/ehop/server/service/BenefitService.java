package org.ehop.server.service;

import com.fasterxml.jackson.databind.ObjectMapper;
import jakarta.annotation.PostConstruct;

import org.ehop.server.model.Benefit;
import org.springframework.core.io.Resource;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@Service
public class BenefitService {
    private List<Benefit> benefits;

    @PostConstruct
    public void init() throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        PathMatchingResourcePatternResolver resolver = new PathMatchingResourcePatternResolver();
        Resource[] resources = resolver.getResources("classpath:benefits/*.json");
        for (Resource resource : resources) {
            Benefit benefit = objectMapper.readValue(resource.getInputStream(), Benefit.class);
            if (benefits == null) {
                benefits = new ArrayList<>();
            }
            benefits.add(benefit);
        }
    }

    public List<Benefit> getBenefits() {
        return benefits;
    }

    public Benefit getBenefitById(String id) {
        return benefits.stream()
                .filter(benefit -> benefit.getId().equals(id))
                .findFirst()
                .orElse(null);
    }
}
