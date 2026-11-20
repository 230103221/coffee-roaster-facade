public class CoffeeRoasterFacade {
    private final BeanHopperGate hopperGate;
    private final RoastingDrumMotor drumMotor;
    private final HeatingChamber heatingChamber;
    private final CoolingTraySystem coolingTray;
    private final TelemetryLogger logger;

    public CoffeeRoasterFacade() {
        this.hopperGate = new BeanHopperGate();
        this.drumMotor = new RoastingDrumMotor();
        this.heatingChamber = new HeatingChamber();
        this.coolingTray = new CoolingTraySystem();
        this.logger = new TelemetryLogger();
    }

    public void emergencyAbort(String reason) {
        logger.logState("ABORT", "Emergency shutdown triggered: " + reason);
        heatingChamber.extinguishBurner();
        hopperGate.closeGate();
        drumMotor.stopRotation();
        coolingTray.finishCoolingCycle();
    }
}