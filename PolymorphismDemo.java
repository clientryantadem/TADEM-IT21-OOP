
class ResponseUnit {
    private final String unitId;

    public ResponseUnit(String unitId) {
        this.unitId = unitId;
    }

    public String getUnitId() {
        return unitId;
    }

  
    public void respond(String incident) {
        System.out.println("Unit " + unitId + " acknowledges: " + incident);
    }
}


class AmbulanceUnit extends ResponseUnit {

    public AmbulanceUnit(String unitId) {
        super(unitId);
    }

    @Override
    public void respond(String incident) {
        System.out.println("Ambulance " + getUnitId()
                + " is en route to \"" + incident
                + "\" with a paramedic team and a trauma kit.");
    }
}


class FireEngineUnit extends ResponseUnit {

    public FireEngineUnit(String unitId) {
        super(unitId);
    }

    @Override
    public void respond(String incident) {
        System.out.println("Fire engine " + getUnitId()
                + " is rolling to \"" + incident
                + "\" with hoses, ladders, and a four-person crew.");
    }
}

public class PolymorphismDemo {

    public static void main(String[] args) {
        String incident = "structure fire at 418 Maple Street";


        ResponseUnit firstOnScene = new AmbulanceUnit("A-14");
        ResponseUnit secondOnScene = new FireEngineUnit("E-3");

     
        dispatch(firstOnScene, incident);
        dispatch(secondOnScene, incident);
    }


    private static void dispatch(ResponseUnit unit, String incident) {
        unit.respond(incident);
    }
}


