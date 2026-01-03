package collectionFrameWork.wildCardGenerics;

import java.util.ArrayList;

public class AnamCollection<String> extends ArrayList<String> {

	@Override
	public void add(int index, String element) {

		if (element == null) {
			throw new NotNullException("data can not be null");
		}

		super.add(index, element);
	}

	@Override
	public boolean add(String e) {

		if (e == null) {
			throw new NotNullException("data can not be null");
		}
		return super.add(e);
	}
}
