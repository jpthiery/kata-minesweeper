package fr.xebia.jpthiery.kata.minesweepper

class MineSweeper {

    companion object {
        fun process(input: String): String {
            val description = Description.create(input)
            var res = "Field #1:\n"
            for (i in 1..description.nbRow) {
                for (j in 1..description.nbColumn) {
                    when (description.plan[i - 1][j - 1]) {
                        Slot.EMPTY -> res += defineNumberMineInNeighbour(description, i - 1, j - 1)
                        Slot.MINE -> res += "*"
                    }
                    if (j == description.nbColumn)
                        res += "\n"
                }

            }
            return res
        }

        private fun defineNumberMineInNeighbour(description: Description, row: Int, column: Int): String {
            var nbMine = description.getSlotValue(row - 1, column - 1)
            nbMine += description.getSlotValue(row - 1, column)
            nbMine += description.getSlotValue(row - 1, column + 1)

            nbMine += description.getSlotValue(row, column - 1)
            nbMine += description.getSlotValue(row, column + 1)

            nbMine += description.getSlotValue(row + 1, column - 1)
            nbMine += description.getSlotValue(row + 1, column)
            nbMine += description.getSlotValue(row + 1, column + 1)
            return nbMine.toString()
        }


    }

}

enum class Slot {
    EMPTY,
    MINE
}

data class Description(val nbRow: Int, val nbColumn: Int, val plan: Array<Array<Slot>>) {

    companion object {
        fun create(input: String): Description {
            val lines = input.split("\n")
            val description = lines[0]
            val descriptionSplitted = description.split(' ')
            val nbRow = Integer.parseInt(descriptionSplitted[0])
            val nbCollumns = Integer.parseInt(descriptionSplitted[1])

            var plan = Array(nbRow, { Array(nbCollumns, { Slot.EMPTY }) })

            for (i in 2..(lines.size - 1)) {
                val line = lines[i - 1]
                if (line.startsWith(".") or line.startsWith("*")) {
                    val lineSplitted = line
                            .replace("\n", "")
                            .replace(" ", "")
                            .toCharArray()
                    for (j in 1..(lineSplitted.size)) {
                        val value = lineSplitted[j - 1]
                        plan[i - 2][j - 1] = defineSlot(value)
                    }
                }
            }

            return Description(nbRow, nbCollumns, plan)
        }

        private fun defineSlot(input: Char): Slot {
            when (input) {
                '.' -> return Slot.EMPTY
                '*' -> return Slot.MINE
                else -> throw RuntimeException("Unable to determinate slot type $input")
            }
        }
    }

    fun getSlotValue(row: Int, column: Int): Int {
        if (row < 0 || column < 0 || row >= nbRow || column >= nbColumn)
            return 0
        when (plan[row][column]) {
            Slot.EMPTY -> return 0
            Slot.MINE -> return 1
        }
    }

}