package comparator;

import java.util.Comparator;

import com.how2java.tmall.pojo.Product;

public class ProductAllComparator implements Comparator<Product>{

	@Override
	public int compare(Product p1, Product p2) {
		return p1.getReviewCount()*p1.getSaleCount()-p2.getReviewCount()*p2.getSaleCount();
	}

}
