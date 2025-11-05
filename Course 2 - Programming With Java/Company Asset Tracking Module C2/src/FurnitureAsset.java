public class FurnitureAsset extends Asset {
        String materialModel;
        String Type;
        int weight;
        String color;

    public FurnitureAsset(String ID, String brand, int value, int purchaseYear) {
        super(ID, brand, value, purchaseYear);
        materialModel = "Furniture";
        Type = "Furniture";
        weight = value;
        color = "white";
    }

    @Override
    public void getDetails() {
        System.out.println("Furniture Asset Details");
        System.out.println("Material: " + materialModel);
        System.out.println("Type: " + Type);
        System.out.println("Weight: " + weight);
        System.out.println("Color: " + color);
    }

    @Override
    public double depreciation() {
        int years = 2025 - purchaseYear;
        return this.value*0.10*years;
    }

}
