public class Task_9 {
    public static void main(String[] args) {
    int [] arr = new int [1000];
    int result = 0 , count = 0;
    for (int i = 0; i < arr.length; i++){
        arr[i] = i+1;}
    for(int i = 0; i < arr.length ; i++){
        if(i%3 == 0 && i%5 == 0){
            result= result+i;
            count++;
        }else if(i%5 == 0){
            result= result+i;
            count++;
        }else if(i%3 == 0){
            result= result+i;
            count++;}
    }

    System.out.printf("Result: %d , Count num: %d",result, count);
    }
}
