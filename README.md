# Coffee Roaster Facade

This is a Java practice project that uses the **Facade Design Pattern**.

## About the Project
A coffee roaster machine has 5 separate parts:
1. `BeanHopperGate` – holds and drops green coffee beans.
2. `RoastingDrumMotor` – turns the roasting drum.
3. `HeatingChamber` – heats the beans with a gas burner.
4. `CoolingTraySystem` – cools the hot beans after roasting.
5. `TelemetryLogger` – writes logs for every step.

If you call these parts in the wrong order, the program stops with an error. `CoffeeRoasterFacade` puts all 5 parts behind one simple class. It runs every step in the right order and stops the machine safely if something goes wrong.

## How to Run
Open the terminal in the project folder and run:

```bash
javac *.java
java Main
