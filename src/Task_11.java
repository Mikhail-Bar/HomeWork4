public class Task_11
{
    public static void main(String[] args) {
        int [] arr = new int [1000];
        for (int i = 0; i < arr.length; i++){
            arr[i] = i+1;}
        for(int i:arr){
            if(i%3 == 0 && i%5 == 0 && i%15 == 0){
                System.out.print("Fizz and Bizz and Hiss"+" ");
            }else if(i%3 == 0 && i%5 == 0){
                System.out.print("Fizz and Bizz "+" ");
            }else if(i%3 == 0){
                System.out.print("Fizz"+" ");
            }else if (i%5 == 0){
                System.out.print("Bizz"+" ");
        }else if (i%15 == 0){
                System.out.print("Hiss"+" ");
            }else System.out.print(i+" ");
        }


    }
}
