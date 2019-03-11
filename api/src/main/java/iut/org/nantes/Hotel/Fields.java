
package iut.org.nantes.Hotel;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "departement", "commtel", "ouverturealannee", "codepostal", "labelsclassement", "modepaiement",
		"adresse2", "languesparleesaccueil", "ouverturegranule", "latitude", "type", "capacitenbchambres",
		"animauxinfo", "commune", "categorie", "tarifs", "nomoffre", "localisation", "commfax", "codeinseecommune",
		"animauxacceptes", "longitude", "ouverture24", "commweb", "equipements", "labelschaines",
		"capacitenbchambresmobreduite", "adresse3", "capacitenbchambresfamiliales", "labelsclassementlogis",
		"resadirecte", "salledereunion", "labels", "commmob", "accueilgroupe" })
public class Fields {

	@JsonProperty("departement")
	private String departement;
	@JsonProperty("commtel")
	private String commtel;
	@JsonProperty("ouverturealannee")
	private String ouverturealannee;
	@JsonProperty("codepostal")
	private String codepostal;
	@JsonProperty("labelsclassement")
	private String labelsclassement;
	@JsonProperty("modepaiement")
	private String modepaiement;
	@JsonProperty("adresse2")
	private String adresse2;
	@JsonProperty("languesparleesaccueil")
	private String languesparleesaccueil;
	@JsonProperty("ouverturegranule")
	private String ouverturegranule;
	@JsonProperty("latitude")
	private Double latitude;
	@JsonProperty("type")
	private String type;
	@JsonProperty("capacitenbchambres")
	private Integer capacitenbchambres;
	@JsonProperty("animauxinfo")
	private String animauxinfo;
	@JsonProperty("commune")
	private String commune;
	@JsonProperty("categorie")
	private String categorie;
	@JsonProperty("tarifs")
	private String tarifs;
	@JsonProperty("nomoffre")
	private String nomoffre;
	@JsonProperty("localisation")
	private List<Double> localisation = null;
	@JsonProperty("commfax")
	private String commfax;
	@JsonProperty("codeinseecommune")
	private String codeinseecommune;
	@JsonProperty("animauxacceptes")
	private String animauxacceptes;
	@JsonProperty("longitude")
	private Double longitude;
	@JsonProperty("ouverture24")
	private String ouverture24;
	@JsonProperty("commweb")
	private String commweb;
	@JsonProperty("equipements")
	private String equipements;
	@JsonProperty("labelschaines")
	private String labelschaines;
	@JsonProperty("capacitenbchambresmobreduite")
	private Integer capacitenbchambresmobreduite;
	@JsonProperty("adresse3")
	private String adresse3;
	@JsonProperty("capacitenbchambresfamiliales")
	private Integer capacitenbchambresfamiliales;
	@JsonProperty("labelsclassementlogis")
	private String labelsclassementlogis;
	@JsonProperty("resadirecte")
	private String resadirecte;
	@JsonProperty("salledereunion")
	private String salledereunion;
	@JsonProperty("labels")
	private String labels;
	@JsonProperty("commmob")
	private String commmob;
	@JsonProperty("accueilgroupe")
	private String accueilgroupe;
	@JsonIgnore
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();

	@JsonProperty("departement")
	public String getDepartement() {
		return departement;
	}

	@JsonProperty("departement")
	public void setDepartement(String departement) {
		this.departement = departement;
	}

	@JsonProperty("commtel")
	public String getCommtel() {
		return commtel;
	}

	@JsonProperty("commtel")
	public void setCommtel(String commtel) {
		this.commtel = commtel;
	}

	@JsonProperty("ouverturealannee")
	public String getOuverturealannee() {
		return ouverturealannee;
	}

	@JsonProperty("ouverturealannee")
	public void setOuverturealannee(String ouverturealannee) {
		this.ouverturealannee = ouverturealannee;
	}

	@JsonProperty("codepostal")
	public String getCodepostal() {
		return codepostal;
	}

