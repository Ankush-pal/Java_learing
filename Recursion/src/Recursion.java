import java.util.Scanner;

public class Recursion {
       /* public static boolean checkSort(int arr[], int idx){
            if(idx== arr.length -1){
                return true;
            }
            if(arr[idx] < arr[idx+1]){
                    return  checkSort(arr , idx+1);
            }else{
                  return false;
            }
        }*/

    public static void moveX(String newStr, int count, int idx, String str) {


        if (idx == str.length()) {
            for(int i= 0; i<count; i++){
                newStr += 'x';
            }
            System.out.println( newStr);
            return;
        }

        char curChar = str.charAt(idx);
        if(curChar == 'x') {
            count++;
            moveX(newStr, count, idx + 1, str);

        }else {
            newStr += curChar;
            moveX(newStr, count, idx + 1, str);
        }
    }




        /*
        public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int [] givenArr = new int[size];
        for(int i=0; i<size; i++){
            givenArr[i] = sc.nextInt();
        }
            System.out.println( checkSort(givenArr,0));*/




        public static void main(String args[]){
        String myStr = "lxlalskflzlxlxlslxlxlsl";
        moveX("",0,0,myStr);

    }

}
