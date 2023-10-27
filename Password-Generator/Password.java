public class Password{
    public static void main(String[] args) {
        String alpha[] = {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};
        int number[] = {0,1,2,3,4,5,6,7,8,9};
        int randomAlpha = 0;
        int randomNum = 0;
        String PasswordString = "";
        String PasswordNum = "";
         String password = generatePassword();
        System.out.println("Your password is " + password);

        do{
            randomAlpha=(int)(Math.random()*alpha.length);
            PasswordString+=alpha[randomAlpha];
            randomNum=(int)(Math.random()*number.length);
            PasswordNum+=String.valueOf(number[randomNum]);
        }while(PasswordString.length()!=4);
          public static String generatePassword() {
        String alpha = generateRandomString(1, "abcdefghijklmnopqrstuvwxyz");
        String num = generateRandomString(3, "0123456789");
        String password = alpha.substring(0, 1).toUpperCase() + alpha.substring(1) + "@" + num;
        return password;
          }
        public static String generateRandomString(int length, String characters) {
        StringBuilder randomString = new StringBuilder();
        for (int i = 0; i < length; i++) {
            int randomIndex = (int) (Math.random() * characters.length());
            randomString.append(characters.charAt(randomIndex));
        }
        return randomString.toString();
    }
}
        String finalPassword = PasswordString.substring(0,1).toUpperCase()+PasswordString.substring(1)+"@"+PasswordNum;
         System.out.println("Your password is "+finalPassword);
    }
}
