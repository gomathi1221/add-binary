import java.math.BigInteger;
class Solution {
    public String addBinary(String a, String b) {
      BigInteger ar =new BigInteger(a,2);
      BigInteger br =new BigInteger(b,2);
      BigInteger sum=ar.add(br);
      String r=sum.toString(2);
      return r;



       
      

    }
}