public class CodingBat {
    public static String missingChar(String str, int n) {
        String nowy = "";

        for (int i = 0; i<str.length(); i++){
            if (i != n)
            {
                nowy = nowy.concat(str.substring(i, i+1));
            }
        }

        return nowy;
    }

    public static boolean or35(int n) {
        if (n % 5 == 0 || n % 3 == 0)
        {
            return true;
        }
        return false;
    }

    public static int bigDiff(int[] nums) {
        int max = nums[0];
        int min = nums[0];

        for (int i = 0; i<nums.length; i++){
            if (max < nums[i])
            {
                max = nums[i];
            }

            if (min > nums[i]) {
                min = nums[i];
            }
        }
        int diff = max - min;
        return diff;
    }


    public String atFirst(String str) {
        if (str.length() < 2)
        {
            String nowe = str + "@";
            if (nowe.length() == 1)
            {
                nowe = nowe + "@";
            }
            return nowe;
        }


        else
        {
            str = str.substring(0,2);
            return str;
        }
    }







}
