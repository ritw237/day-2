class Condtionals{
    public static void main(String[] args) {
        int sal=25000;
        if (sal>1000){
            sal+=100;
        } else if(sal<2000){
            sal+=2000;
        }else {
            sal+=1200;
        }
        System.out.println(sal);
    }
}