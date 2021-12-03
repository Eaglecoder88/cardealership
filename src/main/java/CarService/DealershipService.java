package CarService;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Service;

@Service
public class DealershipService extends Listing {

	List<Listing> activeList = new ArrayList<>();

	public List<Listing> listAll() {
		return activeList;
	}

	public int calcListingAge(LocalDate dateListed) {
		int listingAge = (int) ChronoUnit.DAYS.between(dateListed, LocalDate.now());
		return listingAge;
	}

	public Listing FindByVin(int Vin) {
		Listing display = new Listing();
		for (Listing item : activeList) {
			int displayItem = item.vehicle.getVin();
			if (Vin == displayItem) {
				display = item;
				return display;
			}
		}
		return null;
	}

	@PostConstruct
	public void defaultListing() {
		Listing listing1 = new Listing();
		listing1.setDateListed(LocalDate.of(2021, 11, 11));
		listing1.setListingAge(0);
		listing1.setVehicle(new Vehicle(12345, Nissan, Pathfinder, New, 10, 2021, maroon, 45, 000,
				"assets/imgNissan_Pathfinder.jpg"));

		Listing listing2 = new Listing();
		listing2.setDateListed(LocalDate.of(2021, 11, 11));
		listing2.setListingAge(0);
		listing2.setVehicle(new Vehicle(12346, Honda, e - 5, New, 20, 2022, silver, 25500, "assets/imgHonda_e5.jpg"));

		Listing listing3 = new Listing();
		listing3.setDateListed(LocalDate.of(2021, 11, 11));
		listing3.setListingAge(0);
		listing3.setVehicle(
				new Vehicle(12347, Nissan, Maxima, New, 15, 2022, pearl, 41536, "assets/imgNissan_maxima.jpg"));

		Listing listing4 = new Listing();
		listing4.setDateListed(LocalDate.of(2021, 11, 11));
		listing4.setListingAge(0);
		listing4.setVehicle(new Vehicle(12348, Acura, Nsx, New, 8, 2022, black, 55490, "assets/imgAcura_Nsx.jpg"));

		Listing listing5 = new Listing();
		listing5.setDateListed(LocalDate.of(2021, 11, 11));
		listing5.setListingAge(0);
		listing5.setVehicle(new Vehicle(12349, Acura, TLX, New, 14, 2021, Awesome, 38900, "assets/imgAcura_TLX.jpg"));

		Listing listing6 = new Listing();
		listing6.setDateListed(LocalDate.of(2021, 11, 11));
		listing6.setListingAge(0);
		listing6.setVehicle(new Vehicle(123450, Chevy, Volte, New, 5, 2022, Ice, 19600, "assets/imgChevy_Volte.jpg"));

		Listing listing7 = new Listing();
		listing7.setDateListed(LocalDate.of(2021, 11, 11));
		listing7.setListingAge(0);
		listing7.setVehicle(
				new Vehicle(123451, Honda, SUVE, New, 12, 2022, platinum, 37248, "assets/imgHonda_SUVE.jpg"));

		Listing listing8 = new Listing();
		listing8.setDateListed(LocalDate.of(2021, 11, 11));
		listing8.setListingAge(0);
		listing8.setVehicle(new Vehicle(123452, Suzuki, GSX, New, 7, 2021, white, 14978, "assets/imgSuzuki_GSX.jpg"));

		Listing listing9 = new Listing();
		listing9.setDateListed(LocalDate.of(2021, 11, 11));
		listing9.setListingAge(0);
		listing9.setVehicle(new Vehicle(123453, Suzuki, BoulevardM109R, New, 2, 2022, Blue, 22791,
				"assets/imgSuzuki_BoulevardM109R.jpg"));

		Listing listing10 = new Listing();
		listing10.setDateListed(LocalDate.of(2021, 11, 11));
		listing10.setListingAge(0);
		listing10.setVehicle(
				new Vehicle(123454, Suzuki, Cruiser, Used, 3350, 2020, navy, 12221, "assets/imgSuzuki_Cruiser.jpg"));

		activeList.add(listing1);
		activeList.add(listing2);
		activeList.add(listing3);
		activeList.add(listing4);
		activeList.add(listing5);
		activeList.add(listing6);
		activeList.add(listing7);
		activeList.add(listing8);
		activeList.add(listing9);
		activeList.add(listing10);

		for (Listing item : activeList) {
			int age = (int) ChronoUnit.DAYS.between(item.getDateListed(), LocalDate.now());
			System.out.println(age);
			item.setListingAge(age);
		}
	}

	public List<Listing> allCars() {
		return activeList;
	}

public List<Listing>searchAllCars(String search) {
	List<Listing> results = new ArrayList<Listing>();
	for(Listing vehicle: activeList) {
		if(vehicle.getModel().equalsIgnoreCase(search) || listing.vehicle.getModel().equalsIgnoreCase(search) || listing.vehicle.getMake().equalsIgnoreCase(search)) {
					results.add(listing);
		}
	}
			return results;
}

	public ArrayList<Listing> bidlist() {
		ArrayList<Listing> filteredList = new ArrayList<Listing>();
		for (Listing loopedListing : listAll()) {
			if (loopedListing.olderThen120()) {
				filteredList.add(loopedListing);
			}
		}
		return filteredList;

	}
}