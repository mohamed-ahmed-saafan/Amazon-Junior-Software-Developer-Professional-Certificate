public class ComputerAsset extends Asset implements Maintainable{
    String cpuModel;
    String gpuModel;
    String ramSize;
    String ramType;
    String diskType;
    String diskSize;
    String displayType;
    String displayRes;
    String displayHz;
    String displaySize;
    String computerType;
    public ComputerAsset(String ID, String brand, int value,int purchaseYear, String cpuModel, String gpuModel, String ramSize, String ramType, String diskType, String diskSize, String displayType, String displayRes, String displayHz , String displaySize) {
        super(ID, brand, value, purchaseYear);
        this.cpuModel = cpuModel;
        this.gpuModel = gpuModel;
        this.ramSize = ramSize;
        this.ramType = ramType;
        this.diskType = diskType;
        this.diskSize = diskSize;
        this.displayType = displayType;
        this.displayRes = displayRes;
        this.displayHz = displayHz;
        this.displaySize = displaySize;
    }


    @Override
    public void getDetails() {
       if(gpuModel.contains("RTX")) {
        computerType = "Gaming Computer";
       }
       else
           computerType = "professional Computer";

    System.out.println("Computer Type: " +"**" + computerType + "**" );
    System.out.println("ID : " + ID);
    System.out.println("Brand : " + brand );
    System.out.println("value : " + value);
    System.out.println("--Processors--");
    System.out.println("CPU Model: " + cpuModel);
    System.out.println("GPU Model: " + gpuModel);
    System.out.println("-- RAM --");
    System.out.println("RAM Type " + ramType);
    System.out.println("RAM Size: " + ramSize);
    System.out.println("-- Disk --");
    System.out.println("Disk Type " + diskType);
    System.out.println("Disk Size: " + diskSize);
    System.out.println("-- Display --");
    System.out.println("Display Type " + displayType);
    System.out.println("Display Resolution : " + displayRes);
    System.out.println("Display Size : " + displaySize);
    System.out.println("Display Refresh Rate : " + displayHz);

    }

    @Override
    public double depreciation() {
        // Assume that computer loses 20% of it's value each year
        int years = 2025 - purchaseYear;
        return value * 0.20 * years ;
    }

    public double currentValue() {
        return value - depreciation();
    }

    @Override
    public void performMaintenance() {
        System.out.println("Clean Fans and Apply Thermal Paste ");

    }
}
