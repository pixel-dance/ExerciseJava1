
public class Main {
    public static void main(String[] args) {
        int [] a = {1};
        int [] b = {1};

        int foundElementIndex = -1;
        boolean isChild = false;

        for (int i = 0; i < b.length; i++) {
            for (int j = 0; j < a.length; j++) {
                if (b[i] == a[j]) {
                    if (foundElementIndex < j) {
                        foundElementIndex = j;
                        isChild = true;
                    } else {
                        isChild = false;
                    }
                }
            }
        }

        System.out.println(isChild);

    }
}
