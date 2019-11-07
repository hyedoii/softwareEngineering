public class HomeTheaterTest {
	public static void main(String[] args) {
		Amplifier amp = new Amplifier("Amplifier");
		DvdPlayer dvd = new DvdPlayer("DVD Player", amp);
		Projector projector = new Projector("Projector", dvd);
		Screen screen = new Screen("Theater Screen");
		HomeTheaterFacade homeTheater = new HomeTheaterFacade(amp, dvd, projector, screen);
		homeTheater.watchMovie("Along with the Gods");
		homeTheater.endMovie();
	}
}