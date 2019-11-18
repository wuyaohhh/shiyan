	package suanshu;
import java.util.Random;
public class Suan {
		static void printHeader() {
			System.out.print("本程序说明如下");
		}
	
	
		public static void main(String[] args){
			int [] jieguo=new int[100];
			short m=0,n=0,ov=0;
			char o='+';
			Random random=new Random();
			System.out.print("输出计算算式：");
			System.out.println();
			for (int i=0,j=0;i<50;i++){
				m=(short) random.nextInt(101);
				n=(short) random.nextInt(101);
				ov=(short) random.nextInt(2);
				if (ov==1){
					o='+';
					if(m+n<100){
					jieguo[i]=(m+n);
					System.out.print((i+1)+":"+m+o+n+"="+"    ");
					j++;
					}
					else{
						i--;
					}
					}else{
					o='-';
					if(m-n>0){
						jieguo[i]=(m-n);
						System.out.print((i+1)+":"+m+o+n+"="+"    ");
					j++;
						}
						else{
							i--;
						}	
				    }
				if(j==5){
					System.out.println("");
					j=0;
				}
			}
			
		}
	}

