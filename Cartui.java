package com.java.ui;

import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

import com.java.cartrepository.RepositoryCart;
import com.java.entity.*;

public class Cartui {
	
	public static void main(String args[]) {
		List<Products> productslist = RepositoryCart.getProducts();
		
		System.out.println("-------------Shopping App-------------");
		
		try(Scanner sc = new Scanner(System.in)){
			int count =1;
			for(Products products:productslist) {
				System.out.println(count + "."+products.getProductname());
				count++;
			}
			System.out.println("----select above category");
			System.out.println("Options");
			int option = sc.nextInt();
			Products selectProducts = productslist.get(option-1);
			count=1;
			for(Order order:selectProducts.getOrder()) {
				System.out.println(count +"."+order.getProducts());
			}
			System.out.println("Please select order");
			System.out.print("Option:");
			option=sc.nextInt();
			Order order = selectProducts.getOrder().get(option-1);
			count=1;
			for(Products products:order.getProducts()) {
				System.out.println(count+"."+products.getProductdescription());
				count++;
			}
			
			
			
			
		
			
		}catch(InputMismatchException  e) {
			System.err.println("Error Processing request please try again");
		}
	}

}
