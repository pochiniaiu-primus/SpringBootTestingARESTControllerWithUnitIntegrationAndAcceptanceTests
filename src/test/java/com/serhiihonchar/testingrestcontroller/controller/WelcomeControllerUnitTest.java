package com.serhiihonchar.testingrestcontroller.controller;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WelcomeControllerUnitTest {

    @Test
    void shouldWelcome() {
        WelcomeController welcomeController = new WelcomeController();
        assertEquals("Welcome Serhii!", welcomeController.welcome("Serhii"));
    }
}