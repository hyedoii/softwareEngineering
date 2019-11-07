public class HomeTheaterFacade {
	Amplifier amp;
	DvdPlayer dvd;
	Projector projector;
	Screen screen;

	public HomeTheaterFacade(Amplifier amp, DvdPlayer dvd, Projector projector, Screen screen) {
		this.amp = amp;
		this.dvd = dvd;
		this.projector = projector;
		this.screen = screen;
	}

	public void watchMovie(String movie) {
		System.out.println("Get ready to watch a movie...");
		screen.down();
		projector.on();
		projector.wideScreenMode();
		amp.on();
		amp.setDvd(dvd);
		amp.setSurroundSound();
		amp.setVolume(5);
		dvd.on();
		dvd.play(movie);
	}

	public void endMovie() {
		System.out.println("Shutting movie theater down...");
		screen.up();
		projector.off();
		amp.off();
		dvd.stop();
		dvd.eject();
		dvd.off();
	}
}