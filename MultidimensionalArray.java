public class MultidimensionalArray{
public static void main(String...args){

int [][] arrOne = {
	{1, 2, 3},
	{2, 3, 4},
	{5, 6, 7}
	};

int [][] arrTwo = {
	{2, 3, 4},
	{7, 3, 4},
	{8, 9, 4}
	};

int [][] conacatenatedArray = new int [6][6];
int[] numberOfFirstArray = new int[9];
int [] numberOfSecondArray = new int [9];

for(int count = 0; count < arrOne.length; count++){
for(int counter = 0; counter < arrOne[0].length; counter++){
	numberOfFirstArray = ([count[counter]);
	conacatenatedArray = [numberOfFirstArray][6];
	
	}
}

for(int count = 0; count < arrTwo.length; count++){
for(int counter = 0; counter < arrTwo[0].length; counter++){
	numberOfSecondArray = ([count][counter]);
	conacatenatedArray = [numberOfFirstArray][numberOfFirstArray];
	}
	}










}


}