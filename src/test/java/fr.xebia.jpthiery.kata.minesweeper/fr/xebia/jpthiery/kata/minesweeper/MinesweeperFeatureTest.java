package fr.xebia.jpthiery.kata.minesweeper;

import com.tngtech.jgiven.junit.ScenarioTest;
import com.tngtech.jgiven.junit5.JGivenExtension;
import fr.xebia.jpthiery.kata.minesweeper.stages.Given;
import fr.xebia.jpthiery.kata.minesweeper.stages.Then;
import fr.xebia.jpthiery.kata.minesweeper.stages.When;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

@ExtendWith(JGivenExtension.class)
public class MinesweeperFeatureTest extends ScenarioTest<Given<?>, When<?>, Then<?>> {

    @Test
    public void minesweeper_say_hello() {
        given().i_have_a_mine_sweeper();
        when().i_request_hello();
        then().minesweeper_say_hello();
    }

}
