package suanshu;

import java.util.Random;

public class Suanshu {
	static void printHeader() {
		System.out.print("本程序说明如下");
		System.out.println();
	}
	static int[] generateEquations() {
		char [][] sh=new char[50][3];
		int [] jieguo=new int[100];
		short m=0,n=0,ov=0;
		char o;
		Random random=new Random();//dsolfj
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
				System.out.print((i+1)+":"+m+o+n+"="+"   ");
				sh[i][0]=(char)m;
				sh[i][1]=(char)ov;
				sh[i][2]=(char)n;
				j++;
				}
				else{
					i--;
				}
				}else{
				o='-';
				if(m-n>0){
					jieguo[i]=(m-n);
					System.out.print((i+1)+":"+m+o+n+"="+"   ");
					sh[i][0]=(char)m;
					sh[i][1]=(char)ov;
					sh[i][2]=(char)n;
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
			for(int x=0;x<50;x++) {
				for(int y=x+1;y<50;y++) {
					if(sh[x]==sh[y]){
					i--;
					}
				}
			}
		}
		
		return jieguo;
	}
	static void printExercise() {
		System.out.print("输出算式答案：");
	}
	static void printjieguo(int jieguo []) {
		System.out.println();
		for(int x=0;x<50;x++) {
			System.out.print((x+1)+"："+jieguo[x]+"\t");
		if((x+1)%5==0) {
			System.out.println("");
		}
		}
	}
	public static void main(String[] args){
		printHeader();
		int [] a=new int[50];
		a=generateEquations();
		printExercise();
		printjieguo(a);	
	}
}
