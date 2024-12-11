public class Make_First_Char_Uppercase {
public static void main(String[] args) { 

String user = "testsur7342@mailinator.com"; 
System.out.println(user); 
String newUser = user.replaceFirst(String.valueOf(user.charAt(0)),String.valueOf(user.charAt(0)).toUpperCase()); 

System.out.println(newUser); 

}
}