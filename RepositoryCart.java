package com.java.cartrepository;

import java.util.Arrays;
import java.util.List;
import com.java.entity.*;
public class RepositoryCart {

	
	public static List<Products> getProducts(){
		
		Products products1=new Products();
		products1.setProductname("mobile");
		products1.setProductdescription("Iphone10");
		products1.setProductid(1234);
		
		
		Products products2 = new Products();
		
		products2.setProductname("redmi");
		products2.setProductdescription("9i mobile");
		products2.setProductid(5678);
		

//		Products products3 = new Products();
//		
//		products3.setProductname("mobile");
//		products3.setProductdescription("samsung");
//		products3.setProductid(8901);
//		
		
		Delivery delivery1 = new Delivery();
		delivery1.setDeliveryto("ayush");
		delivery1.setDeliverynumber(1);
		delivery1.setDeliveryaddress("india");
		

		Delivery delivery2 = new Delivery();
		delivery2.setDeliveryto("adi");
		delivery2.setDeliverynumber(2);
		delivery2.setDeliveryaddress("jbp");
		
		
		Order order1 = new Order();
		order1.setOrderby("ayush");
		order1.setOrderid(1);
		order1.setOrdernumber(2);
		order1.setProducts(Arrays.asList(new Products[] {products1}));
		
		Order order2 = new Order();
		order2.setOrderby("muni");
		order2.setOrderid(2);
		order2.setOrdernumber(3);
		order2.setProducts(Arrays.asList(new Products[] {products2}));
		
		Review review1 = new Review();
		review1.setRating(5);
		review1.setReviewby("yash");
		review1.setReviewcomment("nice products");
		
		Review review2 = new Review();
		review2.setRating(8);
		review2.setReviewby("ak");
		review2.setReviewcomment("great");
		
		return Arrays.asList(new Products[] {products1, products2});
		
		
		
		
		
		
		

		
		
		
		
		
	}
}
