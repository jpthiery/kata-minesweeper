package fr.xebia.jpthiery.kata.minesweeper.stages;

import com.tngtech.jgiven.Stage;
import com.tngtech.jgiven.annotation.ProvidedScenarioState;
import fr.xebia.jpthiery.kata.minesweeper.MineSweeper;

public class Given<SELF extends Given<?>> extends Stage<SELF> {

    @ProvidedScenarioState
    MineSweeper mineSweeper;

    public SELF i_have_a_mine_sweeper() {
        mineSweeper = new MineSweeper();
        return self();
    }

}
