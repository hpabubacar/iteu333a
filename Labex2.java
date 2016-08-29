
package labex2;

import java.util.*;
public class Labex2 {

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your string: ");
        String test = sc.nextLine();
        ArrayList<String> tokens = new ArrayList<String>();
		
        Scanner scan = new Scanner(test);
        while (scan.hasNext()) {
            tokens.add(scan.next());
        }
        for (int i = 0; i < tokens.size(); i++){
            if (tokens.get(i).equals("+")){
            System.out.println("plus: "+tokens.get(i));
            }
            else if (tokens.get(i).equals("-")){
            System.out.println("minus: "+tokens.get(i));
            }
            else if (tokens.get(i).equals("*")){
            System.out.println("times: "+tokens.get(i));
            }
            else if (tokens.get(i).equals("/")){
            System.out.println("divide: "+tokens.get(i));
            }
            else if (tokens.get(i).equals("(")){
            System.out.println("lparen: "+tokens.get(i));
            }
            else if (tokens.get(i).equals(")")){
            System.out.println("rparen: "+tokens.get(i));
            }
            else if (tokens.get(i).equals("=")){
            System.out.println("assign: "+tokens.get(i));
            }
            else if (tokens.get(i).equals(";")){
            System.out.println("semi: "+tokens.get(i));
            }
            else if (tokens.get(i).matches("\\d+(\\.\\d+)?")){
            System.out.println("num: "+tokens.get(i));
            }
            else{
            System.out.println("ID: "+tokens.get(i));
            }
        }
    }
    
}
