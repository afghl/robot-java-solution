package com.robotgame.command;


import org.hamcrest.Factory;
import org.junit.Test;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.instanceOf;

public class TestCommandFactory {

    @Test
    public void canCreateCommands() {
        Command c = CommandFactory.create("PLACE");
        assertThat(c, instanceOf(PlaceCommand.class));
    }

}
