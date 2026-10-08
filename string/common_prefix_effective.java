package com.DSA.string;

public class common_prefix_effective {
    static void main(String[] args) {
        String[] ar={"flower","flow","flight"};
        String result =ar[0];
        for(int i=1; i<ar.length; i++){
            String str = ar[i];
            while(str.indexOf(result)!=0){            //index also must be same ..we need index to be zero
                result =result.substring(0,result.length()-1);
                if(result.equals("")){
                    System.out.println("No common prefix");
                    break;
                }
            }
        }
        System.out.println(result);

    }
}
