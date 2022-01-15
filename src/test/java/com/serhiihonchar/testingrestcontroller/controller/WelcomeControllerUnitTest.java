package com.serhiihonchar.testingrestcontroller.controller;

import com.serhiihonchar.testingrestcontroller.service.WelcomeService;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

class WelcomeControllerUnitTest {

    @Test
    void shouldWelcome() {
        WelcomeService welcomeService = Mockito.mock(WelcomeService.class);
        when(welcomeService.getWelcomeMessage("Serhii")).thenReturn("Welcome Serhii!");
        WelcomeController welcomeController = new WelcomeController(welcomeService);
        assertEquals("Welcome Serhii!", welcomeController.welcome("Serhii"));
    }
}