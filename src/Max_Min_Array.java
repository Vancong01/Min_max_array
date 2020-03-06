public class Max_Min_Array {
    public static void main(String[] args) {
        int[] array = {1, 20, 7, 5, 9, 2, 30, 10, 100};
        //find min 5 số, max 5 số công với nhau
        int i;
        int j;
        int k;
        int n = 9;
        int sum_max = 0;
        int sum_min = 0;
        //thuật toán sắp xếp chèn
        for (i = 1; i < n; i++) {
            // Tìm vị trí phù hợp cho i
            j = i;
            while (j > 0 && array[i] < array[j - 1]) --j;

            // Đưa i về đúng vị trí
            int tmp = array[i];
            for (k = i; k > j; k--)
                array[k] = array[k - 1];
            array[j] = tmp;
        }
        System.out.println("In ra mảng array đã được sắp xếp");
        for (i = 0; i < array.length; i++) {
            System.out.println(array[i] + ",");
        }
        for (i = array.length-5; i < array.length; i++) {
            sum_max += array[i];
        }
        System.out.println("max of sum 5 number =" + sum_max);
        for (i = 0; i < 5; i++) {
            sum_min += array[i];
        }
        System.out.println("min of sum 5 number=" + sum_min);
    }

}
