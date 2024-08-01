import java.util.Scanner;

public class pass {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("How many passwords to you want to generate? ");
        int n=sc.nextInt();
        System.out.println("Enter the numbers of characters");
        int length= sc.nextInt();

        String[] randomPasswords = new String[n];

        for(int i=0;i<n;i++){
            String password="";
           for(int j=0;j<length;j++){
              password=password+random();
           }
           randomPasswords[i]=password;
        }

        print(randomPasswords);

    }
    public static void print(String[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
    
    public static char random(){
        int r=(int)(Math.random()*62);

        if(r<=9){
           int ascii =r+48;
           return (char)(ascii);
        } else if(r <=35){
            
            int ascii=r+55;
            return (char)(ascii);
        } else {
            int ascii=r+61;
            return (char)(ascii);
        }

    }
}
