package visitor;

public class VisitorMain
{
	public static void main(String[] args) 
	{
		Product banana=new Fruit("Banana", 3.4			, 3);
		Product book  =new Book ("12312" , "The Witcher", 70);
		
		ShoppingCartVisitor priceCalculator=new PriceCalculator();
		double bananaPrice=banana.accept(priceCalculator);
		double bookPrice=book	 .accept(priceCalculator);
	}
}
