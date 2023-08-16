package myStringpackage;

class RevConstructor {
    private int number;

    public RevConstructor(int number) {
        this.number = number;
    }

    public RevConstructor() {
        System.out.println("Reverse no");
    }

    public int calculateReverse() {
        int reversed = 0;
        int originalNumber = number;

        while (originalNumber != 0) {
            int lastDigit = originalNumber % 10;
            reversed = reversed * 10 + lastDigit;
            originalNumber /= 10;
        }

        return reversed;
    }

    public static void main(String[] args) {
        int inputNumber = 12345;

        RevConstructor reverseObj = new RevConstructor(inputNumber);
        int reversed = reverseObj.calculateReverse();
        System.out.println("Reverse of " + inputNumber + " is: " + reversed);
    }
}

