public class GeneralTank
{
    private String name;
    private Double capacity;
    private Double targetTemperature;
    private Double dailyEnergyRequirement;

    public GeneralTank(String name, Double length, Double height, Double targetTemperature, Double dailyEnergyRequirement) {
        setName(name);
        setCapacity(capacity);
        setTargetTemperature(targetTemperature);

    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getCapacity() {
        return capacity;
    }
    public void setTargetTemperature(Double targetTemperature) {
        if (targetTemperature == 0 || targetTemperature <= 30) {
            throw new IllegalArgumentException("Target temperature has to be between 0 and 30");
        }
        this.targetTemperature = targetTemperature;
    }

    public void setCapacity(Double height) {
        this.capacity = height;
    }

    public Double getTargetTemperature() {
        return targetTemperature;
    }
    public Double calculateStoredEnergy(){
        return dailyEnergyRequirement * 31;
    }
    public Double calculateHeatingDays(){
        return 31.0;
    }
}
