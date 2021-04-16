package com.ocp.day18;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;
import java.util.stream.Collectors;

public class LottoService {
	public static Set get539() {
		Set<Integer> lotto = new LinkedHashSet<Integer>();
		Random r = new Random();
		while (lotto.size() < 6) {
			lotto.add(r.nextInt(39) + 1);
		}
		Iterator<Integer> iter = lotto.iterator();
		while (iter.hasNext()) {
			Integer next = (Integer) iter.next();
			System.out.println(next);
		}
		Set setLottoSet = lotto.stream().map(s -> s < 10 ? "0" + s : s).collect(Collectors.toSet());
		return setLottoSet;
	}

	public static List<Integer> get4Stars() {
		List<Integer> lotto = new ArrayList<Integer>();
		for (int i = 0; i < 4; i++) {
			lotto.add(new Random().nextInt(10));
		}
		return lotto;
	}
}
