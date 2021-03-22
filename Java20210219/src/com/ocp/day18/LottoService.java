package com.ocp.day18;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;

public class LottoService {
	public static Set<Integer> get539(){
		Set<Integer> lotto = new LinkedHashSet<Integer>();
		while(lotto.size()<5) {
			lotto.add(new Random().nextInt(39)+1);
		}
		return lotto;
	}
	public static List<Integer> get4Stars(){
		List<Integer> lotto = new ArrayList<Integer>();
		for(int i=0;i<4;i++) {
			lotto.add(new Random().nextInt(10));
		}
		return lotto;
	}
}
