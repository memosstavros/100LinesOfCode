public class Password{
    public static void main(String[] args) {
        String alpha[] = {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};
        int number[] = {0,1,2,3,4,5,6,7,8,9};
        int randomAlpha = 0;
        int randomNum = 0;
        String PasswordString = "";
        String PasswordNum = "";
        String Password=generatePassword();
        System.out.println("Your password is" + password);

        public static String generatePassword() {
            String alpha = generateRandomString(1, "abcdefghijklmnopqrstuvwxyz");
            String num = generateRandomString(3, "0123456789");
            String passwords = alpha.substring(0, 1).toUpperCase() + alpha.substring(1) + "@" + num;
            return passwords;
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
        public static boolean isPasswordStrong(String password) {
    // Έλεγχος για την ισχύ του κωδικού πρόσβασης βάσει κριτηρίων.
    if (password.length() < 8) {
        return false; // Ο κωδικός πρόσβασης πρέπει να είναι τουλάχιστον 8 χαρακτήρες.
    }

    if (!password.matches(".*[A-Z].*")) {
        return false; // Ο κωδικός πρόσβασης πρέπει να περιέχει τουλάχιστον ένα κεφαλαίο γράμμα.
    }

    if (!password.matches(".*[a-z].*")) {
        return false; // Ο κωδικός πρόσβασης πρέπει να περιέχει τουλάχιστον ένα πεζό γράμμα.
    }

    if (!password.matches(".*\\d.*")) {
        return false; // Ο κωδικός πρόσβασης πρέπει να περιέχει τουλάχιστον έναν αριθμό.
    }

    // Εάν ο κωδικός πρόσβασης πληροί όλα τα κριτήρια, θεωρείται ισχυρός.
    return true;
}
        do{
            randomAlpha=(int)(Math.random()*alpha.length);
            PasswordString+=alpha[randomAlpha];
            randomNum=(int)(Math.random()*number.length);
            PasswordNum+=String.valueOf(number[randomNum]);
        }while(PasswordString.length()!=4);

        String finalPassword = PasswordString.substring(0,1).toUpperCase()+PasswordString.substring(1)+"@"+PasswordNum;
         System.out.println("Your password is "+finalPassword);
    }
}


public static void changePassword(String oldPassword, String newPassword) {
    // Ελέγχος αν ο oldPassword είναι σωστός.
    if (!oldPassword.equals(currentPassword)) {
        System.out.println("Ο παλιός κωδικός πρόσβασης είναι εσφαλμένος.");
        return;
    }
    // Αλλαγή του κωδικού πρόσβασης σε newPassword.
    currentPassword = newPassword;
    System.out.println("Ο κωδικός πρόσβασης άλλαξε με επιτυχία.");
}
public static String generatePasswordWithNotification() {
    String password = generateStrongPassword();
    System.out.println("Ο νέος ισχυρός κωδικός είναι: " + password);
    return password;
}
public static void savePasswordsToFile(List<String> passwords, String fileName) {
    try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
        for (String password : passwords) {
            writer.write(password);
            writer.newLine();
        }
    } catch (IOException e) {
        e.printStackTrace();
    }
}
public static List<String> loadPasswordsFromFile(String fileName) {
    List<String> passwords = new ArrayList<>();
    try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
        String line;
        while ((line = reader.readLine()) != null) {
            passwords.add(line);
        }
    } catch (IOException e) {
        e.printStackTrace();
    }
    return passwords;
}





