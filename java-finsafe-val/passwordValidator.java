import java.util.Scanner;

public class Main {
    public static boolean isvalid(String pass){
        boolean hasU = false;
        boolean hasD = false;

        if(pass.length() < 8){
            System.out.println("Minimum 8 characters required");
            return false;
        }
        for(int i=0; i<pass.length(); i++){
            char c = pass.charAt(i);
            if(Character.isUpperCase(c)){
                hasU = true;
            }
            if(Character.isDigit(c)){
                hasD = true;
            }
        }
        if(!hasU){
            System.out.println("Must contain an uppercase letter");
        }
        if(!hasD){
            System.out.println("Must contain a digit");
        }
        return hasU && hasD;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String p;
        while (true){
            System.out.println("enter new password: ");
            p = sc.nextLine();
            if(isvalid(p)) {
                System.out.println("password is accepted");
                break;
            }
            else System.out.println("Try again");
        }
    }
}