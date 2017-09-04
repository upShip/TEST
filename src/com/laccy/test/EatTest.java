package com.laccy.test;

public class EatTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] menu = new String[] { "烩面", "拉面", "饼加串", "饸烙面", "米线", "羊汤", "咕咕鸡", "火锅", "重庆小面", "虾", "木桶饭", "热干面",
				"城南往事", "毛家菜", "砂锅面", "烤串", "沙县", "麻辣烫", "饺子", "焖面馄饨" };
		int index = (int) (Math.random() * menu.length);
		System.out.println("今天吃" + menu[index] + "吧。");
	}

}
