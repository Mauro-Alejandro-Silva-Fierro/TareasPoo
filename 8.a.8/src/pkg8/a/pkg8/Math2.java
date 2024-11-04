
package pkg8.a.pkg8;

public class Math2 implements IExtremos {
    
    @Override
    public int min(int[] a) {
        if (a == null || a.length == 0) {
            throw new IllegalArgumentException("Array cannot be null or empty");
        }
        int min = a[0];
        for (int num : a) {
            if (num < min) {
                min = num;
            }
        }
        return min;
    }

    @Override
    public int max(int[] a) {
        if (a == null || a.length == 0) {
            throw new IllegalArgumentException("Array cannot be null or empty");
        }
        int max = a[0];
        for (int num : a) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }

    @Override
    public double min(double[] a) {
        if (a == null || a.length == 0) {
            throw new IllegalArgumentException("Array cannot be null or empty");
        }
        double min = a[0];
        for (double num : a) {
            if (num < min) {
                min = num;
            }
        }
        return min;
    }

    @Override
    public double max(double[] a) {
        if (a == null || a.length == 0) {
            throw new IllegalArgumentException("Array cannot be null or empty");
        }
        double max = a[0];
        for (double num : a) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }
}
