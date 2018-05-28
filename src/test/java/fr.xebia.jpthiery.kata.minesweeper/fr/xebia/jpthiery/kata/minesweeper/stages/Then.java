package fr.xebia.jpthiery.kata.minesweeper.stages;

import com.tngtech.jgiven.Stage;
import com.tngtech.jgiven.annotation.ExpectedScenarioState;

import static org.assertj.core.api.Assertions.assertThat;

public class Then<SELF extends Then<?>> extends Stage<SELF> {

    @ExpectedScenarioState
    String result;

    public SELF minesweeper_say_hello() {
        assertThat(result).isEqualTo("Hello");
        return self();
    }

}
