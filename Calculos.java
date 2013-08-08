public class Calculos
{
	private Integer a;
	private Integer b;
	private Integer num;
	private Integer acum;
	private Integer cont = 0;

	public void setA(Integer a)
	{
		this.a = a;
	}
	public Integer getA()
	{
		return a;
	}
	public void setB(Integer b)
	{
		this.b = b;
	}
	public Integer getB()
	{
		return b;
	}

	public void setAcum(Integer acum)
	{
		this.acum = acum;
	}
	public Integer getAcum()
	{
		return acum;
	}

	public void setNum(Integer num)
	{
		this.num = num;
	}

	public Integer getNum()
	{
		return num;
	}

	public Integer Multiplicar()
	{
		acum = acum *a;
		return acum;
	}

	public Integer Dividir()
	{
		acum = acum / b;
		return acum;
	}

	public void Resolver(){
		while(acum != num){
			if(acum < num){
				Multiplicar();
				cont++;
			}else{
				Dividir();
				cont++;
			}
		}
		
	}

	public Integer getCont()
	{
		return cont;
	}
}