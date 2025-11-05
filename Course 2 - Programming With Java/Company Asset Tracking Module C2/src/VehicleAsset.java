public class VehicleAsset extends Asset implements Maintainable {
    String category;
    double engineSize;
    int horsePower;
    String aspirationType;
    String wheelSize;
    String rimSize;
    int Km;

    public VehicleAsset(String ID, String brand, int value, int purchaseYear, String category, double engineSize, int horsePower, String aspirationType, String wheelSize, String rimSize,int Km) {
        super(ID, brand, value, purchaseYear);
        this.category = category;
        this.engineSize = engineSize;
        this.horsePower = horsePower;
        this.aspirationType = aspirationType;
        this.wheelSize = wheelSize;
        this.rimSize = rimSize;
        this.Km=Km;
    }

    @Override
    public void getDetails() {
        System.out.println(" Vehicle Category: " + this.category);
        System.out.println(" Vehicle EngineSize: " + this.engineSize);
        System.out.println(" Vehicle HorsePower: " + this.horsePower);
        System.out.println(" Vehicle AspirationType: " + this.aspirationType);
        System.out.println(" Vehicle WheelSize: " + this.wheelSize);
        System.out.println(" Vehicle RimSize: " + this.rimSize);
    }

    @Override
    public double depreciation() {
        int years = 2025 - this.purchaseYear;

        if (years <= 0) {
            return 0.0;
        }

        double depreciation = 0.0;

        if (years >= 1) {
            depreciation += value * 0.5; // First year
        }

       else if (years > 1) {
            depreciation += value * 0.3 * (years - 1); // Remaining years
        }

        // Prevent over-depreciation
        if (depreciation > value) {
            depreciation = value;
        }

        return depreciation;
    }

    @Override
    public double currentValue() {
        return super.currentValue();
    }

    @Override
    public void performMaintenance() {
        if(Km == 60000)
        System.out.println("Oil Change ,Oil Filter Change ,Brake Calibres change , Timing Belt Change");
        else
            System.out.println("Oil Change , Oil Filter Change");
    }
}
