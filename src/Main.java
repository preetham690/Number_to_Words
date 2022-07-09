public class Main {
    public static void main(String[] args) {
        numberToWords(4);
        numberToWords(101010);
        numberToWords(100000);
    }

    //Number --> Word
    public static void numberToWords(int number){
        int rem;
        if(number<0){
            System.out.println("Invalid Value");
        }else{
            int originalDigitCount = getDigitCount(number);
            int number1 = reverse(number);
            int reversedDigitCount = getDigitCount(number1);
            String firstNum = "";
            number = reverse(number);
                if (number==0) {
                    System.out.println("Zero");
                }else{
                    while(number!=0){
                        rem = number%10;
                        switch(rem){
                            case 0 :
                                firstNum+="Zero ";
                                break;
                            case 1 :
                                firstNum+="One ";
                                break;
                            case 2 :
                                firstNum+="Two ";
                                break;
                            case 3 :
                                firstNum+="Three ";
                                break;
                            case 4 :
                                firstNum+="Four ";
                                break;
                            case 5 :
                                firstNum+="Five ";
                                break;
                            case 6 :
                                firstNum+="Six ";
                                break;
                            case 7 :
                                firstNum+="Seven ";
                                break;
                            case 8 :
                                firstNum+="Eight ";
                                break;
                            case 9 :
                                firstNum+="Nine ";
                                break;
                        }
                        number/=10;
                    }

                    if (originalDigitCount != reversedDigitCount) {
                        for(int i = 0; i < (originalDigitCount - reversedDigitCount); i++) {
                            firstNum += "Zero ";
                        }
                    }
                    System.out.println(firstNum);
            }
        }
    }

    //For reversing purpose
    public static int reverse(int number){
        int reversed=0;
        while(number!=0){
            int rem=number%10;
            reversed = (reversed*10)+rem;
            number/=10;
        }
        return reversed;
    }


    //To count the Digits
    public static int getDigitCount(int number){
        if(number<0){
            return -1;
        }else{
            int count = 0;
            int rem;
            while(number!=0){
                rem = number%10;
                number/=10;
                count++;

            }
            return count;
        }
    }
}