public class Vehicle
{
    Drive driveCapability;
    public Vehicle(Drive driveCapability)
    {
       this.driveCapability = driveCapability;
    }
    public void drive()
    {
        driveCapability.drive();
    }
}
