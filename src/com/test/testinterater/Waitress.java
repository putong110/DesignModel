package com.test.testinterater;

public class Waitress {

	//煎饼屋菜单
     PancakeHouseMenu pancakeHouseMenu;
     //餐厅菜单
     DinerMenu dinerMenu;
     
     //在构造器中，女招待照顾两个菜单
     public Waitress(PancakeHouseMenu pancakeHouseMenu,DinerMenu dinerMenu){
         this.pancakeHouseMenu = pancakeHouseMenu;
         this.dinerMenu = dinerMenu;
     }
     
     public void printMenu(){
         Interator pancakeIterator = pancakeHouseMenu.createIterator();
         Interator dinerIterator = dinerMenu.createIterator();
         
         System.out.println("MENU:\n----\nBREAKFAST");
         //打印煎饼屋菜单
         printMenu(pancakeIterator);
         System.out.println("\nLUNCH");
         //打印餐厅菜单
         printMenu(dinerIterator);
     }
 
 
     /**
     * 打印菜单
     * @Description:  
     * @param iterator 
     * @author xingle
     * @date 2014年8月1日 下午3:29:11
     */
     private void printMenu(Interator iterator) {
         while(iterator.hasNext()){
             MenuItem menuItem = (MenuItem) iterator.next();
             System.out.println("名称："+menuItem.getName()+",");
             System.out.println("价格："+menuItem.getPrice()+",");
             System.out.println("描述："+menuItem.getDescription());
             System.out.println("");
         }
     }
     

}
