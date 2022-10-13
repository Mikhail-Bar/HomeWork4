public class Task_1 {
    public static void main(String[] args) {
        long num0 = 0, num1 = 1, numSum = 0;
        System.out.print(num0+" "+num1+" ");
        while (numSum <= 10000000){
            numSum=num0+num1;
            if (numSum < 10000000)
            System.out.print(numSum+" ");
            num0=num1;
            num1=numSum;

        }
    }
}
