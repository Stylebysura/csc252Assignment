// Declare and initialize an array of floats
float[] floatArray = {1.1f, 2.2f, 3.3f, 4.4f, 5.5f};


// Declare and initialize a two-dimensional array of characters
char[][] charArray = {
    {'A', 'B', 'C'},
    {'D', 'E', 'F'},
    {'G', 'H', 'I'}
};


// Traverse the floatArray using a for loop
for (int i = 0; i < floatArray.length; i++) {
    System.out.println(floatArray[i]);
}


// Traverse the charArray using nested for loops
for (int i = 0; i < charArray.length; i++) {
    for (int j = 0; j < charArray[i].length; j++) {
        System.out.println(charArray[i][j]);
    }
}


// Concatenate the strings of the floatArray
StringBuilder concatenatedFloats = new StringBuilder();
for (float num : floatArray) {
    concatenatedFloats.append(num).append(" ");
}
System.out.println(concatenatedFloats.toString().trim());



// Concatenate the strings of the charArray
StringBuilder concatenatedChars = new StringBuilder();
for (char[] row : charArray) {
    for (char ch : row) {
        concatenatedChars.append(ch).append(" ");
    }
}
System.out.println(concatenatedChars.toString().trim());
