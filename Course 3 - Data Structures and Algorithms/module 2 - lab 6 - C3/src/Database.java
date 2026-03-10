import java.util.ArrayList;

public class Database {
    private ArrayList registrations = new ArrayList();

    public Database() {
        // Initialize the list of registrations
        registrations.add(new Registration("SGL-6855", "Tyler Lennon"));
        registrations.add(new Registration("SDN-2659", "Margaret Finn"));
        registrations.add(new Registration("ANA-2866", "Zane Hallworth"));
        registrations.add(new Registration("DYC-5707", "Jodi Gatfield"));
        registrations.add(new Registration("GIG-1870", "Harvey Kenny"));
        registrations.add(new Registration("NWK-2057", "Janice Hudson"));
        registrations.add(new Registration("BYJ-6279", "Larry Newman"));
        registrations.add(new Registration("ENY-2915", "Helen Pryor"));
        registrations.add(new Registration("OYW-0632", "Quincy Cromwell"));
        registrations.add(new Registration("KEC-3996", "Kathy Myers"));
        registrations.add(new Registration("HOZ-1224", "Hugh Haines"));
        registrations.add(new Registration("KGJ-5010", "Tammy Mallard"));
        registrations.add(new Registration("FVA-4467", "Michael Knowles"));
        registrations.add(new Registration("NEV-9119", "Michael Knowles"));
        registrations.add(new Registration("BJT-9772", "Karl Yardley"));
        registrations.add(new Registration("YQD-3410", "Andrea Elsworth"));
        registrations.add(new Registration("DUY-0288", "Jay Zagorski"));
        registrations.add(new Registration("ATZ-9783", "Sally Oakes"));
        registrations.add(new Registration("IAG-6602", "Patrick Hewitt"));
        registrations.add(new Registration("DCP-2974", "Donna Wardman"));
        registrations.add(new Registration("FAH-2515", "Jay Newton"));
        registrations.add(new Registration("GYF-3958", "Carla Collins"));
        registrations.add(new Registration("NCL-9068", "James McBride"));
        registrations.add(new Registration("UBJ-1923", "Helen Gibbs"));
        registrations.add(new Registration("UUG-4837", "Conrad Pryor"));
        registrations.add(new Registration("GMD-6786", "Tracy Gilbert"));
        registrations.add(new Registration("QTW-6473", "Donald Gatfield"));
        registrations.add(new Registration("QQE-3264", "Charlotte Newport"));
        registrations.add(new Registration("WAO-8258", "Rodney Gilbert"));
    }

    public void printAll(){
        for (Object obj : registrations) {
            Registration reg = (Registration) obj;
            System.out.println(reg);
        }
    }

    public void insertionSort() {
        // TODO 2: Set a local variable, regCount, equal to the
        //      size of the registrations array
        int regCount = registrations.size();

        // TODO 3: Create a for-loop that starts with unsortedIndx = 1
        //      and ends at i < regCount
        for (int unsortedIndx = 1; unsortedIndx < regCount; unsortedIndx++) {
            // TODO 4: Initialize unsortedReg reference with the
            //      Registration at the unsorted Index
            Registration unsortedReg = (Registration) registrations.get(unsortedIndx); // key

            // TODO 5: Initialize sortedIndx with the unsortedIndx - 1
            int sortedIndx = unsortedIndx - 1;

            // TODO 6: Declare a while loop that ends when the sortedIndx >= 0
            // and when sortedReg license is greater than unsortedReg license
            while (sortedIndx >= 0) {
                // TODO 7: Initialize sortedReg with the Registration at the sortedIndx
                Registration sortedReg = (Registration) registrations.get(sortedIndx);

                // TODO 10: Check if sortedReg license is greater than unsortedReg license
                if (sortedReg.license.compareTo(unsortedReg.license) > 0) {
                    // TODO 11: Shift the sortedReg to the right (sortedIndx + 1)
                    registrations.set(sortedIndx + 1, sortedReg);
                    sortedIndx--;
                } else {
                    // TODO 12: If sortedReg is less than or equal to unsortedReg, break
                    break;
                }
            }

            // TODO 13: After the while-loop, insert unsortedReg at its correct position
            registrations.set(sortedIndx + 1, unsortedReg);
        }
    }

    public void bubbleSort() {
        int n = registrations.size();
        boolean swapped;

        for (int i = 0; i < n - 1; i++) {
            swapped = false;
            for (int j = 0; j < n - 1 - i; j++) {
                Registration currentReg = (Registration) registrations.get(j);
                Registration nextReg = (Registration) registrations.get(j + 1);
                if (currentReg.license.compareTo(nextReg.license) > 0) {
                    registrations.set(j, nextReg);
                    registrations.set(j + 1, currentReg);
                    swapped = true;
                }
            }
            if (!swapped) {
                break;
            }
        }
    }

    public static void main(String[] args) {
        Database db = new Database();

        /* TODO 8: Replace the invocation of the bubbleSort() method
                   with an invocation of the insertionSort()
         */
        db.insertionSort();

        System.out.println("\n******* Sorted List ******\n");
        db.printAll();
    }
}