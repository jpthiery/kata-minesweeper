package fr.xebia.jpthiery.kata.minesweeper.stages;

import com.tngtech.jgiven.Stage;
import com.tngtech.jgiven.annotation.ExpectedScenarioState;
import com.tngtech.jgiven.annotation.ProvidedScenarioState;
import fr.xebia.jpthiery.kata.minesweeper.MineSweeper;

public class When <SELF extends When<?>> extends Stage<SELF> {

    @ExpectedScenarioState
    MineSweeper mineSweeper;

    @ProvidedScenarioState
    String result;

    public SELF i_request_hello() {
        result = MineSweeper.sayHello();
        return self();
    }
}
