public class Search {

    Registration[] registrations;

    public Search() {
        Database db = new Database();
        registrations = db.getRegistrations();
    }

    public Registration search(String license) {

        // TODO 1: Initialize the left index to zero
        int left = 0;

        /* TODO 2: Initialize the the right index to the
                    length of the array minus 1 */
        int right = registrations.length - 1;
        /* TODO 3: Implement the while loop to run until
                   until the left index is greater than the
                   right index  */

        while (left <= right) {

            /* TODO 4: Initialize the local variable middle to the
                     index halfway between the right and left
                     indices. */
            int middle = (left + right) / 2;

            /* TODO 5: Use the String.compareTo( ) method to
                       compare the Registration object's license
                       at the middle index to the search() method
                       parameter, license. */
            /* TODO 7: if there is a match, return that
                           Registration object */

            /* TODO 8: If the Registration license is less, shift
                           the left index to the mid plus 1 */

            /* TODO 9: If the Registration license is greater, shift
                           the right index to the mid minus 1 */

            int comparison = registrations[middle].license.compareTo(license);

            if (comparison == 0) {
                return registrations[middle];  // FOUND IT! (match)
            } else if (comparison < 0) {
                left = middle + 1;  // Search RIGHT (current is too small)
            } else {  // comparison > 0
                right = middle - 1;  // Search LEFT (current is too big)
            }
        }
        return null;
    }


    public void printAll() {
        for (Registration reg : registrations) {
            System.out.println(reg);
        }
    }
}
public void main(String[] args) {

    String license = "GIG-1870";
   Search regsearch = new Search();
    System.out.println();

        /* TODO 11: Call the search() method with a license number to
                    search for. */

    // TODO 12: If the registration object is found print it

        /* TODO 13: If the registration object is not found, print
               an error */
    Registration reg = regsearch.search(license);
    if (reg == null) {
        System.out.println("No such license");
    }
    else {
        System.out.println(reg);
    }
    regsearch.printAll();

}

