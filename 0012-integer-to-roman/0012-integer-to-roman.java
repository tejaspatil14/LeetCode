class Solution {
    public String intToRoman(int num) {
        String ones[] = {"","I","II","III","IV","V","VI","VII","VIII","IX"};
        String tens[] = {"","X","XX","XXX","XL","L","LX","LXX","LXXX","XC"};
        String hundereds[] = {"","C","CC","CCC","CD","D","DC","DCC","DCCC","CM"};
        String thousands[]={"","M","MM","MMM"};
        
        return thousands[num/1000] + hundereds[(num%1000)/100] + tens[(num%100)/10] + ones[num%10];
    }
}