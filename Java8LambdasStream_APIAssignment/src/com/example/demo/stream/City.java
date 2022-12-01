package com.example.demo.stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.NoSuchElementException;

public class City {

	private int cityid;
	private String cityname;
	private float pollutionIndex;
	private int population;
	private int area_of_city;
	private State objState;
	
	public City(int cityid, String cityname, float pollutionIndex, int population, int area_of_city, State objState) {
		super();
		this.cityid = cityid;
		this.cityname = cityname;
		this.pollutionIndex = pollutionIndex;
		this.population = population;
		this.area_of_city = area_of_city;
		this.objState = objState;
	}

	public int getCityid() {
		return cityid;
	}

	public void setCityid(int cityid) {
		this.cityid = cityid;
	}

	public String getCityname() {
		return cityname;
	}

	public void setCityname(String cityname) {
		this.cityname = cityname;
	}

	public float getPollutionIndex() {
		return pollutionIndex;
	}

	public void setPollutionIndex(float pollutionIndex) {
		this.pollutionIndex = pollutionIndex;
	}

	public int getPopulation() {
		return population;
	}

	public void setPopulation(int population) {
		this.population = population;
	}

	public int getArea_of_city() {
		return area_of_city;
	}

	public void setArea_of_city(int area_of_city) {
		this.area_of_city = area_of_city;
	}

	public State getObjState() {
		return objState;
	}

	public void setObjState(State objState) {
		this.objState = objState;
	}

	@Override
	public String toString() {
		return "City [cityid=" + cityid + ", cityname=" + cityname + ", pollutionIndex=" + pollutionIndex
				+ ", population=" + population + ", area_of_city=" + area_of_city + ", objState=" + objState + "]";
	}
	
	
	public static void main(String[] args) {
		State state= new State();
		City c1= new City(1, "Pune", 11, 400000, 400, state);
		City c2= new City(2, "Nashik", 12, 500000, 600, state);
		City c3= new City(3, "Mumbai", 13, 600000, 800, state);
		City c4= new City(4, "Nagpur", 14, 700000, 900, state);
		
		
		List<City> list= Arrays.asList(c1,c2,c3,c4);
		
		System.out.println("\n"+list);
		//1. WAP to find the city with less area and highest population
		
		//2. WAP to find the city with high pollution_index and high city area.
		
		
			City city2 = list.stream().max(Comparator.comparing(City::getPollutionIndex)).orElseThrow(NoSuchElementException::new);
		
			City city3 = list.stream().max(Comparator.comparing(City::getArea_of_city)).orElseThrow(NoSuchElementException::new);
			
		     System.out.println("high pollution_index \n"+city2.pollutionIndex);
		     System.out.println("high city area: \n"+city3.area_of_city);
		
		
	}
	
}
