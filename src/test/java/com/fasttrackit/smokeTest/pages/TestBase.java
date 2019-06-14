package com.fasttrackit.smokeTest.pages;

import net.thucydides.core.steps.ScenarioSteps;

import java.util.HashMap;
import java.util.Map;

public class TestBase extends ScenarioSteps {


    private static final Map<String, Object> STEP_VARIABLES = new HashMap<>();

    public static Map<String, Object> getStepVariables() {
        return STEP_VARIABLES;
    }
}
