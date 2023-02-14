package org.example;

import static org.junit.jupiter.api.Assertions.*;

class PersonaTest {

    @org.junit.jupiter.api.Test
    void testAge() {
        int age = 30;
        String name = "Matteo";
        Persona persona = new Persona(age, name);

        assertEquals(age, persona.getAge(),0);
        assertEquals(name, persona.getName());

    }
}