import java.util.*;
class BeautifulYear{
    public static void main(String args[]) {
        Scanner s=new Scanner(System.in);
        int year=s.nextInt();
        while (year<=9999) {
            String y=Integer.toString(year);
            int len=y.length();
            int count=0;
            for (int i = 0; i < len; i++) {
                char c=y.charAt(i);
                //count=0;
                for (int j = 0; j <len; j++) {
                    if(c==y.charAt(j)){
                        count++;
                    }
                    if(count>=2)
                        break;
                }
                if(count>=2)
                   break;
                
            }
            if(count==4){
                System.out.println(y);
                break;
            }
            year++;
        }

    }
}