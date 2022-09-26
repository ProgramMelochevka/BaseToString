package by.home.maxzzzit;

// Переопределение класса toString!
public class BaseToString {
	double myZnach = 6_543.21;
	public static void main(String[]args) {
		BaseToString bts = new BaseToString();
		System.out.println(bts.toString());
	}
	@Override
	public String toString() {
		return "My value wase = "+myZnach+" #";
	}
	
	// Это базовый класс!
//    public String toString() {
//        return getClass().getName() + "@" + Integer.toHexString(hashCode());
//    }
	
}
