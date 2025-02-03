import java.util.*;

public class ThreewayStrat implements AlgorithmStrategy {

    // Link to source code: https://www.geeksforgeeks.org/3-way-merge-sort/
    @Override
    public void sort(int[] gArray)
    {
        // if array of size is zero returns null
        if (gArray == null)
            return;

        // creating duplicate of given array
        int[] fArray = new int[gArray.length];

        // copying elements of given array into
        // duplicate array
        for (int i = 0; i < fArray.length; i++)
            fArray[i] = gArray[i];

        // sort function
        mergeSort3WayRec(fArray, 0, gArray.length, gArray);

        // copy back elements of duplicate array
        // to given array
        for (int i = 0; i < fArray.length; i++)
            gArray[i] = fArray[i];
    }

    public static void mergeSort3WayRec(int[] gArray,
                                        int low, int high, int[] destArray)
    {
        // If array size is 1 then do nothing
        if (high - low < 2)
            return;

        // Splitting array into 3 parts
        int mid1 = low + ((high - low) / 3);
        int mid2 = low + 2 * ((high - low) / 3) + 1;

        // Sorting 3 arrays recursively
        mergeSort3WayRec(destArray, low, mid1, gArray);
        mergeSort3WayRec(destArray, mid1, mid2, gArray);
        mergeSort3WayRec(destArray, mid2, high, gArray);

        // Merging the sorted arrays
        merge(destArray, low, mid1, mid2, high, gArray);
    }

    public static void merge(int[] gArray, int low,
                             int mid1, int mid2, int high,
                             int[] destArray)
    {
        int i = low, j = mid1, k = mid2, l = low;

        // choose smaller of the smallest in the three ranges
        while ((i < mid1) && (j < mid2) && (k < high))
        {
            if (gArray[i] < gArray[j])
            {
                if (gArray[i] < gArray[k])
                    destArray[l++] = gArray[i++];

                else
                    destArray[l++] = gArray[k++];
            }
            else
            {
                if (gArray[j] < gArray[k])
                    destArray[l++] = gArray[j++];
                else
                    destArray[l++] = gArray[k++];
            }
        }

        // case where first and second ranges have
        // remaining values
        while ((i < mid1) && (j < mid2))
        {
            if (gArray[i] < gArray[j])
                destArray[l++] = gArray[i++];
            else
                destArray[l++] = gArray[j++];
        }

        // case where second and third ranges have
        // remaining values
        while ((j < mid2) && (k < high))
        {
            if (gArray[j] < gArray[k])
                destArray[l++] = gArray[j++];

            else
                destArray[l++] = gArray[k++];
        }

        // case where first and third ranges have
        // remaining values
        while ((i < mid1) && (k < high))
        {
            if (gArray[i] < gArray[k])
                destArray[l++] = gArray[i++];
            else
                destArray[l++] = gArray[k++];
        }

        // copy remaining values from the first range
        while (i < mid1)
            destArray[l++] = gArray[i++];

        // copy remaining values from the second range
        while (j < mid2)
            destArray[l++] = gArray[j++];

        // copy remaining values from the third range
        while (k < high)
            destArray[l++] = gArray[k++];
    }


}
