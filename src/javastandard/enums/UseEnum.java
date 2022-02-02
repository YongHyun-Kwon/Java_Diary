package javastandard.enums;

enum Direction {
	EAST(1, ">"), SOUTH(2, "V"), WEST(3, "<"), NORTH(4, "^");

	private static final Direction[] DIR_ARR = Direction.values();
	private int value;
	private String symbol;
	
	Direction(int value, String symbol) {
		this.value = value;
		this.symbol= symbol;
	}
	
	public int getValue( ) { return value; }
	public String getSymbol( ) { return symbol; }
	
	public static Direction of(int dir) {
		if(dir < 1 || dir > 4) {
			throw new IllegalArgumentException("Invalid value :" + dir);
		}
		return DIR_ARR[dir - 1];
	}
	
	// 방향 회전 method
	public Direction rotate(int num) {
		num = num % 4;
		
		if( num < 0) num += 4; //음수일 때는 반대방향
		
		return DIR_ARR[(value-1 + num) % 4 ];
	}
	
	@Override
	public String toString() {
		return name() + getSymbol();
	}

}

public class UseEnum {

	public UseEnum() {

		Direction d1 = Direction.EAST;
		Direction d2 = Direction.valueOf("WEST");
		Direction d3 = Enum.valueOf(Direction.class, "EAST");

		System.out.println("d1=" + d1);
		System.out.println("d2=" + d2);
		System.out.println("d3=" + d3);

		System.out.println("d1==d2 ? " + (d1 == d2));
		System.out.println("d1==d3 ? " + (d1 == d3));
		System.out.println("d1.equals(d3) ? " + d1.equals(d3));
//		System.out.println("d2 > d3 ? " + (d1 > d3)); // 에러
		System.out.println("d1.compareTo(d3) ? " + d1.compareTo(d3));
		System.out.println("d1.compareTo(d2) ? " + d1.compareTo(d2));

		switch (d1) {
		case EAST: // Direction.EAST로 작성 불가
			System.out.println("The direction is EAST");
			break;

		case SOUTH:
			System.out.println("The direction is SOUTH");
			break;

		case WEST:
			System.out.println("The direction is WEST");
			break;

		case NORTH:
			System.out.println("The direction is NORTH");
			break;

		} // end switch

		d2 = Direction.of(1);
		
		System.out.printf("d1 = %s, %d\n", d1.name(), d1.getValue());
		System.out.printf("d2 = %s, %d\n", d2.name(), d2.getValue());
		
		System.out.println(Direction.EAST.rotate(1));
		System.out.println(Direction.EAST.rotate(2));
		System.out.println(Direction.EAST.rotate(-1));
		System.out.println(Direction.EAST.rotate(-2));
		
	} // UseEnum

	public static void main(String[] args) {

		new UseEnum();

	} // main

} // class
