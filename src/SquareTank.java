/**
 * Repräsentiert einen quadratischen Tank, der für Energiespeicherberechnungen verwendet wird.
 * Beinhaltet Attribute wie Länge, Höhe, Zieltemperatur und täglichen Energiebedarf.
 *
 * @author Lucas
 * @version 1.0
 * @since 2024-09-05
 */
public class SquareTank {
    /** Name des Tanks. */
    private String name;

    /** Länge des quadratischen Tanks in Metern. */
    private Double length;

    /** Höhe des quadratischen Tanks in Metern. */
    private Double height;

    /** Zieltemperatur des Tanks in Grad Celsius. */
    private Double targetTemperature;

    /** Täglicher Energiebedarf des Tanks in kWh. */
    private Double dailyEnergyRequirement;

    /**
     * Konstruktor, der einen quadratischen Tank mit den angegebenen Parametern erstellt.
     *
     * @param name                  der Name des Tanks
     * @param length                die Länge des Tanks
     * @param height                die Höhe des Tanks
     * @param targetTemperature     die Zieltemperatur des Tanks
     * @param dailyEnergyRequirement der tägliche Energiebedarf des Tanks
     */
    public SquareTank(String name, Double length, Double height, Double targetTemperature, Double dailyEnergyRequirement) {
        setName(name);
        setLength(length);
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

    public void setDailyEnergyRequirement(Double dailyEnergyRequirement) {
        this.dailyEnergyRequirement = dailyEnergyRequirement;
    }

    public Double getDailyEnergyRequirement() {
        return dailyEnergyRequirement;
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
     * Berechnet das Volumen des quadratischen Tanks in Litern.
     *
     * @return das Volumen in Litern
     */
    public Double calculateVolumeInLiters() {
        return length * length * height * 1000;
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
