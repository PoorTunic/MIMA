package iut.org.nantes.factories;

import java.util.List;

import org.springframework.data.mongodb.core.mapping.Document;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonPropertyOrder({ "codeinseecommune", "commune", "type", "location" })
@Document(collection="monuments")
public class Monument {

	@JsonProperty("codeinseecommune")
	String codeinseecommune;
	@JsonProperty("commune")
	String commune;
	@JsonProperty("type")
	String type;
	@JsonProperty("location")
	List<String> location;
	@JsonProperty("visited")
	boolean visited;

	public Monument(String codeinseecommune, String commune, String type, List<String> location, boolean visited) {
		super();
		this.codeinseecommune = codeinseecommune;
		this.commune = commune;
		this.type = type;
		this.location = location;
		this.visited = visited;
	}

	public Monument() {

	}

	public Monument(List<String> coordinates) {
		this.location = coordinates;
	}

	public String getCodeinseecommune() {
		return codeinseecommune;
	}

	public void setCodeinseecommune(String codeinseecommune) {
		this.codeinseecommune = codeinseecommune;
	}

	public String getCommune() {
		return commune;
	}

	public void setCommune(String commune) {
		this.commune = commune;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public List<String> getLocation() {
		return location;
	}

	public void setLocation(List<String> location) {
		this.location = location;
	}

	public boolean isVisited() {
		return visited;
	}

	public void setVisited(boolean visited) {
		this.visited = visited;
	}

	@Override
	public String toString() {
		return "Monument [codeinseecommune=" + codeinseecommune + ", commune=" + commune + ", type=" + type
				+ ", location=" + location + "]";
	}
}
