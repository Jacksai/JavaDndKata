package com.jacksai.dndgame.gui;

import com.jacksai.dndgame.gui.asciiPanel.AsciiPanel;
import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.*;

public class TerminalSingletonTest {

    @Test
    public void shouldReturnTheSameInstance() throws Exception {
        //Arrange
        TerminalSingleton ts1 = TerminalSingleton.getInstance();
        TerminalSingleton ts2 = TerminalSingleton.getInstance();

        //Assert
        assertEquals(ts1,ts2);
    }

    @Test
    public void shouldReturnTheSameTerminal() throws Exception {
        //Act
        AsciiPanel firstTerminal = TerminalSingleton.getInstance().getTerminal();
        AsciiPanel secondTerminal = TerminalSingleton.getInstance().getTerminal();

        //Assert
        assertEquals(firstTerminal, secondTerminal);
    }
}