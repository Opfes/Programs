public class discount
 {
	public static void main(String[] args)
	{
		double price = 59;
		double discountoffprice = ((price * 20) / 100);
		double saleprice = (price - discountoffprice);
		System.out.println(saleprice);
	}
}