	@JsonProperty("codepostal")
	public void setCodepostal(String codepostal) {
		this.codepostal = codepostal;
	}

	@JsonProperty("labelsclassement")
	public String getLabelsclassement() {
		return labelsclassement;
	}

	@JsonProperty("labelsclassement")
	public void setLabelsclassement(String labelsclassement) {
		this.labelsclassement = labelsclassement;
	}

	@JsonProperty("modepaiement")
	public String getModepaiement() {
		return modepaiement;
	}

	@JsonProperty("modepaiement")
	public void setModepaiement(String modepaiement) {
		this.modepaiement = modepaiement;
	}

	@JsonProperty("adresse2")
	public String getAdresse2() {
		return adresse2;
	}

	@JsonProperty("adresse2")
	public void setAdresse2(String adresse2) {
		this.adresse2 = adresse2;
	}

	@JsonProperty("languesparleesaccueil")
	public String getLanguesparleesaccueil() {
		return languesparleesaccueil;
	}

	@JsonProperty("languesparleesaccueil")
	public void setLanguesparleesaccueil(String languesparleesaccueil) {
		this.languesparleesaccueil = languesparleesaccueil;
	}

	@JsonProperty("ouverturegranule")
	public String getOuverturegranule() {
		return ouverturegranule;
	}

	@JsonProperty("ouverturegranule")
	public void setOuverturegranule(String ouverturegranule) {
		this.ouverturegranule = ouverturegranule;
	}

	@JsonProperty("latitude")
	public Double getLatitude() {
		return latitude;
	}

	@JsonProperty("latitude")
	public void setLatitude(Double latitude) {
		this.latitude = latitude;
	}

	@JsonProperty("type")
	public String getType() {
		return type;
	}

	@JsonProperty("type")
	public void setType(String type) {
		this.type = type;
	}

	@JsonProperty("capacitenbchambres")
	public Integer getCapacitenbchambres() {
		return capacitenbchambres;
	}

	@JsonProperty("capacitenbchambres")
	public void setCapacitenbchambres(Integer capacitenbchambres) {
		this.capacitenbchambres = capacitenbchambres;
	}

	@JsonProperty("animauxinfo")
	public String getAnimauxinfo() {
		return animauxinfo;
	}

	@JsonProperty("animauxinfo")
	public void setAnimauxinfo(String animauxinfo) {
		this.animauxinfo = animauxinfo;
	}

	@JsonProperty("commune")
	public String getCommune() {
		return commune;
	}

	@JsonProperty("commune")
	public void setCommune(String commune) {
		this.commune = commune;
	}

	@JsonProperty("categorie")
	public String getCategorie() {
		return categorie;
	}

	@JsonProperty("categorie")
	public void setCategorie(String categorie) {
		this.categorie = categorie;
	}

	@JsonProperty("tarifs")
	public String getTarifs() {
		return tarifs;
	}

	@JsonProperty("tarifs")
	public void setTarifs(String tarifs) {
		this.tarifs = tarifs;
	}

	@JsonProperty("nomoffre")
	public String getNomoffre() {
		return nomoffre;
	}

	@JsonProperty("nomoffre")
	public void setNomoffre(String nomoffre) {
		this.nomoffre = nomoffre;
	}

	@JsonProperty("localisation")
	public List<Double> getLocalisation() {
		return localisation;
	}

	@JsonProperty("localisation")
	public void setLocalisation(List<Double> localisation) {
		this.localisation = localisation;
	}

	@JsonProperty("commfax")
	public String getCommfax() {
		return commfax;
	}

	@JsonProperty("commfax")
	public void setCommfax(String commfax) {
		this.commfax = commfax;
	}

	@JsonProperty("codeinseecommune")
	public String getCodeinseecommune() {
		return codeinseecommune;
	}

	@JsonProperty("codeinseecommune")
	public void setCodeinseecommune(String codeinseecommune) {
		this.codeinseecommune = codeinseecommune;
	}

	@JsonProperty("animauxacceptes")
	public String getAnimauxacceptes() {
		return animauxacceptes;
	}

