package est.com;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("iterativo: "+siterativaFibonacci(10));
		System.out.println("recursivo: "+srecursivaFibonacci(10));
		System.out.println("cambio orden: "+cOrden(100));
		

	}



		
		

	
public static int siterativaFibonacci(int n){
	int finf=0;
	int fsup=1;
	int f=0;
	if (n<=1){
		return n;
	}
	else {for (int i=2;i<=n;i++){
	f=finf+fsup;
	finf=fsup;
	fsup=f;
	}
	}
	return f;
	
}
public static int srecursivaFibonacci(int n){
	if (n<=1){
		return n;
	}
	else {
		return srecursivaFibonacci(n-1)+srecursivaFibonacci(n-2);
	}
}
public static  String cOrden (int n)
{String r="";
if (n <10)      
    return r+=n;
else {
	int f=n;
	r+=(f%10);		 
     r+=cOrden (f / 10); 
     } 
     return r;
}}

