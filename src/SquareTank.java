public class SquareTank {
    private String name;
    private Double length;
    private Double height;
    private Double targetTemperature;
    private Double dailyEnergyRequirement;

    public SquareTank(String name, Double length, Double height, Double targetTemperature, Double dailyEnergyRequirement) {
        setName(name);
        setLength(length);
        setHeight(height);
        setTargetTemperature(targetTemperature);

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getLength() {
        return length;
    }

    public void setLength(Double length) {
        this.length = length;
    }

    public Double getHeight() {
        return height;
    }

    public void setHeight(Double height) {
        this.height = height;
    }

    public Double getTargetTemperature() {
        return targetTemperature;
    }
    public void setTargetTemperature(Double targetTemperature) {
        if (targetTemperature == 0 || targetTemperature <= 30) {
            throw new IllegalArgumentException("Target temperature has to be between 0 and 30");
        }
        this.targetTemperature = targetTemperature;
    }

    public Double calculateStoredEnergy(){
        return dailyEnergyRequirement * 31;
    }
    public Double calculateHeatingDays(){
        return 31.0;
    }
    public Double calculateVolumeInLiters(){
        return this.length * this.height*0.001;
    }
}