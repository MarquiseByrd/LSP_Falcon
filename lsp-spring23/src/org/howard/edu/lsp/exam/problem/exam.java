package org.howard.edu.lsp.exam.problem;
import java.util.*;

public class exam
{
	private Map<String,Set<String>> map = new HashMap<String , Set<String>>();
	public void addSong(String genre , String songTitle)
	{
		if(!map.containsKey(genre))
		{		
			map.put(genre, new HashSet<String>());
		}
		map.get(genre).add(songTitle);
	}
	
	public String getGenreOfSong(String songTitle)
	{
		for(Map.Entry<String,Set<String>> s : map.entrySet())
		{
			if(s.getValue().contains(songTitle))
			{
				return s.getKey();}
			}
		return null;
	}
	exam(){}
	
	public static void main(String[] args)
	{
		exam sd = new exam();
		sd.addSong("Grenade", "Pop");
		sd.addSong("Who Needs Love", "Rap");
		System.out.println("Grenade genre is " + sd.getGenreOfSong("Grenade"));
		System.out.println("Who Needs Love" + sd.getGenreOfSong("Who Needs Love"));
	}
}