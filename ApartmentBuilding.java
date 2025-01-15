public class ApartmentBuilding extends Building {
private int numFloors, unitsPerFloor;
private boolean hasElevator, hasCentralAir;
private String managingCompany;
public ApartmentBuilding(int numFloors, int unitsPerFloor, boolean hasElevator, boolean hasCentralAir, String managingCompany) {
this.numFloors = numFloors;
this.unitsPerFloor = unitsPerFloor;
this.hasElevator = hasElevator;
this.hasCentralAir = hasCentralAir;
this.managingCompany = managingCompany;
}

public int getTotalUnits() {
return unitsPerFloor * numFloors;
}

public boolean isLuxuryBuilding() {
if (unitsPerFloor <= 2 && hasElevator && hasCentralAir)
return true;
else
return false;
}
}
