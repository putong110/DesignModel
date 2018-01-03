package com.test.testinterater;

import java.util.ArrayList;

public class PancakeHouseMenu {

	ArrayList menuItems;
	
	public PancakeHouseMenu() {
		    // 使用ArrayList存储菜单项
		    menuItems = new ArrayList();
		
		    addItem("K&B's Pancake Breakfast",
		            "Pancakes with scrambled eggs, and toast", true, 2.99);
		
		    addItem("Regular Pancake Breakfast",
		            "Pancakes with fried eggs, sausage", false, 2.99);
		
		    addItem("Blueberry Pancakes", "Pancakes made with fresh blueberries",
		            true, 3.49);
		
		    addItem("Waffles",
		            "Waffles, with your choice of blueberries or strawberries",
		            true, 3.59);
		
		}
		
		// 加入一个菜单项：创建一个新的菜单项对象，加入ArrayList
		public void addItem(String name, String description, boolean vegetarian,
		        double price) {
		    MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
		    menuItems.add(menuItem);
		}
		
		//返回菜单项列表
		public ArrayList getMenuItems(){
		    return menuItems;
		}
		
		public Interator createIterator(){
		    return  new PancakeHouseMenuIterator(menuItems);
		}
		//其他方法。。。。
		    
		

}
