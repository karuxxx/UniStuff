abstract class Meter {
    protected final String id;
    protected double start, end;
    Meter(String id, double s, double e) {
        this.id = id; start = s; end = e;
    }
    abstract double cost(double tariff);
    double consumed() { return end - start; }
}
class GeneratorMeter extends Meter {
    private final double fuelLitres;
    GeneratorMeter(String id, double s, double e, double f) {
        super(id, s, e); fuelLitres = f;
    }
    double cost(double t) { return consumed() * t; }
    double kwhPerLitre() { return consumed() / fuelLitres; }
}