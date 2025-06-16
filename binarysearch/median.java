public class median {
    public double findMedian(int[] arr1, int[] arr2) {
        int n1 = arr1.length;
        int n2 = arr2.length;
        int n = n1 + n2;
        int ind2 = n / 2;
        int ind1 = ind2 - 1;

        int indele1 = -1;
        int indele2 = -1;

        int i = 0, j = 0, cnt = 0;

        while (i < n1 && j < n2) {
            int val;
            if (arr1[i] < arr2[j]) {
                val = arr1[i++];
            } else {
                val = arr2[j++];
            }
            if (cnt == ind1) indele1 = val;
            if (cnt == ind2) indele2 = val;
            cnt++;
        }

        while (i < n1) {
            int val = arr1[i++];
            if (cnt == ind1) indele1 = val;
            if (cnt == ind2) indele2 = val;
            cnt++;
        }

        while (j < n2) {
            int val = arr2[j++];
            if (cnt == ind1) indele1 = val;
            if (cnt == ind2) indele2 = val;
            cnt++;
        }

        if (n % 2 == 1) return indele2; // odd length → only 1 median
        return (indele1 + indele2) / 2.0; // even length → average of two
    }
}
