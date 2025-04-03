package org.ehop.server;

import org.ehop.server.model.Benefit;
import org.ehop.server.service.BenefitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/benefits")
public class BenefitController {

    @Autowired
    private BenefitService benefitService;

    @GetMapping
    public List<Benefit> getAllUsers() {
        return benefitService.getBenefits();
    }

    @GetMapping("/{id}")
    public Benefit getBenefitById(@PathVariable String id) {
        return benefitService.getBenefitById(id);
    }
}
