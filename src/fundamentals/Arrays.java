package fundamentals;

public class Arrays {

    public static void main(String[] args) {
        // we have declared an array and assigned to it an empty array
        int[] zeroLengthArray = {};
        int[] zeroLengthArrayAlt = new int[0]; // same here, alternative notation
        // further modification of values will not work
        // zeroLengthArray[0] = 1; // this will trigger an out of bounds exception
        System.out.println("zeroLengthArray: " + zeroLengthArray);
        System.out.println("zeroLengthArray length: " + zeroLengthArray.length);

        // we'll work now with arrays of size bigger than 0
        // the numeration always starts from 0
        int[] moreIndexes = new int[5];// where 5 is the size of the new array
        // we assigned in random order the values to the positions
        moreIndexes[0] = 123;
        moreIndexes[2] = 432;
        moreIndexes[1] = 2;
        moreIndexes[4] = 21;

        System.out.println("moreIndexes: " + moreIndexes);
        System.out.println("moreIndexes length: " + moreIndexes.length);

        for (int i = 0; i < moreIndexes.length; i++) {
            // we display the values of the array in ordered position, 0-5
            System.out.println("moreIndexes["+ i + "]: " + moreIndexes[i]);
        }

        // now we'll create as reference arrays of different types
        // same rules discussed earlier applies to all
        String[] myMessages = new String[20];
        myMessages[0] = "Mariah Carey";
        myMessages[1] = "my second message";
        myMessages[2] = "my third message";

        long[] myBigValues = new long[13];
        myBigValues[4] = 900909090;

        // So you can create arrays from any objects
        // OR!
        // you can create an array of any objects :)
    }
}
