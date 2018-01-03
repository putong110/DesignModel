package com.test.testinterater;


public class DinerMenuIterator implements Interator{


	MenuItem[] items;
    //记录当前数组遍历的位置
    int position = 0;
    
    //构造器需要传入一个菜单项的数组当做参数
    public DinerMenuIterator(MenuItem[] items){
        this.items = items;
    }
    @Override
    public boolean hasNext() {
        if (position >= items.length || items[position] == null) {
            return false;
        } else {
            return true;
        }
    }

    @Override
    public Object next() {
        MenuItem menuItem = items[position];
        position = position + 1;
        return menuItem;
    }

}
