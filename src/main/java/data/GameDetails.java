package data;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@ToString
public class GameDetails {
	public int id;
	public String name, details, photoLink, gameLink;	
}

