package Epic;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class HtoVPrinter {

	public static void main(String[] args) throws IOException {
		File file = new File("../Practice/src/Epic/input");
		List<String> sentencesFromFile = Utils.readFromFile(file);
		List<char[]> charList = new ArrayList<char[]>();
		for (String str : sentencesFromFile) {
			charList.add(str.toCharArray());
		}
		int maxLength = Utils.getMaxLengthOfCharArray(charList);
		for (int k = 0; k < Utils.getMaxLengthOfCharArray(charList); k++) {
			for (int chIndex = 0; chIndex < charList.size(); chIndex++) {
				try {
					if (charList.get(chIndex).length <= maxLength)
						System.out.print((charList.get(chIndex)[k] + " "));
				} catch (ArrayIndexOutOfBoundsException e) {
					System.out.print("  ");
					continue;
				}
			}
			System.out.println();
		}
	}
}
