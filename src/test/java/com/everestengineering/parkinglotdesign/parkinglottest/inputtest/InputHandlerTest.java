package com.everestengineering.parkinglotdesign.parkinglottest.inputtest;

import com.everestengineering.parkinglotdesign.input.InputHandler;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class InputHandlerTest {
    @Test
    public void inputHandleTesting()
    {
        InputHandler handler = new InputHandler();
        String inputCommandFromUser = handler.getInput();
        String input="create_parking_lot PR1234 2 6";
        InputStream in=new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        assertEquals(input,handler.getInput());

    }
}
