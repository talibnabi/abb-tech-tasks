package project.dao.controller;

import project.dao.service.FamilyService;

public class FamilyController {
    private final FamilyService familyService;

    public FamilyController(FamilyService familyService) {
        this.familyService = familyService;
    }
}
