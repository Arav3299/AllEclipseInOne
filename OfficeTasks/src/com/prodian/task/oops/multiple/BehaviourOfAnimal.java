package com.prodian.task.oops.multiple;

public class BehaviourOfAnimal implements Eat,Sound{

	@Override
	public void eat(String food) {
		System.out.println(food);
		
	}

	@Override
	public void sound(String sound) {
		System.out.println(sound);
		
	}

}
