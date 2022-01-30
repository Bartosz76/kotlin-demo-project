package battleSimulator.logistics

import battleSimulator.dwarves.DwarvenArmy
import battleSimulator.elves.ElvenArmy
import battleSimulator.orcs.OrcishArmy

internal class TrainingField: Logistics {

    private var dwarves: DwarvenArmy = DwarvenArmy()
    private var elves: ElvenArmy = ElvenArmy()
    private var orcs: OrcishArmy = OrcishArmy()

    internal fun displayUnitTrainingPanel(chosenFaction: String) {
        printInitialPanelLine()
        Thread.sleep(500)
        println("1. See the current army's state.")
        Thread.sleep(500)
        println("2. See training options.")
        Thread.sleep(500)
        println("3. See recommendations.")
        var chosenOption = readLine()
        when (chosenOption) {
            "1" -> { when (chosenFaction) {
                "1" -> dwarves.showTheTroops()
                "2" -> orcs.showTheTroops()
                "3" -> elves.showTheTroops()
            } }
            "2" -> displayTrainingOptions(chosenFaction)
            "3" -> {  }
        }
    }

    private fun displayTrainingOptions(chosenFaction: String) {
        println("You can train following units:")
        when (chosenFaction) {
            "1" -> { dwarves.showAvailableUnitsWithCost() }
            "2" -> {}
            "3" -> {}
        }
    }

    override fun printInitialPanelLine() {
        println("You can now:")
    }
}