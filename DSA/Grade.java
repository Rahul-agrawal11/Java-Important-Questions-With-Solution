class Grade {
    public static void main(String[] args) {
        char grade = 'A';
        grade = (char)(grade + 8);
        System.out.println("Encryted/Increased Grade: "+grade);

        grade = (char)(grade - 8);
        System.out.println("Decryted/Correct Grade: "+grade);
    }
}