	@JsonProperty("animauxacceptes")
	public void setAnimauxacceptes(String animauxacceptes) {
		this.animauxacceptes = animauxacceptes;
	}

	@JsonProperty("longitude")
	public Double getLongitude() {
		return longitude;
	}

	@JsonProperty("longitude")
	public void setLongitude(Double longitude) {
		this.longitude = longitude;
	}

	@JsonProperty("ouverture24")
	public String getOuverture24() {
		return ouverture24;
	}

	@JsonProperty("ouverture24")
	public void setOuverture24(String ouverture24) {
		this.ouverture24 = ouverture24;
	}

	@JsonProperty("commweb")
	public String getCommweb() {
		return commweb;
	}

	@JsonProperty("commweb")
	public void setCommweb(String commweb) {
		this.commweb = commweb;
	}

	@JsonProperty("equipements")
	public String getEquipements() {
		return equipements;
	}

	@JsonProperty("equipements")
	public void setEquipements(String equipements) {
		this.equipements = equipements;
	}

	@JsonProperty("labelschaines")
	public String getLabelschaines() {
		return labelschaines;
	}

	@JsonProperty("labelschaines")
	public void setLabelschaines(String labelschaines) {
		this.labelschaines = labelschaines;
	}

	@JsonProperty("capacitenbchambresmobreduite")
	public Integer getCapacitenbchambresmobreduite() {
		return capacitenbchambresmobreduite;
	}

	@JsonProperty("capacitenbchambresmobreduite")
	public void setCapacitenbchambresmobreduite(Integer capacitenbchambresmobreduite) {
		this.capacitenbchambresmobreduite = capacitenbchambresmobreduite;
	}

	@JsonProperty("adresse3")
	public String getAdresse3() {
		return adresse3;
	}

	@JsonProperty("adresse3")
	public void setAdresse3(String adresse3) {
		this.adresse3 = adresse3;
	}

	@JsonProperty("capacitenbchambresfamiliales")
	public Integer getCapacitenbchambresfamiliales() {
		return capacitenbchambresfamiliales;
	}

	@JsonProperty("capacitenbchambresfamiliales")
	public void setCapacitenbchambresfamiliales(Integer capacitenbchambresfamiliales) {
		this.capacitenbchambresfamiliales = capacitenbchambresfamiliales;
	}

	@JsonProperty("labelsclassementlogis")
	public String getLabelsclassementlogis() {
		return labelsclassementlogis;
	}

	@JsonProperty("labelsclassementlogis")
	public void setLabelsclassementlogis(String labelsclassementlogis) {
		this.labelsclassementlogis = labelsclassementlogis;
	}

	@JsonProperty("resadirecte")
	public String getResadirecte() {
		return resadirecte;
	}

	@JsonProperty("resadirecte")
	public void setResadirecte(String resadirecte) {
		this.resadirecte = resadirecte;
	}

	@JsonProperty("salledereunion")
	public String getSalledereunion() {
		return salledereunion;
	}

	@JsonProperty("salledereunion")
	public void setSalledereunion(String salledereunion) {
		this.salledereunion = salledereunion;
	}

	@JsonProperty("labels")
	public String getLabels() {
		return labels;
	}

	@JsonProperty("labels")
	public void setLabels(String labels) {
		this.labels = labels;
	}

	@JsonProperty("commmob")
	public String getCommmob() {
		return commmob;
	}

	@JsonProperty("commmob")
	public void setCommmob(String commmob) {
		this.commmob = commmob;
	}

	@JsonProperty("accueilgroupe")
	public String getAccueilgroupe() {
		return accueilgroupe;
	}

	@JsonProperty("accueilgroupe")
	public void setAccueilgroupe(String accueilgroupe) {
		this.accueilgroupe = accueilgroupe;
	}

	@JsonAnyGetter
	public Map<String, Object> getAdditionalProperties() {
		return this.additionalProperties;
	}

	@JsonAnySetter
	public void setAdditionalProperty(String name, Object value) {
		this.additionalProperties.put(name, value);
	}

}
