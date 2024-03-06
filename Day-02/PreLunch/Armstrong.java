/*8. A three digit number is called Armstrong number if sum of cube of its digit is equal to number itself.
E.g.- 153 is an Armstrong number because (13)+(53)+(33) = 153.
Write all Armstrong numbers between 100 to 500.*/

class Armstrong {
    public static void main(String[] args) {
        
        System.out.println("Armstrong numbers between 100 and 500:");

        for (int num = 100; num <= 500; num++) {
            int originalNumber = num;
            int sum = 0;
            while (originalNumber != 0) {
                int digit = originalNumber % 10;
                sum += digit * digit * digit;
                originalNumber /= 10;
            }
            if (sum == num) {
                System.out.println(num);
            }
        }
    }
}
