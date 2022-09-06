import java.util.*;
class Remove_dublicate
{
	public static void main(String[] args)
	 {
		
		Scanner scan=new Scanner(System.in);
		ArrayList<Integer>arr=new ArrayList<Integer>();
		System.out.println("Enter the how maney elements in array");
		int count=scan.nextInt();
		for(int i=0;i<count;i++)
		{
			System.out.println("Enter the "+(i+1)+" input");
			arr.add(scan.nextInt());
		}
		System.out.println("before remove in arrayList "+ arr);
		for(int i=0;i<arr.size();i++){
			for(int j=i+1;j<arr.size();j++){
                if((arr.get(i)^arr.get(j))==0){
                	arr.remove(j);
                }
			}
		}
		System.out.println("After remove the dublicate "+arr);
    }

}