package com.niit;

import java.util.ArrayList;
import java.util.List;

public class App {

	public static void main(String[] args) {
		RoutesInfo routesInfo = new RoutesInfo();
		List< List<String> > data = new ArrayList<>();
		data = routesInfo.displayDetails();
		
		/*---------------Task 2 ------------*/
		
		DirectRouteFlights directRouteFlights = new DirectRouteFlights();
		directRouteFlights.showDirectFights(data, "New York");
		
		

	}

}
