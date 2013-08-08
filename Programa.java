public class Programa{
	public static void main(String[] args){
		Calculos uno = new Calculos();

		uno.setA(2);
		uno.setB(3);
		uno.setNum(10);
		uno.setAcum(1);

		uno.Resolver();
		System.out.println(uno.getAcum());

		System.out.println(uno.getCont());
		
		
	}
}