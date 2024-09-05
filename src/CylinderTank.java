/**
 * Repräsentiert einen zylindrischen Tank, der für Energiespeicherberechnungen verwendet wird.
 * Beinhaltet Attribute wie Radius, Höhe, Zieltemperatur und täglichen Energiebedarf.
 *
 * @author Lucas
 * @version 1.0
 * @since 2024-09-05
 */
public class CylinderTank {
    /** Name des Tanks. */
    private String name;

    /** Radius des zylindrischen Tanks in Metern. */
    private Double radius;

    /** Höhe des zylindrischen Tanks in Metern. */
    private Double height;

    /** Zieltemperatur des Tanks in Grad Celsius. */
    private Double targetTemperature;

    /** Täglicher Energiebedarf des Tanks in kWh. */
    private Double dailyEnergyRequirement;

    /**
     * Konstruktor, der einen zylindrischen Tank mit den angegebenen Parametern erstellt.
     *
     * @param name                  der Name des Tanks
     * @param radius                der Radius des Tanks
     * @param height                die Höhe des Tanks
     * @param targetTemperature     die Zieltemperatur des Tanks
     * @param dailyEnergyRequirement der tägliche Energiebedarf des Tanks
     */
    public CylinderTank(String name, Double radius, Double height, Double targetTemperature, Double dailyEnergyRequirement) {
        setName(name);
        setRadius(radius);
        setHeight(height);
        setTargetTemperature(targetTemperature);
        setDailyEnergyRequirement(dailyEnergyRequirement);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getRadius() {
        return radius;
    }

    public void setRadius(Double length) {
        this.radius = length;
    }

    public Double getHeight() {
        return height;
    }

    public void setHeight(Double height) {
        this.height = height;
    }

    public void setDailyEnergyRequirement(Double dailyEnergyRequirement) {
        this.dailyEnergyRequirement = dailyEnergyRequirement;
    }

    public Double getDailyEnergyRequirement() {
        return dailyEnergyRequirement;
    }

    public Double getTargetTemperature() {
        return targetTemperature;
    }

    /**
     * Setzt die Zieltemperatur des Tanks.
     * Löst eine Ausnahme aus, wenn die Temperatur nicht zwischen 0 und 30 Grad Celsius liegt.
     *
     * @param targetTemperature die Zieltemperatur des Tanks
     * @throws IllegalArgumentException wenn die Temperatur nicht zwischen 0 und 30 Grad liegt
     */
    public void setTargetTemperature(Double targetTemperature) {
        if (targetTemperature == 0 || targetTemperature <= 30) {
            throw new IllegalArgumentException("Die Zieltemperatur muss zwischen 0 und 30 liegen");
        }
        this.targetTemperature = targetTemperature;
    }

    /**
     * Berechnet die gespeicherte Energie basierend auf dem täglichen Energiebedarf.
     *
     * @return die insgesamt gespeicherte Energie über 31 Tage
     */
    public Double calculateStoredEnergy() {
        return dailyEnergyRequirement * 31;
    }

    /**
     * Berechnet die Anzahl der Heiztage für den Tank.
     *
     * @return die Anzahl der Heiztage, die konstant 31 Tage beträgt
     */
    public Double calculateHeatingDays() {
        return 31.0;
    }

    /**
     * Berechnet das Volumen des zylindrischen Tanks in Litern.
     *
     * @return das Volumen in Litern
     */
    public Double calculateVolumeInLiters() {
        return this.radius * 2 * 3.141 * this.height * 0.001;
    }

    @Override
    public String toString() {
        return "Tankname: " + getName() + "\n" +
                "Volumen: " + calculateVolumeInLiters() + "\n" +
                "Gespeicherte Energie: " + calculateStoredEnergy() + "\n" +
                "Heiztage: " + calculateHeatingDays() + "\n" +
                "Temperatur: " + getTargetTemperature() + "\n" +
                "Täglicher Energiebedarf: " + dailyEnergyRequirement;
    }
}
