public class LessThanZero {
  public static void main(String[] args)  {
    try{
      validateAge(-4);
    }catch (LessThanZeroException ltz){
      System.out.println(ltz.getMessage());
    }
  }
  static void validateAge(int age) throws LessThanZeroException {
    if(age < 0){
      throw new LessThanZeroException("less than zero exception");
    }
  }

}

class LessThanZeroException extends Exception{
  LessThanZeroException(){};
  LessThanZeroException(String msg){
    super(msg);
  }
}
