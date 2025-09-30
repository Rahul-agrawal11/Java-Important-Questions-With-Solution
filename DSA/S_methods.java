class S_methods {
    public static void main(String[] args) {
        String name = "Rahul";
        System.out.println("For Length: "+name.length());
        System.out.println("For Lower Case: "+name.toLowerCase());
        System.out.println("For Upper Case: "+name.toUpperCase());

        String forTrim = "   rahul  agrawal";
        System.out.println("For Trim: "+forTrim.trim());

        System.out.println(name.substring(3));
        System.out.println(name.substring(2,4)); //include start and exclude end

        System.out.println(name.replace('R','M')); 
        System.out.println(name.replace("Rah","Muk")); 
        System.out.println(name.replace("R","Muk")); 
        System.out.println(name.startsWith("Ra")); 
        System.out.println(name.endsWith("ul")); 
        System.out.println(name.charAt(2)); 
        System.out.println(name.indexOf("a")); 

        String name2 = "Agrawal";
        System.out.println(name2.indexOf("a",4)); // If not matched return -1
        System.out.println(name2.lastIndexOf("a")); 
        System.out.println(name2.lastIndexOf("a",4)); 
        System.out.println(name2.equals("Agrawal")); //Case Sensitive 
        System.out.println(name2.equalsIgnoreCase("agrawal")); //Ignore Case Sensitive 

    }
}