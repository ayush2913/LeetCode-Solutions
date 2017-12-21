class ComplexMultiplication {
    public String complexNumberMultiply(String a, String b) {

        String[] num1arr = a.trim().split("\\+");
        int real1 = Integer.parseInt(num1arr[0]);
        int imag1 = Integer.parseInt(num1arr[1].substring(0,num1arr[1].length()-1));
        String[] num2arr = b.trim().split("\\+");
        int real2 = Integer.parseInt(num2arr[0]);
        int imag2 = Integer.parseInt(num2arr[1].substring(0,num2arr[1].length()-1));

        int resultReal = real1*real2 - imag1*imag2;
        int resultImag = real1*imag2 + real2*imag1;

        //System.out.println(imag1);

        return Integer.toString(resultReal)+"+"+Integer.toString(resultImag)+"i";

    }
}