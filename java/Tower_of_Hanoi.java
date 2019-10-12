public TOH{

  public static void Tower_of_Hanoi(int n,String x,String y,String z){
  
    if(n>0){
      Tower_of_Hanoi(n-1,x,z,y);
      System.out.println("MOVE : "+x+" to "+y);
      Tower_of_Hanoi(n-1,z,y,x);
    }
    
  }
  public static void main(String args[]){
  
    Tower_of_Hanoi(3,"A","B","C");
    
  }
}
