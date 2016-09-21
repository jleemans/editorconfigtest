package editorconfigtest;

public class TowersOfHanoi {

	public static void main(String[] args) {
		int nrDisks = 3;
		System.out.printf("Moving %s disks from tower 1 to 3:%n", nrDisks);
		move(nrDisks, 1, 3, 2);
	}

	private static void move(int nrDisks, int srcTower, int dstTower, int hlpTower) {
		if (nrDisks == 1) {
			System.out.printf("%s -> %s%n", srcTower, dstTower);
		} else {
			move(nrDisks - 1, srcTower, hlpTower, dstTower);
			move(1, srcTower, dstTower, hlpTower);
			move(nrDisks - 1, hlpTower, dstTower, srcTower);
		}
	}
}
