package fr.xebia.jpthiery.kata.minesweeper;

public class MineSweeper {

    public Plan feed(String input) {
        return new Plan(input);
    }

    public class Plan {

        private String input;
        private static final int UN = 1;
        private static final int DEUX = 2;
        private static final String STAR = "*";

        public Plan(String input) {
            this.input = input;
        }

        public int numberRows() {
            if (input.contains("\n")) {
                return DEUX;
            }

            return UN;
        }

        public boolean hasMine() {
            return input.contains(STAR);
        }

        public int numberMines() {
            return input.split("\\*").length;
        }
    }

}
