package designpattern.Structural_Pattern.Composite;

/*
 * 组合模式:组合多个对象以表示"整体-部分"的层次结构
 *可以简单的理解成，将整体和部分组合到一起，形成一个新的整体(树的结点也是一颗树)
 * 
 * 感觉更像数据结构。
 * 
 * 优点:扩展性好，封装性好
 * 
 * 缺点:设计复杂，而且由于利用递归，会导致有额外开销（个人觉得不算缺点）
 *
 * 额外加一个盘子:实验可知MyElement中添加盘子的方法有一样的效果，那为什么推荐加一个盘子呢
 * 			这样苹果里面就不能塞苹果了 ->_->
 * 			将整体的功能和部分的功能分开了。
 * */


public class Main {
	public static void main(String[] args) {
		// 有一个小盘子
		Plate plate = new Plate();
		plate.add(new Banana());	// 里面有一个香蕉和一个苹果
		plate.add(new Apple());
		
		// 然后把小盘子装到大盘子里
		Plate bigPlate = new Plate();	
		bigPlate.add(plate);		// 少了点什么，再加一只梨
		bigPlate.add(new Pear());
		
		// 然后把大盘子给吃了
		bigPlate.eat();
	}
}
